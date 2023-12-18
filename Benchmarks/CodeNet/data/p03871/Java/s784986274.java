import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        double[]p=new double[6],q=new double[6];
        for(int i=0;i<6;++i)p[i]=sc.nextDouble()/100.0;
        for(int i=0;i<6;++i)q[i]=sc.nextDouble()/100.0;
        double a=0.0,b=1.0;
        for(int i=0;i<70;++i){
            double c=(2.0*a+b)/3.0;
            double d=(a+2.0*b)/3.0;
            double fc=0.0,fd=0.0;
            for(int j=0;j<6;++j){
                fc+=Math.max(c*p[j],(1.0-c)*q[j]);
                fd+=Math.max(d*p[j],(1.0-d)*q[j]);
            }
            if(fc>fd)
                a=c;
            else
                b=d;
        }
        double o=0.0;
        for(int i=0;i<6;++i)o+=Math.max(a*p[i],(1.0-a)*q[i]);
        out.println(o);
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
