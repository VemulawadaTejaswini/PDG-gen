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

    static class Pair implements Comparable<Pair> {
        String s;
        int v;
        int idx;
        public Pair(String s, int v, int idx) {
            this.s = s;
            this.v = v;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair p) {
            if(this.s.compareTo(p.s) == 0) {
                return p.v - this.v;
            }
            return (this.s.compareTo(p.s) < 0) ? -1 : 1;
        }
    }

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        Pair[] a = new Pair[n];
        for(int i=0;i<n;i++) {
            String[] s = sc.nextLine().split(" ");
            a[i] = new Pair(s[0], Integer.parseInt(s[1]), i+1);
        }
        Arrays.sort(a);

        for(int i=0;i<n;i++) pw.println(a[i].idx);

        pw.close();
    }
}
