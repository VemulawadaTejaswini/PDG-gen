/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        val = sc.nextInts(N);
        coordinateCompress(val);

        adjList = new ArrayList[N];
        Arrays.setAll(adjList, a -> new ArrayList<>());
        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adjList[u].add(v);
            adjList[v].add(u);
        }

        int maxValue = 0;
        for (int value : val) {
            maxValue = Math.max(maxValue, value);
        }
        dp = new SegmentTree(new int[maxValue + 1]);
        ans = new int[N];
        solve(0, -1);
        for (int a : ans) {
            out.println(a);
        }
        out.close();
    }

    static int[] val;
    static ArrayList<Integer>[] adjList;
    static int[] ans;
    static SegmentTree dp;

    static void solve(int node, int par) {
        int value = val[node];
        // It's a given that we can just start ourselves as a sequence
        int bestLength = 1;
        // Go through all previously constructed increasing subsequences!
        int buildOn = dp.query(0, value - 1) + 1;
        // Two choices: either start anew, or build on top of old subsequences
        bestLength = Math.max(bestLength, buildOn);
        // Update our segTree, for future queries!
        ans[node] = bestLength;
        int prevVal = dp.query(value, value);
        dp.update(value, bestLength);

        for (int adj : adjList[node]) {
            if (adj != par) {
                solve(adj, node);
            }
        }
        dp.update(value, prevVal);
    }

    static void coordinateCompress(int[] arr) {
        TreeSet<Integer> values = new TreeSet<>();
        // Get rid of duplicate values
        for (int i = 0; i < arr.length; i++) {
            values.add(arr[i]);
        }
        // Map those onto their index in the sorted order
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for (int value : values) {
            valToIndex.put(value, valToIndex.size());
        }
        // Apply that map on the original array to compress it
        for (int i = 0; i < arr.length; i++) {
            arr[i] = valToIndex.get(arr[i]);
        }
    }

    static class SegmentTree {
        int[] arr;
        int[] tree;
        int[] lo, hi;
        int N;
        // a value that doesn't affect an output (for max it's 0)
        int NEUTRAL = 0;

        public SegmentTree(int[] arr) {
            this.arr = arr;
            int N = arr.length;
            tree = new int[4 * N + 1];
            lo = new int[4 * N + 1];
            hi = new int[4 * N + 1];
            // The original bounds of responsibility the root will be [0, N-1]
            constructSegmentTree(1, 0, N - 1);
        }

        // Construct a node which is responsible for the range specified: left to right inclusive!
        public void constructSegmentTree(int node, int left, int right) {
            if (left == right) {
                lo[node] = left;
                hi[node] = right;
                tree[node] = arr[left];
            }
            else {
                lo[node] = left;
                hi[node] = right;
                int mid = (left + right) / 2;
                constructSegmentTree(2 * node, left, mid);
                constructSegmentTree(2 * node + 1, mid + 1, right);
                tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
            }
        }

        public int merge(int leftVal, int rightVal) {
            return Math.max(leftVal, rightVal);
        }

        public int query(int leftBound, int rightBound) {
            return queryHelper(1, leftBound, rightBound);
        }

        // Query from a fixed range left, right
        private int queryHelper(int node, int leftBound, int rightBound) {
            if (hi[node] < leftBound || rightBound < lo[node]) {
                // We are either too far left or too far right
                return NEUTRAL;
            }
            else if (leftBound <= lo[node] && hi[node] <= rightBound) {
                // Perfectly contained!
                return tree[node];
            }
            else {
                // Partial covering
                int leftVal = queryHelper(2 * node, leftBound, rightBound);
                int rightVal = queryHelper(2 * node + 1, leftBound, rightBound);
                int ans = merge(leftVal, rightVal);
                return ans;
            }
        }

        public void update(int index, int val) {
            updateHelper(1, index, val);
        }

        private void updateHelper(int node, int index, int val) {
            if (hi[node] < index || index < lo[node]) {
                // We are either too far left or too far right
                return;
            }
            else if (index == lo[node] && hi[node] == index) {
                // Found it!
                tree[node] = val;
            }
            else {
                // Not there yet!
                updateHelper(2 * node, index, val);
                updateHelper(2 * node + 1, index, val);
                // Make sure to fix our values on the way back up!
                tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
            }
        }
    }

    static class FastScanner {
        private int BS = 1<<16;
        private char NC = (char)0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            }
            catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar(){
            while(bId==size) {
                try {
                    size = in.read(buf);
                }catch(Exception e) {
                    return NC;
                }
                if(size==-1)return NC;
                bId=0;
            }
            return (char)buf[bId++];
        }

        public int nextInt() {
            return (int)nextLong();
        }

        public int[] nextInts(int N) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong();
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt=1;
            boolean neg = false;
            if(c==NC)c=getChar();
            for(;(c<'0' || c>'9'); c = getChar()) {
                if(c=='-')neg=true;
            }
            long res = 0;
            for(; c>='0' && c <='9'; c=getChar()) {
                res = (res<<3)+(res<<1)+c-'0';
                cnt*=10;
            }
            return neg?-res:res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c!='.' ? cur:cur+nextLong()/cnt;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c>32) {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c!='\n') {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if(c>32)return true;
            while(true) {
                c=getChar();
                if(c==NC)return false;
                else if(c>32)return true;
            }
        }
    }
}