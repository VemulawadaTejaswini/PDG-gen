import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] V = in.nextIntArray(N);

            Map<Integer, Integer> mapa = new HashMap<>();
            Map<Integer, Integer> mapb = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    mapa.put(V[i], mapa.getOrDefault(V[i], 0) + 1);
                } else {
                    mapb.put(V[i], mapb.getOrDefault(V[i], 0) + 1);
                }
            }
            if (mapa.size() == 1 && mapb.size() == 1 && mapa.keySet().containsAll(mapb.keySet())) {
                out.println(N / 2);
                return;
            }
            TreeMap<Integer, Integer> mapaa = new TreeMap<>(Comparator.reverseOrder());
            TreeMap<Integer, Integer> mapbb = new TreeMap<>(Comparator.reverseOrder());
            mapa.forEach((key, value) -> mapaa.put(value, key));
            mapb.forEach((key, value) -> mapbb.put(value, key));
            Integer[] ka = mapaa.values().toArray(new Integer[0]);
            Integer[] kb = mapbb.values().toArray(new Integer[0]);
            int ia = 0, ib = 0;
            if (ka[0].equals(kb[0])) {
                if (ka.length == 1) {
                    ib++;
                } else if (kb.length == 1) {
                    ia++;
                } else {
                    if (mapa.get(ka[1]) > mapb.get(kb[1])) {
                        ib++;
                    } else {
                        ia++;
                    }
                }
            }
            out.println(N - mapa.get(ka[ia]) - mapb.get(kb[ib]));
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

    }
}

