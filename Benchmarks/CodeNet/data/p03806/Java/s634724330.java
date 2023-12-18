import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private void solve(){
        int n = in.nextInt();
        int ma = in.nextInt();
        int mb = in.nextInt();

        int[][] dp = new int[101][101];
        for(int i=0;i<=100;i++){
            Arrays.fill(dp[i],10000000);
        }
        dp[0][0]= 0;

        for(int i=0;i<n;i++){
            int u = in.nextInt();
            int v = in.nextInt();
            int c = in.nextInt();

            for(int x=0;x<=100;x++){
                int nx = x+u;
                if(nx > 100) continue;
                for(int y=0;y<=100;y++){
                    int ny = y+v;
                    if(ny > 100) break;

                    dp[nx][ny] = Math.min(dp[nx][ny],dp[x][y]+c);
                }
            }
        }
        int mn = 10000000;
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                int g = gcd(i,j);
                if(g == 0) continue;
                if(i/g == ma && j/g == mb){
                    mn = Math.min(mn,dp[i][j]);
                }
            }
        }
        out.print(mn==10000000?-1:mn);
    }

    private int gcd(int a ,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
