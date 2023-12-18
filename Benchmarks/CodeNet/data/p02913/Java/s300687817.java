import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[] args){
        int N = in.i();
        char[] S = in.s().toCharArray();
        int[][] dp = new int[N+1][N+1];
        int max = 0;
        for(int i = 1; i < N+1; i++)
            for(int j = 1; j < N+1; j++)
                if(i != j && S[i-1] == S[j-1])
                    if((dp[i][j] = dp[i-1][j-1] + 1) > max && Math.abs(i-j+1) > dp[i][j])
                        max = dp[i][j];
        out.println(max);
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
