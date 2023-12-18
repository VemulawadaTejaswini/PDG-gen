import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int x = sc.nextInt();
        int t = sc.nextInt();

        System.out.println(t > x ? 0 : x - t);
    }
}