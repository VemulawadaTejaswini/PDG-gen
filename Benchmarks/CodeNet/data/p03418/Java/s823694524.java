import java.util.*;

import static java.lang.System.*;

//https://atcoder.jp/contests/abc090/tasks/arc091_b
//a%b>=Kの組み合わせ。bを固定して考えるとO(n)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        solver(N, K);
    }

    public static void solver(int N, int K) {
        long ans = 0;

        for (int b = 1; b <= N; b++) {
            // 0<= a=pb+r <=N
            int p = N / b;
            int r = N % b;
            ans += p*Math.max(b-K, 0);
            ans += Math.max(r-K+1, 0);
        }
        // 例外：K=0の時は、a=0を含んでしまうため、カウントしない
        if(K==0) {
            ans -= N;
        }
        out.println(ans);
    }
}
