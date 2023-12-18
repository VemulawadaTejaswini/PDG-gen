import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        long n = fs.nextLong();
        long k = fs.nextLong();

        if(n%k==0){
            out.println("0");
        }else if(n>k){
            long neg = n/k ;
            long val1 = Math.abs(n - neg*k);
            long val2 = Math.abs(n - (neg+1)*k);
            long val3 = Math.abs(n - (neg-1)*k);
            out.println(Math.min(Math.min(val1,val2),val3));
        }else{
            out.println(Math.min(n,Math.abs(n-k)));
        }









        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
    //--------------------------------------------------------
}
