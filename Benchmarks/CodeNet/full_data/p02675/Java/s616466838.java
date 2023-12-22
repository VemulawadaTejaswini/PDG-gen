import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int x = N % 10;
        if (x == 3) {
            System.out.println("bon");
        } else if ( x == 0 || x == 1 || x == 6 || x == 8) {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }

    }
}
