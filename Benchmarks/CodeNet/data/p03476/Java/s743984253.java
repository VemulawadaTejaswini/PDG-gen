import java.io.*;
import java.util.*;


class Main {
    static final int N=110000;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int qq=sc.nextInt();
        int[]p=new int[N];
        Arrays.fill(p, 1);
        p[0]=p[1]=0;
        for(int i=2;i<N;++i){
            if(p[i]==0)continue;
            for(int j=2*i;j<N;j+=i)
                p[j]=0;
        }
        int[]q=new int[N];
        for(int i=1;i<N;++i)q[i]+=q[i-1]+(i%2)*p[i]*p[i/2+1];
        while(qq-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            out.println(q[r]-q[l-1]);
        }
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
        int[] nextIntArray(int n){
            int[]r=new int[n];
            for(int i=0;i<n;++i)r[i]=nextInt();
            return r;
        }
    }
}
