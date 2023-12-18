import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static long[] primeFactors;
    public static void main(String[]$) {
        int n = scanner.nextInt();
        primeFactors = new long[n];
        for (int i = 2; i <= n; i++) {
            for (int j = 2, c = i; j <= i && c != 1; j++) {
                while (c % j == 0) {
                    primeFactors[j - 1]++;
                    c /= j;
                }
            }
        }
        System.out.println(count(75) + count(25) * (count(3) - 1) + count(15) * (count(5) - 1) + count(5) * (count(5) - 1) * (count(3) - 2) / 2);
    }

    static long count(int n) {
        return Arrays.stream(primeFactors).filter(i -> i >= n - 1).count();
    }
}