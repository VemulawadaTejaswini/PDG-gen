////.....KNAPSACK-1.....////

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
            return (Integer.parseInt(next()));
        }

        long nextLong() {
            return (Long.parseLong(next()));
        }

        String nextLine() {
            String s = "";
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
    }
    public static void main(String[] args) {
       FastReader in = new FastReader();
       int n=in.nextInt();
       int W=in.nextInt();
       int w[]=new int[n];
       int val[]=new int[n];
       for(int i=0;i<n;i++){
           w[i]=in.nextInt();
           val[i]=in.nextInt();
       }
       long dp[][]=new long[n+1][W+1];
       for(int i=0;i<=n;i++){
           dp[i][0]=0;
       }
       for(int i=0;i<=W;i++){
           dp[0][i]=0;
       }
       for(int i=1;i<=n;i++){
           for(int j=1;j<=W;j++){
               dp[i][j]=dp[i-1][j];
               if(j>=w[i-1]){
                   long temp=0;
                   temp=dp[i-1][j-w[i-1]]+val[i-1];

                   if(temp>dp[i][j]){
                       dp[i][j]=temp;
                   }
               }
           }
       }

           System.out.println(dp[n][W]);

    }
}
