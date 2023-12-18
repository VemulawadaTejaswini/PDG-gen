import java.io.*;
import java.util.*;


class Main {
    static long rec(long x,long y){
        if(x==y)return 0;
        if(x==0)return 0;
        long q=y/x;
        long ans=0;
        ans+=(q-1)*x;
        y-=(q-1)*x;
        long z=y-x;
        if(z==0)return ans;
        long q2=x/z;
        ans+=q2*z;
        x-=q2*z;
        return ans+rec(x,x+z);
    }
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        long n=sc.nextLong();
        long x=sc.nextLong();
        out.println(rec(x,n)*3);
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
