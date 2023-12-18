import java.io.*;
import java.util.*;

class P implements Comparable<P>{
    long a,b;
    P(long x,long y){a=x;b=y;}
    @Override
    public int compareTo(P o){
        return Long.compare(a,o.a);
    }
}
class Main {
    static final long I=1L<<48;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n=sc.nextInt();
        P[]lr=new P[n];
        for(int i=0;i<n;++i){
            long l=sc.nextInt();
            long r=sc.nextInt();
            lr[i]=new P(l+r,l);
        }
        Arrays.sort(lr);
        int nn=n/2*2;
        long sl=n%2==1?lr[0].b:0;
        long sr=n%2==1?lr[0].a-lr[0].b:0;
        long[][]dp=new long[nn+1][nn/2+1];
        Arrays.fill(dp[0],I);
        dp[0][0]=0;
        for(int i=0;i<nn;++i){
            int u=i;
            int nxt=i+1;
            long l=lr[i+n%2].b;
            long r=lr[i+n%2].a-l;
            Arrays.fill(dp[nxt],I);
            for(int j=0;j<=Math.min(i+1,nn/2);++j){
                int lft=j,rgt=i+1-j;
                if(lft>nn/2||rgt>nn/2)continue;
                if(rgt>0)
                    dp[nxt][j]=Math.min(dp[nxt][j],dp[u][j]+(nn/2-rgt+1)*l+(nn/2-rgt)*r);
                if(lft>0)
                    dp[nxt][j]=Math.min(dp[nxt][j],dp[u][j-1]+(nn/2-lft)*l+(nn/2-lft+1)*r);
            }
        }
        if(n%2==1)throw new Error();
        //System.err.println(Arrays.deepToString(dp));
        out.println(dp[nn][nn/2]+(sl+sr)*(nn/2));
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
