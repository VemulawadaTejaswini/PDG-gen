import java.io.*;
import java.util.*;

public class Main {

    public void solve() {
        int n = in.nextInt(), m = in.nextInt(), q = in.nextInt();
        int[] a = new int[q];
        Map<Integer, List<Integer>> occ = new HashMap<>();
        for (int i = 0; i < q; i++) {
            a[i] = in.nextInt() - 1;
            if (!occ.containsKey(a[i])) {
                occ.put(a[i], new ArrayList<>());
            }
            occ.get(a[i]).add(i);
        }
        for (int i : occ.keySet()) {
            List<Integer> l = occ.get(i);
            Collections.reverse(l);
            if (l.size() > n) {
                l = l.subList(0, n);
            }
            occ.put(i, l);
        }
        List<Integer> order = new ArrayList<>();
        List<List<Integer>> toCompare = new ArrayList<>();

        boolean[] removed = new boolean[m];
        for (int i = q - 1; i >= 0; i--) {
            if (!removed[a[i]]) {
                order.add(a[i]);
                toCompare.add(occ.get(a[i]));
                removed[a[i]] = true;
            }
        }
        for (int i = 0; i < m; i++) {
            if (!removed[i]) {
                order.add(i);
                toCompare.add(new ArrayList<>());
            }
        }

        for (int i = 0; i < order.size() - 1; i++) {
            List<Integer> l1 = toCompare.get(i), l2 = toCompare.get(i + 1);

//            if (l2.size() > l1.size()) {
//                out.println("No");
//                return;
//            }
            // l1.size() >= l2.size()
            if (l1.size() == n && l2.size() == n && order.get(i) > order.get(i + 1)) {
                for (int j = 0; j < l2.size(); j++) {
                    if (l1.get(j) < l2.get(j)) {
                        out.println("No");
                        return;
                    }
                }
            } else {
                if (order.get(i) > order.get(i + 1)) {
                    out.println("No");
                    return;
                }
            }
        }
        out.println("Yes");
    }

    public void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    FastScanner in;
    PrintWriter out;

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
