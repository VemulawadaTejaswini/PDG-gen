import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        if((number.charAt(0) == number.charAt(1) && number.charAt(1) == number.charAt(2)) ||
                (number.charAt(1) == number.charAt(2) && number.charAt(2) == number.charAt(3))
        ) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}