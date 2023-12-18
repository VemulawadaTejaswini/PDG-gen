import java.util.Scanner;

public class Main {

    private static long solve(int N, long K, long[] As) {
        boolean canBeUp = false;
        long X = 0;

        for(int i = 63; i >= 0; i--) {
            long selector = ((long)1) << i;
            boolean high = (K & selector) > 0;
            if (!high && !canBeUp) continue;

            int c = 0;
            for(int j = 0; j < N; j++) {
                if ((As[j] & selector) > 0) {
                    c += 1;
                }
            }
            boolean shouldHigh = 2 * c < N;
            if (shouldHigh) {
                X += selector;
            } else {
                canBeUp = true;
            }
        }

        long sum = 0;
        for(int i = 0; i < N; i++) {
            sum += X ^ As[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final long K = sc.nextLong();

        long[] As = new long[N];
        for(int i = 0; i < N; i++) {
            As[i] = sc.nextLong();
        }

        long ans = solve(N, K, As);
        System.out.println(ans);
    }
}
