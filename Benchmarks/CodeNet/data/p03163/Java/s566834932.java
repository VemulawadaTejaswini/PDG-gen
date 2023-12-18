
import java.io.*;
import java.util.* ;

public class Main {

    static int n,k ;
    static int [] w,v ;
    static long dp[][] ;

    static long dp (int idx , int k ){
        if (k<0){
            return -(int) 1e9 ;
        }
        if(idx == n)
            return 0 ;
        else{
            if (dp[idx][k]!=-1){
                return dp[idx][k] ;
            }
            long take = v[idx] + dp(idx+1,k-w[idx]) ;
            long leave = dp(idx+1 , k) ;
            return dp[idx][k] = Math.max(take,leave) ;
        }
    }

    public  static void main (String args [] ) throws IOException ,InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        n = sc.nextInt() ;
        k = sc.nextInt() ;
        w = new int[n] ;
        v = new int[n] ;
        dp = new long [n][k+1] ;
        for (int i =0 ; i < n ;i ++  ) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            Arrays.fill(dp[i],-1);
        }

        pw.println(dp(0,k));

        pw.close();
    }
     static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }
    }
}
