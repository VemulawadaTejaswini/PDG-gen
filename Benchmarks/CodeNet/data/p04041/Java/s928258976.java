import java.io.*;
import java.util.*;


class Main {
    static final long MOD=1000000007;
    static int nextState(int state,int x){
        int ans=1;
        for(int i=0;i<5;++i){
            if((state&1<<i)!=0&&i+x<=5)
                ans|=1<<(i+x);
        }
        for(int i=5;i<12;++i){
            if((state&1<<i)!=0&&i+x<=12)
                ans|=1<<(i+x);
        }
        for(int i=12;i<17;++i){
            if((state&1<<i)!=0&&i+x<=17)
                ans|=1<<(i+x);
        }
        if((state&1<<17)!=0)ans|=1<<17;
        return ans;
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        long[][]dp=new long[2][1<<18];
        int[][]ns=new int[18][1<<18];
        dp[0][1]=1;
        for(int b=0;b<1<<18;++b)
            for(int j=1;j<=10;++j)
                ns[j][b]=nextState(b,j);
        for(int i=0;i<n;++i){
            int u=i%2;
            int nxt=1-u;
            Arrays.fill(dp[nxt],0);
            for(int b=0;b<1<<18;++b){
                for(int a=1;a<=10;++a){
                    int nss=ns[a][b];
                    dp[nxt][nss]+=dp[u][b];
                    dp[nxt][nss]%=MOD;
                }
            }
        }
        long ans=0;
        for(int b=1<<17;b<1<<18;++b)
            ans=(ans+dp[n%2][b])%MOD;
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
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
