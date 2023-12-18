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

        int[] r = new int[N];
        for (int d : divideList) {
            // System.err.println("\nd=" + d);
            int divSum = 0;
            for (int i=0; i<N; i++) {
                r[i] = A[i]%d;
                divSum += r[i];
            }
            Arrays.sort(r);
            /*
            System.err.print("r=");
            for (int i=0; i<N; i++) {
                System.err.print(r[i] + " ");
            }
            System.err.println();
             */

            int split = N - divSum / d;
            // System.err.println("split=" + split);
            int ops = 0;
            for (int i=0; i<split; i++) {
                ops += r[i];
            }
            // System.err.println(ops);
            if (ops > K) continue;
            ops = 0;
            for (int i=split; i<N; i++) {
                ops += d - r[i];
            }
            // System.err.println(ops);
            if (ops > K) continue;

            return d;
        }

        return 1;
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