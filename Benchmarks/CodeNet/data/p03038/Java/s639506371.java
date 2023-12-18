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

    static class Pair {
        long val;
        int multi;
        public Pair(long val, int multi) {
            this.val = val;
            this.multi = multi;
        }
    }

	public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<Pair> a = new ArrayList<Pair>();

        for(int i=0;i<n;i++) {
            a.add(new Pair(sc.nextLong(), 1));
        }
        for(int i=0;i<m;i++) {
            int b = sc.nextInt();
            long c = sc.nextLong();
            a.add(new Pair(c, b));
        }

        a.sort((cur, other) -> {return (int)(other.val - cur.val);});

        long cnt = 0;
        long sum = 0;
        for(int i=0;;i++) {
            int amount = a.get(i).multi;
            cnt += amount;
            sum += a.get(i).val * amount;
            if(cnt >= n) {
                sum -= a.get(i).val * (cnt - n);
                break;
            }
        }

        pw.println(sum);
        pw.close();
    }
}
