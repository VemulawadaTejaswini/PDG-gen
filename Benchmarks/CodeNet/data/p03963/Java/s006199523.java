import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(k * Math.pow(k - 1, n - 1));
    }
}