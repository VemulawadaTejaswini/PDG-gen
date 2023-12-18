import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] T = new long[N];
        for (int i = 0; i < T.length; ++i) {
            T[i] = sc.nextLong();
        }
        long[] A = new long[N];
        for (int i = 0; i < A.length; ++i) {
            A[i] = sc.nextLong();
        }

        long div = (long)Math.pow(10, 9) + 7;

        long res = solve(T, A);
        System.out.println(res % div);
    }
    private static long solve(long[] T, long[] A) {
        long div = (long)Math.pow(10, 9) + 7;

        int tIdx = maxIdx(T);
        int aIdx = maxIdx(A);
        if (T[tIdx] != A[aIdx]) {
            return 0;
        }

        long[] h = new long[T.length];
        for (int i = 0; i < T.length; ++i) {
            if (i == 0 || T[i - 1] != T[i]) {
                h[i] = T[i];
            }
        }

        List<Integer> avIdx = new ArrayList<>(A.length);
        for (int i = A.length - 1; i > 0; --i) {
            if (i == A.length - 1 || A[i] != A[i + 1]) {
                if (h[i] > 0 && h[i] > A[i]) {
                    return 0;
                }
                h[i] = A[i];
            }
        }
        long res = 1;
        for (int i = 0; i < h.length; ++i) {
            if (h[i] == T[i] && h[i] == A[i]) {
            } else if (h[i] == T[i]) {
                if (h[i] > A[i]) {
                    return 0;
                }
            } else if (h[i] == A[i]) {
                if (h[i] > T[i]) {
                    return 0;
                }
            } else {
                long min = Math.min(T[i], A[i]);
                res *= min;
                res %= div;
            }
        }
        return res;
    }
    private static int maxIdx(long[] a) {
        long max = -1;
        int maxIdx = -1;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}