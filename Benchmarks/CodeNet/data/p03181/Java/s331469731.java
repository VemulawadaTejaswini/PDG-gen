/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        N = sc.nextInt();
        mod = sc.nextInt();
        adjList = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adjList[u].add(v);
            adjList[v].add(u);
        }

        dpDown = new long[N];
        dpUp = new long[N];
        solveDown(0, 0);
        solveUp(0, 0);

        for (int i = 0; i < N; i++) {
            long ans = dpUp[i] * dpDown[i];
            ans %= mod;
            out.println(ans);
        }

        out.close();
    }

    static int N, mod;
    static ArrayList<Integer>[] adjList;
    static long[] dpUp;
    static long[] dpDown;
    // dpDown[node] stores the number of ways for a node's subtree to be colored
    // in a connected way, with node ALWAYS being colored
    // Transition: use all our children + 1, since each one can also be uncolored

    static long solveDown(int node, int par) {
        long ways = 1;
        for (int adj : adjList[node]) {
            if (adj != par) {
                ways *= (solveDown(adj, node) + 1);
                ways %= mod;
            }
        }
        return dpDown[node] = ways;
    }

    static void solveUp(int node, int par) {
        if (node == 0) {
            dpUp[node] = 1;
        }
        else {
            dpUp[node] = dpUp[par] * dpDown[par] / (dpDown[node] + 1) + 1;
            dpUp[node] %= mod;
        }
        for (int adj : adjList[node]) {
            if (adj != par) {
                solveUp(adj, node);
            }
        }
    }

    static class FastScanner {
        public int BS = 1<<16;
        public char NC = (char)0;
        byte[] buf = new byte[BS];
        int bId = 0, size = 0;
        char c = NC;
        double cnt = 1;
        BufferedInputStream in;

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