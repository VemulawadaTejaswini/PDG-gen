import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] H = new int[N]; //参照先がオーバーすることがあるので1余計に取る
        for (int i = 0; i < N; i++) H[i] = cin.nextInt();

        // dp[i] = iマス目にたどり着くための最小コスト
        int[] dp = new int[N];
        dp[0] = 0;  //最初のマスはもちろん0
        dp[1] = Math.abs(H[1] - H[0]);  //2つ目のマスは、1つ前から移動するパターンのみ
        //3マス目以降は、1マス前か2マス前からの2パターンの移動が必ずあるので、繰り返し処理する
        for (int i=2;i<N;i++){
            //1マス前から移動したときの最小コストを求める
            int step1 = dp[i-1] + Math.abs(H[i] - H[i-1]);
            //2マス前から移動したときの最小コストを求める
            int step2 = dp[i-2] + Math.abs(H[i] - H[i-2]);
            //2つの最小値を求めることで、i+1マス目の最小コストを求めることが出来る。
            dp[i] = Math.min(step1, step2);
        }
        //最後のマスに到達するための必要数を出力する
        System.out.println(dp[N-1]);
    }
}

