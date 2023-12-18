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
        color = new int[N];
        Arrays.setAll(color, c -> sc.nextInt() - 1);

        adjList = new ArrayList[N];
        Arrays.setAll(adjList, a -> new ArrayList<>());

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adjList[u].add(v);
            adjList[v].add(u);
        }

        colorList = new ArrayList[N];
        Arrays.setAll(colorList, c -> new ArrayList<>());

        inTime = new int[N];
        outTime = new int[N];
        time = 1; // 1-indexed for the BIT
        sub = new int[N];
        parent = new int[N];
        dfs(0, -1);

        BIT bit = new BIT(2 * N);
        for (int i = 0; i < N; i++) {
            bit.add(inTime[i], 1);
        }
        // the time will go up to 2N, maximum!
        long[] ans = new long[N];
        for (int c = 0; c < N; c++) {
            ArrayList<Change> changes = new ArrayList<>();
            if (colorList[c].size() != 0) {
                ans[c] = paths(N); // then, we subtract out bad ones
                ArrayList<Integer> colored = colorList[c];
                for (int i = colored.size() - 1; i >= 0; i--) {
                    int node = colored.get(i);
                    for (int adj : adjList[node]) {
                        if (adj != parent[node]) {
                            // we exclude that parent node when counting paths
                            long subSize = bit.sum(inTime[adj], outTime[adj]);
                            ans[c] -= paths(subSize);
                        }
                    }
                    // Now, we delete this whole sub-subtree!
                    long branchSize = bit.sum(inTime[node], outTime[node]);
                    bit.add(inTime[node], -branchSize);
                    changes.add(new Change(inTime[node], -branchSize));
                }
                long topSize = bit.sum(1, 2 * N);
                ans[c] -= paths(topSize);
            }

            for (Change ch : changes) {
                bit.add(ch.i, -ch.val);
            }
        }
        for (long a : ans) {
            out.println(a);
        }
        out.close();
    }

    static long paths(long size) {
        return size * (size - 1) / 2 + size;
    }

    static ArrayList<Integer>[] adjList;
    static int[] color, parent;
    static ArrayList<Integer>[] colorList;
    static int[] inTime, outTime;
    static int[] sub;
    static int time;

    static void dfs(int node, int par) {
        sub[node] = 1;
        parent[node] = par;
        colorList[color[node]].add(node);
        inTime[node] = time++;
        for (int adj : adjList[node]) {
            if (adj != par) {
                dfs(adj, node);
                sub[node] += sub[adj];
            }
        }
        outTime[node] = time++;
    }

    static class Change {
        int i;
        long val;
        public Change(int ii, long vv) {
            i = ii; val = vv;
        }
    }

    static class BIT {
        long[] tree;
        BIT(int max) {
            tree = new long[max + 1];
        }

        long sum(int i, int j) {
            return prefix(j) - prefix(i - 1);
        }

        long prefix(int i) {
            long ans = 0;
            if (i > 0) {
                for (; i > 0; i -= i & -i) {
                    ans += tree[i];
                }
            }
            return ans;
        }

        void add(int i, long v) {
            for (; i < tree.length; i += i & -i) {
                tree[i] += v;
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