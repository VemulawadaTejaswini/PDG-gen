import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long x = sc.nextLong();
        long y = sc.nextLong();

        long ans = x +x;
        if (x % y == 0) {
            System.out.println(-1);
        } else {
            System.out.println(x);
        }
    }
}