import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        if(X.equals("ARC")){
            System.out.println("ABC");
        }else{
            System.out.println("ARC");
        }
    }
}
