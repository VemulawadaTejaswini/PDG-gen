import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int i = n / 111;
        if (n % 111 != 0) {
            i += 1;
        }

        System.out.println(i * 111);
    }
}
