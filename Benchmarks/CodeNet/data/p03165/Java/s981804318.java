/*
ID: davidzh8
PROG: subset
LANG: JAVA
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class F {
    //Start Stub
    static long startTime = System.nanoTime();
    //Globals Go Here
    static char[] arr1;
    static char[] arr2;
    //Globals End
    static String[][] dp;
    public static void main(String[] args) throws IOException {
        boolean debug = (true);
        FastScanner sc = new FastScanner("F.in", debug);
        FastWriter pw = new FastWriter("F.out", debug);
        String a= sc.next();
        String b= sc.next();
        arr1= a.toCharArray();
        arr2= b.toCharArray();
        dp= new String[a.length()][b.length()];
        recurse(0,0);
        char[] arr= dp[0][0].toCharArray();
        for (int i = 0; i <= arr.length/2; i++) {
            char last= arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=last;
        }
        System.out.println(arr);
        long endTime = System.nanoTime();
       // System.out.println("Execution Time: " + (endTime - startTime) / 1e9 + " s");
        pw.close();
    }


    static String recurse(int i, int j){
        if(i>=arr1.length || j>=arr2.length) {
            return "";
        }
        if(dp[i][j]!=null) return dp[i][j];
        String max="";
        if(arr1[i]==arr2[j]) {
            String cur= recurse(i+1, j+1)+arr1[i];
            dp[i][j]=cur;
            return cur;
        }
        else{
            String cur1= recurse(i+1,j);
            String cur2= recurse(i,j+1);
            if(cur1.length()>cur2.length()) max= cur1;
            else max=cur2;
            dp[i][j]= max;
            return max;
        }


    }


    static class Edge implements Comparable<Edge> {
        int w;
        int a;
        int b;

        public Edge(int w, int a, int b) {
            this.w = w;
            this.a = a;
            this.b = b;

        }

        public int compareTo(Edge obj) {
            if (obj.w == w) {
                if (obj.a == a) {
                    return b - obj.b;
                }
                return a - obj.a;
            } else return w - obj.w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair obj) {
            if (obj.a == a) {
                return b - obj.b;
            } else return a - obj.a;
        }
    }

    static class SegmentTree {
        public long[] arr;
        public long[] tree;
        public int N;

        //Zero initialization
        public SegmentTree(int n) {
            N = n;
            arr = new long[N];
            tree = new long[4 * N + 1];
        }

        public long query(int treeIndex, int lo, int hi, int i, int j) {
            // query for arr[i..j]
            if (lo > j || hi < i)
                return 0;
            if (i <= lo && j >= hi)
                return tree[treeIndex];
            int mid = lo + (hi - lo) / 2;

            if (i > mid)
                return query(2 * treeIndex + 2, mid + 1, hi, i, j);
            else if (j <= mid)
                return query(2 * treeIndex + 1, lo, mid, i, j);

            long leftQuery = query(2 * treeIndex + 1, lo, mid, i, mid);
            long rightQuery = query(2 * treeIndex + 2, mid + 1, hi, mid + 1, j);

            // merge query results
            return merge(leftQuery, rightQuery);
        }

        public void update(int treeIndex, int lo, int hi, int arrIndex, long val) {
            if (lo == hi) {
                tree[treeIndex] = val;
                arr[arrIndex] = val;
                return;
            }

            int mid = lo + (hi - lo) / 2;

            if (arrIndex > mid)
                update(2 * treeIndex + 2, mid + 1, hi, arrIndex, val);
            else if (arrIndex <= mid)
                update(2 * treeIndex + 1, lo, mid, arrIndex, val);

            // merge updates
            tree[treeIndex] = merge(tree[2 * treeIndex + 1], tree[2 * treeIndex + 2]);
        }

        public long merge(long a, long b) {
            return (a + b);
        }
    }

    static class djset {
        int N;
        int[] parent;

        // Creates a disjoint set of size n (0, 1, ..., n-1)
        public djset(int n) {
            parent = new int[n];
            N = n;
            for (int i = 0; i < n; i++)
                parent[i] = i;
        }

        public int find(int v) {

            // I am the club president!!! (root of the tree)
            if (parent[v] == v) return v;

            // Find my parent's root.
            int res = find(parent[v]);

            // Attach me directly to the root of my tree.
            parent[v] = res;
            return res;
        }

        public boolean union(int v1, int v2) {

            // Find respective roots.
            int rootv1 = find(v1);
            int rootv2 = find(v2);

            // No union done, v1, v2 already together.
            if (rootv1 == rootv2) return false;

            // Attach tree of v2 to tree of v1.
            parent[rootv2] = rootv1;
            return true;
        }


    }

    static class FastScanner {
        public BufferedReader br;
        public StringTokenizer st;
        public InputStream is;

        public FastScanner(String name, boolean debug) throws IOException {
            if (debug) {
                is = System.in;
            } else {
                is = new FileInputStream(name);
            }
            br = new BufferedReader(new InputStreamReader(is), 32768);
            st = null;
        }


        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int ni() {
            return Integer.parseInt(next());
        }

        public long nl() {
            return Long.parseLong(next());
        }

        public double nd() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }

    static class FastWriter {
        public PrintWriter pw;

        public FastWriter(String name, boolean debug) throws IOException {
            if (debug) {
                pw = new PrintWriter(System.out);
            } else {
                pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(name))));
            }
        }

        public void println(Object text) {
            pw.println(text);
        }

        public void print(Object text) {
            pw.print(text);
        }

        public void close() {
            pw.close();
        }

        public void flush() {
            pw.flush();
        }
    }

}