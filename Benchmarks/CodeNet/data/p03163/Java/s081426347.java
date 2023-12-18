import java.util.*;
import java.io.*;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                            /////////
////////                                                                                            /////////
////////   MMMM          MMMM    AAAAAAAAAAAAAAAAA  RRRRRRRRRR       EEEEEEEEEEEEE  DDDDDDDDD       /////////
////////   MMMMMM      MMMMMM    AAAAAAAAAAAAAAAAA  RRRR     RRR     EEEEEEEEEEEEE  DDD     DDD     /////////
////////   MMMM MMM  MMM MMMM    AAAA         AAAA  RRRR      RRR    EEEEE          DDD      DDD    /////////
////////   MMMM  MMMMM   MMMM    AAAA         AAAA  RRRR       RRR   EEEEE          DDD       DDD   /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR      RRR    EEEEE          DDD        DDD  /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR     RRR     EEEEEEEEEEE    DDD         DDD /////////
////////   MMMM          MMMM    AAAAAAAAAAAAAAAAA  RRRRRRRRRR       EEEEEEEEEEE    DDD         DDD /////////
////////   MMMM          MMMM    AAAAAAAAAAAAAAAAA  RRRR    RRR      EEEEE          DDD        DDD  /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR     RRR     EEEEE          DDD      DDD    /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR      RRR    EEEEEEEEEEEEE  DDD    DDD      /////////
////////   MMMM          MMMM    AAAA         AAAA  RRRR       RRR   EEEEEEEEEEEEE  DDDDDDDDD       /////////
////////                                                                                            /////////
////////                                                                                            /////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class Main{
    static int N, remw;
    static long[][] memo;
    static int[] w;
    static long[] v;
    static long dp(int i, int remw){
        if(i==N){return 0;}
        if(memo[i][remw]!=-1){return memo[i][remw];}
        long take =  0;
        if(w[i]<=remw){take = dp(i+1, remw - w[i]) + v[i];}
        long leave = dp(i+1, remw);
        return memo[i][remw] = Math.max(take, leave);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        N = sc.nextInt(); remw = sc.nextInt();
        memo = new long[N][];
        for(int i = 0; i<N; i++){
            memo[i] = new long[remw+1];
            Arrays.fill(memo[i], -1);
        }
        v = new long[N];
        w = new int[N];
        for(int i = 0; i<N; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        long answer = dp(0, remw);
        out.println(answer);
        out.flush();

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
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
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