import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i=0; i<N; i++) {
            L[i] = sc.nextInt();
        }

        System.out.println(solve2(N, L));
    }

    /**
     * 愚直な実装でこれだとTLE
     * @param N
     * @param L
     * @return
     */
    private static int solve(int N, int[] L) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    if (L[i] < L[j] + L[k] && L[j] < L[k] + L[i] && L[k] < L[i] + L[j]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static int solve2(int N, int[] L) {
        int count = 0;

        int[] numOverLength = new int[2*1000 + 2];
        Arrays.sort(L);
        int idx = 0;
        for (int i=2*1000; i>=0; i--) {
            numOverLength[i] = numOverLength[i+1];
            while (idx < N && i == L[N - idx - 1]) {
                numOverLength[i]++;
                idx++;

                // System.err.println("OL[" + i + "] = " + numOverLength[i]);
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                int kMax = L[i]+L[j];
                int kMin = Math.max(L[i]-L[j], L[j]-L[i]);

                count += numOverLength[kMin+1] - numOverLength[kMax];
                if (kMin < L[i] && L[i] < kMax) count--;
                if (kMin < L[j] && L[j] < kMax) count--;

                // System.err.println("i=" + L[i] + ", j=" + L[j] + " = " + count);
            }
        }

        return count/3;
    }
}