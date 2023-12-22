import java.util.*;
import java.io.*;

public class Main {
    static long [] a;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); long k = sc.nextLong();
        a = new long[n]; long sum = 0; long div = n + k;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        long [] denom = new long[n]; long temp = 0;
        PriorityQueue<Rat> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            denom[i] = (long) Math.floor(((double) a[i] * div) / sum);
            temp += denom[i];
            pq.add(new Rat(denom[i], i));
        }
        while (temp < div) {
            Rat r = pq.poll();
            temp++;
            pq.add(new Rat(r.d + 1, r.i));
        }
        Rat max = pq.poll();
        long ans = (long) Math.ceil((double) a[max.i] / max.d);
        out.println(ans);
        out.close();
    }

    static class Rat implements Comparable<Rat> {
        long d; int i;
        Rat(long d, int i) {
            this.d = d; this.i = i;
        }

        @Override
        public int compareTo(Rat o) {
            double ratio = (double) a[i] / d;
            double other = (double) a[o.i] / o.d;
            return Double.compare(other, ratio);
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
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

}