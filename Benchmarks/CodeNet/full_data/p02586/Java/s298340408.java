import java.util.*;
import java.io.*;

public class Main {
    static int n,m;
    static int[][]vals;
    static long[][][]memo;

    static long dp(int c,int i,int j){
        if (i==n&&j==m)
            return 0;
        if (memo[c][i][j]!=-1)
            return memo[c][i][j];

        long ans=(long)-1e16;
        if (i<n){
            if (vals[i+1][j]!=0){
                ans=Math.max(ans,vals[i+1][j]+dp(2,i+1,j));
            }
            ans=Math.max(ans,dp(3,i+1,j));
        }
        if (j<m){
            if (vals[i][j+1]!=0){
                if (c>0)
                ans=Math.max(ans,vals[i][j+1]+dp(c-1,i,j+1));
            }
            ans=Math.max(ans,dp(c,i,j+1));
        }
        return memo[c][i][j]=ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();
        vals= new int[n+1][m+1];
        memo= new long[4][n+1][m+1];
        while (k-->0)
            vals[sc.nextInt()][sc.nextInt()]=sc.nextInt();
        for (long[][]x:memo)for (long[]z:x)Arrays.fill(z,-1);

        pw.println(Math.max(vals[1][1]+dp(2,1,1),dp(3,1,1)));
        pw.close();

    }



    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}