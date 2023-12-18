import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static FastReader in = new FastReader();
    private static PrintWriter out = new PrintWriter(System.out);

    private static BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) throws IOException {
        solve();
        out.flush();
    }

    private static void solve() throws IOException {
        int n = in.nextInt();
        int k = in.nextInt();

        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i=0; i < n-1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            add(g, a, b);
            add(g, b, a);
        }

        List<Integer> seen = new ArrayList<>();
        P ans = new P();

        dfs(g, seen, 1, ans, k);

        out.println(ans.ans.toString());
    }

    private static class P {
        BigInteger ans;
        P() {
            this.ans = BigInteger.ONE;
        }
    }

    private static void dfs(Map<Integer, List<Integer>> g, List<Integer> seen, int from, P ans, int k) {
        if (seen.contains(from))
            return;
        seen.add(from);

        int count = count(g, seen, from);
        // System.out.println("from: " + from + " count; " + count);
        ans.ans = ans.ans.multiply(BigInteger.valueOf(k-count)).mod(MOD);

        for (int to : g.get(from)) {
            dfs(g, seen, to, ans, k);
        }
    }

    private static int count(Map<Integer, List<Integer>> g, List<Integer> toCount, int from) {
        List<Integer> seen = new ArrayList<>();

        int ret = 0;
        ArrayDeque<Map.Entry<Integer, Integer>> toVisit = g.get(from).stream().map(i -> new AbstractMap.SimpleEntry<>(i, 0)).collect(Collectors.toCollection(ArrayDeque::new));
        while (!toVisit.isEmpty()) {
            Map.Entry<Integer, Integer> check = toVisit.poll();
            if (seen.contains(check.getKey()) || check.getValue() > 1)
                continue;
            toVisit.addAll(g.get(check.getKey()).stream().map(i -> new AbstractMap.SimpleEntry<>(i, check.getValue()+1)).collect(Collectors.toList()));
            seen.add(check.getKey());
            if (toCount.contains(check.getKey()) && check.getValue() < 2 && check.getKey() != from)
                ret++;
        }

        return ret;
    }

    private static void add(Map<Integer, List<Integer>> g, int a, int b) {
        if (!g.containsKey(a))
            g.put(a, new ArrayList<>());
        g.get(a).add(b);
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            String str = "";
            str = br.readLine();
            return str;
        }
    }
}
