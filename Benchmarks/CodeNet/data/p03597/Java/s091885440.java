import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(2 *(n*n - a) >= n*n ? a : n*n - a);
    }
}