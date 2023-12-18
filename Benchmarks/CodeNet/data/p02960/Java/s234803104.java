import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
      MyReader r = new MyReader();
      int MOD = 1000000007;
      String s = r.s();
      long[][] dp = new long[100005][13];
      int n = s.length();
      dp[0][0] = 1;

      for(int i = 0; i < n; i++){
        int c;
        if(s.charAt(i) == '?')
          c = -1;
        else
          c = s.charAt(i) - '0';

        for(int j = 0; j < 10; j++){
          if(c != -1 && c != j)
            continue;
          for(int ki = 0; ki < 13; ki++)
            dp[i+1][(ki*10+j)%13] += dp[i][ki];
        }
        for(int j = 0; j < 13; j++)
          dp[i+1][j] %= MOD;
      }
      println(dp[n][5]);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
