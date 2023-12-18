import java.io.*;
import java.util.*;


public class Demo12 {

    static class LIS {
        // Binary search (note boundaries in the caller)
        // A[] is ceilIndex in the caller
        static int CeilIndex(int A[], int l, int r, int key) {
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (A[m] >= key)
                    r = m;
                else
                    l = m;
            }

            return r;
        }

        static int LIS(int A[], int size) {
            // Add boundary case, when array size is one

            int[] tailTable = new int[size];
            int len; // always points empty slot

            tailTable[0] = A[0];
            len = 1;
            for (int i = 1; i < size; i++) {
                if (A[i] < tailTable[0])
                    // new smallest value
                    tailTable[0] = A[i];

                else if (A[i] > tailTable[len - 1])
                    // A[i] wants to extend largest subsequence
                    tailTable[len++] = A[i];

                else
                    // A[i] wants to be current end candidate of an existing
                    // subsequence. It will replace ceil value in tailTable
                    tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
            }

            return len;
        }

        // Driver program to test above function
        public static void main(String[] args) {
            int A[] = {2, 5, 3, 7, 11, 8, 10, 13, 6};
            int n = A.length;
            System.out.println("Length of Longest Increasing Subsequence is " + LIS(A, n));
        }
    }

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

    static class Node {
        int value;
        List<Node> connectsTo;

        int index;

        int lis;

        public Node(int value) {
            this.value = value;
            connectsTo = new LinkedList<>();
        }

    }
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = fs.nextInt();
        }


        Map<Integer, Node> tree = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            Node nod = new Node(a[i]);
            nod.index = i;
            tree.put(i, nod);
        }


        for (int i = 0; i < n - 1; ++i) {
            int u = fs.nextInt();
            int v = fs.nextInt();

            Node uN = tree.get(u - 1);
            Node uV = tree.get(v - 1);

            uN.connectsTo.add(uV);
            uV.connectsTo.add(uN);
        }


        Node root = tree.get(0);
        int[] LI = new int[n];
        boolean[] visited = new boolean[n];

        traverse(root, LI, visited);

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; ++i) {
            result.append(tree.get(i).lis + "\n");
        }
        System.out.println(result);
    }

    private static int index = 0;
    private static void traverse(Node root, int[] LI, boolean[] visited) {

        if (root == null || visited[root.index]) {
            return;
        }

        LI[index] = root.value;
        visited[root.index] = true;
//        System.out.println("TRAVERSE "+ root.value + " " + index);
//        System.out.println(Arrays.toString(LI));

        if (index != 0) {
            root.lis = LIS.LIS(LI, index + 1);
        }
        else {
            root.lis = 1;
        }

        for (Node con: root.connectsTo) {
            if (!visited[con.index]) {
                index++;
                traverse(con, LI, visited);
            }
        }
        index--;
    }

}
