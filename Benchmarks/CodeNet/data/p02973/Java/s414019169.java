import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(solve(N, A));
    }

    /**
     * 方針1: 広義単調行列の分け方の最小値
     * http://kmjp.hatenablog.jp/entry/2019/07/20/0900
     * https://atcoder.jp/contests/abc134/submissions/6458571
     * @param N
     * @param A
     * @return
     */
    private static int solve(int N, int[] A) {
        int count = 0;

        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i=0; i<N; i++) {
            Map.Entry<Integer, Integer> entry = map.lowerEntry(A[i]);
            int value = 0;

            if (entry == null) {
            } else {
                value = entry.getValue();
                if (entry.getValue() == 1) {
                    map.remove(entry.getKey());
                } else {
                    map.put(entry.getKey(), entry.getValue()-1);
                }
            }

            map.merge(A[i], 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count += entry.getValue();
        }

        return count;
    }
}