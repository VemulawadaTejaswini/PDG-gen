import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, K;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();
        long ans = solve(N, K);
        System.out.println(ans);
        in.close();
    }

    public static long solve(int N, int K) {
        long ans = 0;
        for (int b = 1; b <= N; b++) {
            //s個の数列{1,2,...,b-1}
            //s = (N+1)/b
            //数列ひとつあたりb-1-K+1 = b-K個がK以上
            //s * (b-K) = (N+1)/b * (b-K)
            //最後に1周できなかった数列の断片{1,2,...,r}
            //{1,2,...r}のうちK以上の個数
            //r < Kなら0
            //r >= Kならr-K個
            //Math.max(0, r-K)
            //ans += (N+1)/b * (b-K) + Math.max(0, r-K)
            //a=0からはじめると0,1,2,...,b-1の繰り返しになり計算しやすい
            long s = (N + 1) / b;//[0, N]はN+1個
            long overKinSeq = Math.max(0, b - K);
            long r = (N + 1) % b;
            long overKlast = Math.max(0, r - K);
            long overK = s * overKinSeq + overKlast;
            ans += (overK > 0 ? overK : 0);
        }
        //a>0, b>0なのでa=0の場合は答えに入らない
        //K=0の場合のみa=0の場合がカウントされるので1つのbにつき1引く
        ans -= (K == 0 ? N : 0);
        return ans;
    }
}
