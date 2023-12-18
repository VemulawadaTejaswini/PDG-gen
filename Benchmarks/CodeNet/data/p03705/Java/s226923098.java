import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (b < a) {
            System.out.println(0);
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println((n - 2) * (b - a) + 1);
    }
}