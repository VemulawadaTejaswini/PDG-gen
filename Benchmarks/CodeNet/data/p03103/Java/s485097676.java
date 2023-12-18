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

    static class Drink implements Comparable<Drink> {
        long cost;
        long num;
        public Drink(long cost, long num) {
            this.cost = cost;
            this.num = num;
        }
        @Override
        public int compareTo(Drink other) {
            return (int)(this.cost - other.cost);
        }
    }

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Drink[] a = new Drink[n];
        for(int i=0;i<n;i++) a[i] = new Drink(sc.nextLong(), sc.nextLong());
        Arrays.sort(a);

        int cnt = 0;
        long ans = 0;

        for(int i=0;;i++) {
            if(i >= a.length) break;
            cnt += a[i].num;
            ans += a[i].cost * a[i].num;
            if(cnt > m) {
                ans -= a[i].cost * (cnt - m);
                break;
            }
        }

        pw.println(ans);
        pw.close();
    }
}
