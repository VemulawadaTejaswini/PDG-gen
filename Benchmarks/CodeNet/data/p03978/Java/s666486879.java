import java.io.*;
import java.util.*;


class Main {
    static MyScanner sc;
    static String[] app(String[]q,int v,boolean right){
        char c1=v/2==1?'#':'.';
        char c2=v%2==1?'#':'.';
        return new String[]{right?q[0]+c1:c1+q[0],right?q[1]+c2:c2+q[1]};
    }
    static boolean ask(String[]p){
        System.out.println(p[0]);
        System.out.println(p[1]);
        String res=sc.next();
        return res.equals("T");
    }
    public static void main(String[] args) {
        sc = new MyScanner();
        int n=sc.nextInt();
        int len=0;
        String[] q=new String[]{"",""};
        while(len<n){
            boolean ok=false;
            for(int i=0;i<4;++i){
                String[]nn=app(q,i,false);
                if(ask(nn)){
                    q=nn;
                    ok=true;
                    break;
                }
            }
            if(!ok)break;
            len++;
        }
        while(len<n){
            boolean ok=false;
            for(int i=0;i<4;++i){
                String[]nn=app(q,i,true);
                if(ask(nn)){
                    q=nn;
                    ok=true;
                    break;
                }
            }
            if(!ok)break;
            len++;
        }
        if(len<n)throw new Error();
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
