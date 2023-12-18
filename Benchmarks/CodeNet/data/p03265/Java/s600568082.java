import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x = x2 - x1;
        int y = y2 - y1;
        int a = x2 - y;
        int b = y2 + x;
        int c = x1 - y;
        int d = y1 + x;
        System.out.printf("%d %d %d %d%n", a, b, c, d);
    }
}