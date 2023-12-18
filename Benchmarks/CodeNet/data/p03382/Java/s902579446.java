import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Long[] X = new Long[N];
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextLong();
        }
        scanner.close();

        Arrays.sort(X);

        Long[] ans = new Long[2];
        Long max = 0L;
        for (int i = 0; i < N; i++) {

            Long n = X[i];
            for (int j = 0; j < i; j++) {
                Long r = X[j];
                Long c = comb(n, r);
                if (c > max) {
                    ans[0] = n;
                    ans[1] = r;
                    max = c;
                }
            }
        }
        System.out.println(ans[0] + " " + ans[1]);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static long comb(Long n, Long r) {
        if (n < 0 || r < 0 || n < r) {
            throw new ArithmeticException("n = " + n + ", r = " + r);
        }
        r = Math.min(r, n - r); // nCr = nCn-r
        if (r == 1) {
            return n;
        }
        long sum = 1;
        for (int i = 1; i <= r; i++) {
            sum = sum * (n - i + 1) / i;
        }
        return sum;
    }
}