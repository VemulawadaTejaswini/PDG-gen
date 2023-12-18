import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = IntStream.range(0, n).map(i -> scanner.nextInt()).toArray();
        int[] gcd = new int[n];
        int[] temp = new int[n];

        for (int i = 1; i < n; i++)
            gcd[i] = gcd(gcd[i - 1], a[i - 1]);
        for (int i = n - 2; i >= 0; i--)
            temp[i] = gcd(temp[i + 1], a[i + 1]);
        for (int i = 0; i < n; i++)
            gcd[i] = gcd(gcd[i], temp[i]);

        Arrays.stream(gcd).max().ifPresent(System.out::println);
    }

    public static int gcd(int a, int b) {
        return 0 < b ? gcd(b, a % b) : a;
    }
}