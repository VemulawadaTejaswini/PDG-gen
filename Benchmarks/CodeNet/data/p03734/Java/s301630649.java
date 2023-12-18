
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        Items[] list = new Items[N];
        for(int i = 0 ; i < N ; i++)
        {
            list[i] = new Items(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(list);
        long[][] dp = new long[N+1][W+1];
        for(int i = 1 ; i <= N ; i++)
        {
            for(int j = 1 ; j <= W ; j++)
            {
                if(list[i-1].W <= j)
                {
                    //K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                    //                    dp[i][j] = Math.max(s[i-1].b+dp[i-1][j-s[i-1].w],dp[i-1][j]);

                    dp[i][j] = Math.max(dp[i-1][j],list[i-1].V + dp[i-1][j-list[i-1].W]);
                }else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][W]);
    }
    static class Items implements Comparable<Items>
    {
        int W,V;
        @Override
        public int compareTo(Items o) {
            if(o.W == W)
                return 0;
            return o.W > W ? -1:1;
        }
        public Items(int w,int v)
        {
            this.W = w;
            this.V = v;
        }

        @Override
        public String toString() {
            return W+" "+V;
        }
    }
}
