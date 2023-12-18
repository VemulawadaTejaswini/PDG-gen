import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, K, A));
    }

    private static int solve(int N, int K, int[] A) {
        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += A[i];
        }
        List<Integer> divideList = divideList(sum);
        Collections.sort(divideList, Collections.reverseOrder());

        for (int d : divideList) {
            if (solveD(N, K, A, d)) {
                return d;
            }

        }

        return 1;
    }

    private static boolean solveD(int N, int K, int[] A, int d) {
        int[] r = new int[N];
        int divSum = 0;
        for (int i=0; i<N; i++) {
            r[i] = A[i]%d;
            divSum += r[i];
        }
        Arrays.sort(r);
        // ここではrを昇順にしているので，
        // 上位 N-(rの和)/d 個が0に減らす, その他 (rの和)/d 個がdに増やす操作

        int split = N - divSum / d;
        // System.err.println("split=" + split);
        int ops = 0;
        for (int i=0; i<split; i++) {
            ops += r[i];
        }
        // System.err.println(ops);
        if (ops > K) return false;
        ops = 0;
        for (int i=split; i<N; i++) {
            ops += d - r[i];
        }
        // System.err.println(ops);
        if (ops > K) return false;

        return true;
    }

    private static List<Integer> divideList(int sum) {
        List<Integer> list = new ArrayList<>();

        for (int i=1; i<=Math.sqrt(sum); i++) {
            if (sum%i == 0) {
                list.add(i);
                list.add(sum/i);
            }
        }

        return list;
    }
}