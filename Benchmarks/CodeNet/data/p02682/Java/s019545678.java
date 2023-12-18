import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(new BufferedInputStream(System.in));

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;
        if (a >= k) {
            sum += k;
            k = 0;
        } else {
            sum += a;
            k -= a;
        }
        k -= b;
        if (k > 0) {
            sum -= k;
        }
        System.out.println(sum);
    }
}