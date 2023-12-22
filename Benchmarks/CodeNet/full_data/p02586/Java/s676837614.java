import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static FastIO io = new FastIO("in.txt");
    static int R, C, K;
    static long[][] g;
    static long[][][] dp;

    static long dfs(int r, int c, int k){
        if(dp[r][c][k] >= 0) return dp[r][c][k];
        if(r == R-1 && c == C-1){
            if(k < 3){
                return g[r][c];
            }else{
                return 0;
            }
        }

        long ans = 0;
        if(r + 1 < R){
            if(k < 3){
                ans = Math.max(ans, g[r][c] + dfs(r+1, c, 0));
            }
            ans = Math.max(ans, dfs(r+1, c, 0));

        }
        if(c + 1 < C){
            if(k < 3){
                ans = Math.max(ans, g[r][c] + dfs(r, c+1, k+1));
            }

            ans = Math.max(ans, dfs(r, c+1, k));
        }
        dp[r][c][k] = ans;
        return ans;
    }

    public static void main(String[] args) throws Exception {
        R = io.nextInt(); C = io.nextInt(); K = io.nextInt();
        g = new long[R][C];
        for(int i=0; i<K; i++){
            int r = io.nextInt()-1, c = io.nextInt() - 1, v = io.nextInt();
            g[r][c] = v;
        }

        dp = new long[R][C][4];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                for(int k=0; k<4; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        long ans = dfs(0, 0, 0);
        io.println(ans);


        io.flush();
    }

    static class FastIO {
        static StringBuilder sb = new StringBuilder();
        static BufferedReader br;
        static StringTokenizer st;
        static PrintStream ps = new PrintStream(System.out);

        public FastIO(String fname) {
            try {
                File input = new File(fname);
                if (input.exists()) {
                    System.setIn(new FileInputStream(fname));
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            br = new BufferedReader(new
                    InputStreamReader(System.in));
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

        void flush(){
            System.out.print(sb.toString());
            sb.setLength(0);
        }

        void print(Object o){
            sb.append(o);
        }

        void println(Object o){
            sb.append(o);
            sb.append('\n');
        }

        String nextLine() {
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
