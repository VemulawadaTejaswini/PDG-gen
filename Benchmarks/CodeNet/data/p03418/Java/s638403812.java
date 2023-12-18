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
        int ans = 0;

        for (int b = 1; b <= N; b++) {
            // bを固定したときに余りがK以上になるときのaは
            // a = b*n + K (※nは整数)
            // a = b*n + K+1 (※nは整数)
            // ...
            // a = b*n + b-1 (※nは整数)

            // b*n + (b-1) <= Nのとき
            int k_to_b1 = ((b-1) - K) + 1;
            int max_n = (int)Math.floor((N-(b-1))/b);
            if(k_to_b1 > 0 && max_n+1 > 0) {
                ans += k_to_b1 * (max_n+1);   //0〜max_nまで
            }

            //out.println(b+","+k_to_b1+","+max_n+","+ans);

            // b*n + (b-1) > Nのとき
            int rest = N - K - b * (max_n + 1);
            if(max_n+1 > 0 && rest+1 > 0) {
                ans += rest+1;
            }

            //out.println("=>"+b+","+max_n+","+rest+","+ans);

            // 例外：K=0の時は、a=0を含んでしまうため、カウントしない
            if(K==0) {
                ans--;
            }

            //out.println("==>"+b+","+ans);
        }
        out.println(ans);
    }
}
