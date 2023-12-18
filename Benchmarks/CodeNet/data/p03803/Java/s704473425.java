import java.util.Scanner;

public class Main {

    public Main() {
    }

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().run();
    }

    private void run() {
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == 1) {
            A = 14;
        }
        if (B == 1) {
            B = 14;
        }

        if (A == B) {
            System.out.println("Draw");
        } else if (A > B) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}