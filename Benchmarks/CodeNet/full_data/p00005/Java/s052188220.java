import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            final int gcd = GetGcd(a, b);
            final int lcm = GetLcm(a, b, gcd);

            System.out.println(gcd + " " + lcm);
        }
    }

    static int GetGcd(int left, int right) {
        while (right > 0) {
            final int tmp = left % right;
            left = right;
            right = tmp;
        }

        return left;
    }

    static int GetLcm(int left, int right) {
        return left / GetGcd(left, right) * right;
    }

    static int GetLcm(int left, int right, int gcd) {
        return left / gcd * right;
    }

}