import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1000000007;  // 10**9 + 7

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;
    private static int N;
    private static int K;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        N = 6;
        K = 4;
        final long[] arr1 = {-5, -4, -3, -3, 1, 1};
        test(arr1);
        System.out.println(solveSmall(arr1));
        testBatch();

        N = readInt();
        K = readInt();
        long[] A = new long[N];
        int index = -1;
        for (int i = 0; i < N; i++) {
            long c = readInt();
            if (c != 0) A[++index] = c;
        }
        N = index + 1;

        long[] arr = Arrays.copyOf(A, N);
        Arrays.sort(arr);

        pw.println(solve(arr));
        pw.close();
    }

    // no zeros in A. A must be sorted
    private static long solve(long[] A) {
        if (K > N) return 0;

        if (K == 1 || K == N || A[0] > 0) {
            return productMod(A, N - K, N);
        }
        // 2 <= K < N and A[0] < 0 now.

        if (A[N - 1] < 0) {
            if (K % 2 == 0) return productMod(A, 0, K);
            else return productMod(A, N - K, N);
        }
        // A[N-1] > 0 now.

        // Answer cannot be negative now, since we have A[0] * product(A, 1, K-1) and
        // product(A, 1, K-1) * A[n-1], which cannot be negative at the same time.

        int lastNegativeIndex = 0;
        while (A[lastNegativeIndex + 1] < 0) lastNegativeIndex++;

        int firstPositiveIndex = N - 1;
        while (A[firstPositiveIndex - 1] > 0) firstPositiveIndex--;

        if (lastNegativeIndex / 2 * 2 + N - firstPositiveIndex < K) return 0;
        // Answer must be > 0 now.

        // Two-pointers technique
        int negativeIndex = 0;
        int positiveIndex = (K % 2 == 0) ? N - 1 : N - 2;
        long answer = (K % 2 == 0) ? 1 : A[N - 1];
        long count = (K % 2 == 0) ? 0 : 1;
        // count == K (mod 2)

        // multiply by either two positive factors or two negative factors.
        while ((count < K) && (negativeIndex < lastNegativeIndex || positiveIndex > firstPositiveIndex)) {
            long pN = (negativeIndex < lastNegativeIndex) ?
                    A[negativeIndex] * A[negativeIndex + 1] : 0;
            long pP = (positiveIndex > firstPositiveIndex) ?
                    A[positiveIndex] * A[positiveIndex - 1] : 0;

            if (pN <= pP) {
                answer = answer * (pP % MOD) % MOD;
                positiveIndex -= 2;
            } else {
                answer = answer * (pN % MOD) % MOD;
                negativeIndex += 2;
            }

            count += 2;
        }

        assert count == K : "Not enough numbers in the product";
        return answer;
    }

    static long productMod(long[] A, int start, int endExclusive) {
        long p = 1;
        for (int i = start; i < endExclusive; i++) {
            p = p * A[i] % MOD;
        }
        return p;
    }

    static long solveSmall(long[] A) {
        long[] prefixProduct = new long[K + 1];   // product of first i numbers.
        prefixProduct[0] = 1;
        for (int i = 1; i <= K; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * A[i - 1] % MOD;
        }
        long[] suffixProduct = new long[K + 1];   // product of last i numbers.
        suffixProduct[0] = 1;
        for (int i = 1; i <= K; i++) {
            suffixProduct[i] = suffixProduct[i - 1] * A[N - i] % MOD;
        }

        long max = Long.MIN_VALUE;
        for (int i = 0; i <= K; i++) {
            long c = prefixProduct[i] * suffixProduct[K - i];
            if (max < c) max = c;
        }

        return max;
    }

    static void testBatch() {
        N = 7;
        K = 3;
        for (int i1 = -9; i1 < 7; i1++) {
            for (int i2 = i1; i2 < 7; i2++) {
                for (int i3 = i2; i3 < 7; i3++) {
                    for (int i4 = i3; i4 < 7; i4++) {
                        for (int i5 = i4; i5 < 7; i5++) {
                            for (int i6 = i5; i6 < 7; i6++) {
                                for (int i7 = i6; i7 < 7; i7++) {
                                    if (i1 * i2 * i3 * i4 * i5 * i6 * i7 != 0) {
                                        long[] arr = {i1, i2, i3, i4, i5, i6, i7};
                                        test(arr);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Test done!");
    }

    private static void test(long[] arr) {
        long expected = solveSmall(arr);
        long actual = solve(arr);
        check("Wrong " + Arrays.toString(arr), expected, actual);
    }

    static void checkCombinations(long[] arr, int len, int startPosition, long[] result) {
        if (len == 0) {
            long computed = solve(result);
            long expected = 0; // solveDummy(result);
            check("Wrong" + Arrays.toString(result), expected, computed);
            return;
        }
        for (int i = startPosition; i <= arr.length - len; i++) {
            result[result.length - len] = arr[i];
            checkCombinations(arr, len - 1, i + 1, result);
        }
    }

    static void check(String messageWhendiffer, long expected, long actual) {
        if (actual != expected) {
            System.out.println(messageWhendiffer);
            System.out.println("wrong!");
            System.out.println("  expected: " + expected);
            System.out.println("  actual: " + actual);
            throw new RuntimeException("Test failed!");
        }
    }
}
