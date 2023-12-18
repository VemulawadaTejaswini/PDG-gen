import java.util.*;
import java.io.*;
public class Main {
    static int mod  = 1000000007;
    public static void main(String[] args) {
        MyScanner ms = new MyScanner();
        int H = ms.nextInt();
        int W= ms.nextInt();
        char [][] table = new char[H][W];
        int [] [] dp = new int[H][W];
        for(int i=0;i<H;i++)
        {
            String line = ms.nextLine();
            for(int j=0;j<W;j++)
            table[i][j] = line.charAt(j);
        }
        dp[0][0] = 1;
        for(int i=0;i<H;i++)
        for(int j=0;j<W;j++){
            if(table[i][j]=='#') continue;
            if(i-1>=0)dp[i][j] = (dp[i-1][j]+dp[i][j])%mod;
            if(j-1>=0)dp[i][j] = (dp[i][j-1]+dp[i][j])%mod;
        }
    System.out.println(dp[H-1][W-1]);
    }


    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
   
        public MyScanner() {
           br = new BufferedReader(new InputStreamReader(System.in));
        }
   
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
   
        int nextInt() {
            return Integer.parseInt(next());
        }
   
        long nextLong() {
            return Long.parseLong(next());
        }
   
        double nextDouble() {
            return Double.parseDouble(next());
        }
   
        String nextLine(){
            String str = "";
        try {
           str = br.readLine();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return str;
        }
  
     }
}