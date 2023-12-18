import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        int i = 0;
        int j = 0;
        long sum = 0;
        long ans = 0;
        while(true) {
            if(sum >= k) {
                ans += n - i + 1;
                sum -= a[j++];
            }
            else {
                if(i == n) break;
                sum += a[i++];
            }
        }

        pw.println(ans);
        pw.close();
    }
}