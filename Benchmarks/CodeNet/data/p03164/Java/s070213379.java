import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
    public static void main(String[] args){
        SC sc=new SC(System.in);
        int N=sc.nextInt();
        long W=sc.nextLong();
        long[][] dp=new long[N+1][N*1000+1];   //品物の番号、価値
        long INF=200000000000014L;
        for(int i=0; i<=N; i++){
            for(int j=0; j<=N*1000; j++){
                dp[i][j]=INF;
            }
        }
        dp[0][0]=0;
        int[][] products=new int[N][2];
        for(int i=0; i<N; i++){
            products[i][1]=sc.nextInt();        //重さ
            products[i][0]=sc.nextInt();        //価値
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<=N*1000; j++){
                if(j-products[i][0]<0){
                    dp[i+1][j]=dp[i][j];        //品物が買えないとき
                }
                else if(j-products[i][0]>=0 && dp[i][j-products[i][0]]+products[i][1]<=W){
                    dp[i+1][j]=Math.min(dp[i][j], dp[i][j-products[i][0]]+products[i][1]);
                }
                else{
                    dp[i+1][j]=dp[i][j];
                }
            }
        }
        long valmax=0;
        for(int i=0; i<=N*1000; i++){
            if(dp[N][i]<=W){
                valmax=i;
            }
        }
        pl(valmax);
    }
    public static void pl(Object o) {
        System.out.println(o);
    }
    public static void pl() {
        System.out.println();
    }
    public static void p(Object o) {
        System.out.print(o);
    }
    static class SC {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public SC(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public String nextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }
}