import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Node {
        int parent;
        Map<Integer, Integer> childColors;

        private Node() {
            this.childColors = new HashMap<>();
        }

        private void addChild(int n) {
            this.childColors.put(n, 0);
        }
    }

    private static void solve() {
        int n = in.nextInt();
        Node[] nodes = new Node[n];
        // for ordered output
        List<Map.Entry<Integer, Integer>> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            nodes[a].addChild(b);
            nodes[b].addChild(a);
            edges.add(new AbstractMap.SimpleEntry<>(a, b));
        }

        int colors = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int current = stack.pop();
            Node node = nodes[current];

            for (int i : node.childColors.keySet()) {
                if (i == node.parent) continue;

                nodes[i].parent = current;
                stack.push(i);
            }

            // root as exception
            int parentColor = current == node.parent ? 0 : nodes[node.parent].childColors.get(current);
            Set<Integer> used = new HashSet<>();
            used.add(parentColor);
            int currentColor = 1;
            for (Map.Entry<Integer, Integer> childColor : node.childColors.entrySet()) {
                if (childColor.getKey() == node.parent) continue;

                while (used.contains(currentColor)) {
                    currentColor++;
                }

                used.add(currentColor);
                node.childColors.put(childColor.getKey(), currentColor);
            }
            colors = Math.max(colors, currentColor);
        }

        out.println(colors);
        for (Map.Entry<Integer, Integer> e : edges) {
            int a = e.getKey() ;
            int b = e.getValue();

            Node node = nodes[a];
            if (node.parent == b) {
                Node parent = nodes[node.parent];
                out.println(parent.childColors.get(a));
            } else {
                out.println(node.childColors.get(b));
            }
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
