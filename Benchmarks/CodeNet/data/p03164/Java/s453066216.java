import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[][] dp = new long[N+1][W+1];
        Sack[] s = new Sack[N];
        for(int i = 0 ; i < N ; i++)
            s[i] = new Sack(sc.nextInt(),sc.nextInt());
        Arrays.sort(s);
        for(int i = 1 ; i <= N ; i++)
        {
            for(int j = 1; j <= W ; j++)
            {
                if(s[i-1].w <= j )
                {
                    dp[i][j] = Math.max(s[i-1].b+dp[i-1][j-s[i-1].w],dp[i-1][j]);
                }else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        System.out.println(dp[N][W]);
    }
    static class Sack implements Comparable<Sack>{
        int w,b;
        @Override
        public int compareTo(Sack o) {
            if(w == o.w)
                return 0;
            return w>o.w?1:-1;
        }

        public Sack(int w , int b)
        {
            this.w = w;
            this.b = b;
        }

        @Override
        public String toString() {
            return w+" "+b;
        }
    }
}
