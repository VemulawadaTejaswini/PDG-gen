import java.util.Scanner;

public class Main {
    public static int gcd(int x, int y) {
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else if (x >= y) {
            return gcd(y, x % y);
        } else {
            return gcd(x, y % x);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(gcd(x, y));
        scanner.close();
    }
}

