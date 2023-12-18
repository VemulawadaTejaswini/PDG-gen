import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSummerVacation solver = new DSummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSummerVacation {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<DSummerVacation.Pair> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x > m) {
                    continue;
                }
                a.add(new DSummerVacation.Pair(x, y));
            }
            a.sort((a1, b) -> Integer.compare(b.r, a1.r));
            int s = 0;
            long ans = 0;
            if (a.size() == 0) {
                out.println(0);
                return;
            }
            n = a.size();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i <= m; i++) {
                map.put(i, 1);
            }
            for (int i = 0; i < n; i++) {
                Integer x = map.floorKey(m - a.get(i).d);
                if (x == null) {
                    continue;
                } else {
                    map.remove(x);
                    ans += a.get(i).r;
                }
            }
            out.println(ans);
        }

        static class Pair {
            int d;
            int r;

            Pair(int a, int b) {
                d = a;
                r = b;
            }

        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

