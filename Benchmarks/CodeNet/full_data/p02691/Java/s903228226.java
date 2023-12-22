import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A));
    }

    /**
     * https://www.hamayanhamayan.com/entry/2020/05/03/224417
     * @param N
     * @param A
     * @return
     */
    private static long solve2(int N, int[] A) {
        long count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // i+A[i] と i-A[i]を同時に更新・参照することで
        // i < j について i-A[i] == j+A[j] がチェックできる
        // (i > j のときは iがまだ未評価なので0となる
        for (int i=0; i<N; i++) {
            count += map.getOrDefault(i-A[i], 0);

            int val = map.getOrDefault(i+A[i], 0);
            map.put(i+A[i], val+1);
        }

        return count;
    }
}