import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;


    class Segment implements Comparable<Segment> {
        int fr, to;

        public Segment(int fr, int to) {
            this.fr = fr;
            this.to = to;
        }

        @Override
        public int compareTo(Segment segment) {
            return Integer.compare(fr, segment.fr);
        }
    }

    void solve() {
        int n = in.nextInt();
        Segment[] a = new Segment[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = new Segment(in.nextInt(), in.nextInt());
            res = Math.max(res, a[i].to - a[i].fr + 1);
        }
        Segment minMax = a[0];
        for (Segment s : a) {
            if (s.to < minMax.to) {
                minMax = s;
            }
        }
        List<Segment> others = new ArrayList<>();
        List<Segment> canBeAdd = new ArrayList<>();
        for (Segment s : a) {
            if (s != minMax) {
                if (s.fr <= minMax.fr) {
                    canBeAdd.add(s);
                } else {
                    others.add(s);
                }
            }
        }
        int maxCanBeAdd = 0;
        for (Segment s : canBeAdd) {
            maxCanBeAdd = Math.max(maxCanBeAdd, s.to - s.fr + 1);
        }
        if (others.isEmpty()) {
            res = Math.max(res, maxCanBeAdd + minMax.to - minMax.fr + 1);
        }
        Collections.sort(others);
        int start = 0, end = (int) 1e9 + 10;
        for (int i = others.size() - 1; i >= 0; i--) {
            Segment cur = others.get(i);
            start = Math.max(start, cur.fr);
            end = Math.min(end, cur.to);
            int myStart = minMax.fr;
            if (i != 0) {
                myStart = Math.max(myStart, others.get(i - 1).fr);
            }
            res = Math.max(res, getDist(myStart, minMax.to) + getDist(start, end));
        }
        out.println(res);
    }

    int getDist(int fr, int to) {
        return Math.max(0, to - fr + 1);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
