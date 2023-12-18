import java.io.*;
import java.util.*;

public class ACLISOnTree {

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
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

    private static class Node {
        int index;

        private int value;
        List<Node> children;


        public Node(int value) {
            this.value = value;
            children = new LinkedList<>();
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, index);
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        int N = fs.nextInt();
        int[] a = new int[N];

        Node[] tree = new Node[N];

        Map<Node, Integer> results = new HashMap<>();
        int[] dp = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = fs.nextInt();
            tree[i] = new Node(a[i]);
            tree[i].index = i;
            results.put(tree[i], -1);
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < N - 1; ++i) {
            int node1 = fs.nextInt();
            int node2 = fs.nextInt();
            tree[node1 - 1].children.add(tree[node2 - 1]);
            tree[node2 - 1].children.add(tree[node1 - 1]);
        }

        Set<Node> visited = new HashSet<>();

        preorder(visited, tree[0], results, dp, 0);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; ++i) {
            sb.append(results.get(tree[i]));
            sb.append(' ');
        }
        System.out.println(sb);

    }

    private static int binarySearch(int[] dp, int lookingFor) {
        int start = 0;
        int end = dp.length;

        int result = -1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (dp[middle] > lookingFor) {
                result = middle;
                end = middle;
            }
            else {
                start = middle + 1;
            }
        }

        return result;
    }

    private static void preorder(Set<Node> visited, Node root, Map<Node, Integer> results, int[] dp, int depth) {
        if (visited.contains(root)) {
            return;
        }

        int index = binarySearch(dp, root.value);
        int oldValue = -1;
        if (index != -1) {
            oldValue = dp[index];
            dp[index] = root.value;
        }

//        System.out.println(root.value + " " + Arrays.toString(dp));
        int foo = binarySearch(dp, Integer.MAX_VALUE - 1);
        results.put(root, Math.max(results.get(root), foo == -1? dp.length: foo));
        visited.add(root);
        for (Node child: root.children) {
            preorder(visited, child, results, dp, depth + 1);
        }

        if (oldValue != -1) {
            dp[index] = oldValue;
        }
    }
}
