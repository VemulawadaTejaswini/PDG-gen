import java.util.Scanner;

public class Main {
    static int gcd (int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(), y = scanner.nextInt();
        System.out.println(gcd(x, y));
    }
}

