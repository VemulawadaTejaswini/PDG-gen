//Atcoder
import java.io.*;
import java.util.*;

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
        int m = sc.nextInt();
        Long[] a = new Long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        Arrays.sort(a);

        //pw.println(Arrays.toString(a));

        for(int i=0;i<m;i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            int lo = 0;
            int hi = n - 1;
            int idx = -1;
            while(lo <= hi) {
                int mid = (lo + hi) / 2;
                if(a[mid] >= c) {
                    hi = mid - 1;
                }
                else {
                    idx = mid;
                    lo = mid + 1;
                }
            }
            //pw.println(idx);
            if(idx != -1) {
                Arrays.fill(a, 0, Math.min(idx, b), c);
                //pw.println(Arrays.toString(a));
                Arrays.sort(a);
            }
        }

        long sum = 0;
        for(int i=0;i<n;i++) sum += a[i];

        //pw.println(Arrays.toString(a));
        pw.println(sum);
        pw.close();
    }
}
