import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    //Solution by Sathvik Kuthuru
    public static void main(String[] args) throws FileNotFoundException {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        for(int tt = 1; tt <= t; tt++) solver.solve(tt, scan, out);
        out.close();
    }

    static class Task {

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            int n = scan.nextInt();
            TreeSet<Integer> pos = new TreeSet<>();
            TreeSet<Integer> available = new TreeSet<>();
            long[] a = new long[n];
            long ans = 0;
            for(int i = 0; i < n; i++) {
                a[i] = scan.nextLong();
                pos.add(i);
                available.add(i);
            }
            for(int i = 0; i < n; i++) {
                long best = -1;
                int now = -1;
                int rem = -1;
                int f = pos.first(), l = pos.last();
                for(int t : available) {
                    long x = Math.abs(t - f) * a[t], xx = Math.abs(t - l) * a[t];
                    if(x > best) {
                        best = x;
                        now = f;
                        rem = t;
                    }
                    if(xx > best) {
                        best = xx;
                        now = l;
                        rem = t;
                    }
                }
                pos.remove(now);
                available.remove(rem);
                ans += best;
            }
            out.print(ans);
        }
    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
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

}