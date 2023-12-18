import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();
        if(X.equals("SUN")) {
            System.out.println(7);
            return;
        }
        if(X.equals("MON")) {
            System.out.println(6);
            return;
        }
        if(X.equals("TUE")) {
            System.out.println(5);
            return;
        }
        if(X.equals("WED")) {
            System.out.println(4);
            return;
        }
        if(X.equals("THU")) {
            System.out.println(3);
            return;
        }
        if(X.equals("FRI")) {
            System.out.println(2);
            return;
        }
        if(X.equals("SAT")) {
            System.out.println(1);
            return;
        }
        return;


    }
}
