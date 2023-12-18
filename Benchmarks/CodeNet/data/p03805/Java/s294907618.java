import java.util.*;
import static java.lang.System.*;

//https://atcoder.jp/contests/abc054/tasks/abc054_c
public class Main {
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] ab = new int[N][N];
        for (int m = 0; m < M; m++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ab[a - 1][b - 1] = 1;
            ab[b - 1][a - 1] = 1;
        }

        solver(ab, N);
    }

    public static void solver(int[][] ab, int N) {
        int pos = 0;
        int[] passed = new int[N];

        solver_helper(ab, N, pos, passed);
        out.println(ans);
    }

    public static int solver_helper(int[][] ab, int N, int pos, int[] passed) {
        // 通った頂点として記録
        passed[pos] = 1;

        // 全ての頂点を通っているかの確認
        boolean all_passed = true;
        for (int n = 0; n < N; n++) {
            if (passed[n] == 0) {
                //out.println("not passed:"+n);
                all_passed = false;
                break;
            }
        }

        if (all_passed == true){
            //out.println("all passed");
            ans++;
        }

        // 次の頂点への移動
        //out.println("passed:"+Arrays.toString(passed));
        for (int n = 0; n < N; n++) {
            //out.println("  check n:"+n+", ans:"+ans);
            if (ab[pos][n] == 1 && passed[n] != 1) {
                //out.println("==> next(from->to):"+pos+"->"+n);
                int[] copiedPassed = new int[N];
                System.arraycopy(passed, 0, copiedPassed, 0, passed.length);
                //out.println("==> before ans:"+ans);
                solver_helper(ab, N, n, copiedPassed);
                //out.println("==> after ans:"+ans);
            }
        }

        // 全ての頂点を通っていない、かつ、次の頂点に行けなければ終わり
        return 0;
    }
}