import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) {
        launch(App.class,args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("MyApp");
        stage.show();
    }
}
