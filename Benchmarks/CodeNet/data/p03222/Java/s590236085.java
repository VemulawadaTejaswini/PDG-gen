import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int H, W, K, M = 1000000007;
        {int[] a = in.ii(); H = a[0]; W = a[1]; K = a[2];}
        int[][] dp = new int[H+1][W+1];
        dp[0][1] = 1;
        for(int i = 1;i <= H; i++)
            for(int k = 0; k < 1<<W-1; k++)
                if((k&k/2) == 0)
                    for(int m = k<<1, j = 1; j <=W ; j++)
                        dp[i][j] = (dp[i][j] + dp[i-1][(m>>j&1) > 0 ? j+1 : (m>>(j-1)&1) > 0 ? j-1 : j])%M;
        out.println(dp[H][K]);
        out.flush();
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
