import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long MAX = 1000000000000000000L;

        final int N = sc.nextInt();

        final long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        Arrays.sort(A);

        long ans = 1L;

        for (int i = 0; i < N; i++) {

            ans *= A[i];

            ans *= ans < 0 ? -1 : 1;

            if (ans > MAX || ans > Long.MAX_VALUE) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);
    }
}
