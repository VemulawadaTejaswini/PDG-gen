import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        long x = s.nextLong();
        long k = s.nextLong();
        long d = s.nextLong();
        
        int isneg = 1;
        if(x<0){
            x=-x;
            isneg = -1;
        }
        long min = x/d;
        
        if(min>d){
            System.out.println((x-(k*d))*isneg);
            return;
        }
        k=k-(x/d);
        x=x-(d*(x/d));
        
        if(k%2!=0) x = d-x;
        System.out.println(x*isneg);

    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (final IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (final IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}