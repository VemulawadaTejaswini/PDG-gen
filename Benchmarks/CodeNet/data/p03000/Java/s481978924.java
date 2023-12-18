import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() { String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader in=new FastReader();

        int n = in.nextInt() ;
        int x = in.nextInt() ;

       int[] a = new int[n] ;
        int d =0 , count=1 ;
       for(int i=0  ; i<n ; i++){
           a[i] = in.nextInt() ;
           d = d + a[i] ;
           if (d<=x) {
               count++;
           }
       }
        System.out.println(count);

    }
}
