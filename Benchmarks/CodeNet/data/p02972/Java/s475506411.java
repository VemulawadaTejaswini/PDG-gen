import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = solve(N, a);

        System.out.println(ans.length);
        for (int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    /**
     * 参考(mikit): https://atcoder.jp/contests/abc134/submissions/6454355
     * 方針はEditorialと同じ
     */
    private static int[] solve(int N, int[] a) {
        int[] box = new int[N];

        for (int i=N; i>0; i--) {
            int c = 0;
            for (int j=i; j<=N; j+=i) {
                if (box[j-1] == 1) c++;
            }

            if (a[i-1] != c%2) {
                box[i-1] = 1;
            }
        }

        return toAns(box);
    }


    private static int[] toAns(int[] box) {
        List<Integer> list = new ArrayList();

        for (int i=0; i<box.length; i++) {
            if(box[i] == 1) {
                list.add(i);
            }
        }

        int[] ans = new int[list.size()];
        int cnt = 0;
        for (Integer i : list) {
            ans[cnt++] = i+1;
        }

        return ans;
    }
}