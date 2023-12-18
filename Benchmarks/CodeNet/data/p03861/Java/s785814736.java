import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long a = sc.nextInt();
        long b = sc.nextInt();
        long x = sc.nextInt();
        System.out.println(Math.max(0, b - a - 1) / x);
    }
}