import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 3 == 0) {
            System.out.println("Possible");
            return;
        }

        if (b % 3 == 0) {
            System.out.println("Possible");
            return;
        }

        if ((a + b) % 3 == 0) {
            System.out.println("Possible");
            return;
        }

        System.out.println("Impossible");
    }
}