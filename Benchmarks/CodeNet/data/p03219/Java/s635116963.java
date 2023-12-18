/*
The year is 2050, league is played by less than 100 people. T1 has finally reached Masters,
"Macaiyla I did it!" he yells excitedly. The sound echoes through the empty trailer. Macaiyla left long ago...
 */
import java.io.*;
import java.util.*;
import java.lang.Math;
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
        final int MOD = 1000000007;

        int n = sc.nextInt();
        int m = sc.nextInt();

        Pair[] pairs = new Pair[m];
        int[] p = new int[m];
        for(int i=0;i<m;i++) {
            p[i] = sc.nextInt();
            pairs[i] = new Pair(i, p[i], sc.nextInt());
        }

        Arrays.sort(pairs, (Pair a, Pair b) -> {
            if(a.p != b.p) return a.y - b.y;
            else return a.p - b.p;
        });

        int last = -1;
        int cnt = 0;
        int[] x = new int[m];
        for(int i=0;i<m;i++) {
            if(last == pairs[i].p) {
                cnt++;
            }
            else {
                last = pairs[i].p;
                cnt = 1;
            }
            x[pairs[i].idx] = cnt;
        }

        for(int i=0;i<m;i++) {
            pw.printf("%06d%06d%n", p[i], x[i]);
        }

        pw.flush();;
        pw.close();
    }
    static class Pair {
        int idx;
        int p;
        int y;
        public Pair(int idx, int p, int y) {
            this.idx = idx;
            this.p = p;
            this.y = y;
        }
    }
}

// ceil(a/b) = (a+b-1)/b
// PRO TIP: THE BEST ANSWER IS THE RIGHT ANSWER
