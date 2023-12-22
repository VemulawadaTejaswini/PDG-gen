import java.io.*;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;  // 10**9 + 7

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static String readToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve());
        pw.close();
    }

    private static long solve() throws IOException {
        final int N = readInt();
        final int K = readInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = readInt();
        }

        Arrays.sort(A);

        if (K == 1 || K == N || A[0] >= 0 || A[N - 1] <= 0 && K % 2 == 1) {
            return productMod(A, N - K, N);
        }
        // K < N and A[0] < 0 and if A[N-1] <=0, then N is even.

        if (A[N - 1] <= 0) return productMod(A, 0, K);
        // A[N-1] > 0 now.

        long answer = 1;
        long count = 0;
        int positiveIndex = N - 1;
        int negativeIndex = 0;
        boolean noMoreNegative = false;
        while (count < K) {
            if (noMoreNegative || A[positiveIndex] >= -A[negativeIndex]) {
                answer = answer * A[positiveIndex] % MOD;
                positiveIndex--;
                count++;
            } else {
                if (answer > 0 && negativeIndex + 1 < N && A[negativeIndex + 1] >= 0) {
                    noMoreNegative = true;
                } else {
                    answer = answer * A[negativeIndex] % MOD;
                    negativeIndex++;
                    count++;
                }
            }
        }

        return answer;
    }

    static long productMod(int[] A, int start, int endExclusive) {
        long p = 1;
        for (int i = start; i < endExclusive; i++) {
            p = p * A[i] % MOD;
        }
        return p;
    }
}
