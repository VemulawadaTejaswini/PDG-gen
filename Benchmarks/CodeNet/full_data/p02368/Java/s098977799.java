import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
    static int V;
    static ArrayList<ArrayList<Integer>> G;
    static ArrayList<ArrayList<Integer>> rG;
    static ArrayList<Integer> vs;
    static int[] used;
    static int[] cmp;

    static int scc() {
        // dfs
        Arrays.fill(used, 0);
        vs.clear();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        for (int v=0;v<V;v++) {
            if (used[v]!=1) queue.push(v);
            while (!queue.isEmpty()) {
                Integer rem = queue.peek();
                if (used[rem]==0) {
                    used[rem] = 1;
                    for (int i=0;i<G.get(rem).size();i++) {
                        if (used[G.get(rem).get(i)]==0) queue.push(G.get(rem).get(i));
                        else continue;
                    }
                } else if (used[rem]==1) {
                    used[rem]=2;
                    vs.add(rem);
                    queue.poll();
                } else { // used[rem]==2
                    queue.poll();
                    continue;
                }
            }
        }

        // rdfs
        Arrays.fill(used, 0);
        int k=0;
        for (int j=vs.size()-1;j>=0;j--) {
            int v = vs.get(j);
            if (used[v]!=0) continue;
            ArrayDeque<Integer> st = new ArrayDeque<Integer>();
            st.push(v);
            while (!st.isEmpty()) {
                Integer rem = st.peek();
                if (used[rem]==0) {
                    cmp[rem] = k;
                    used[rem] = 1;
                    for (int i=0;i<rG.get(rem).size();i++) {
                        if (used[rG.get(rem).get(i)]==0) st.push(rG.get(rem).get(i));
                        else continue;
                        st.push(rG.get(rem).get(i));
                    }
                } else if (used[rem]==1) {
                    used[rem]=2;
                    st.poll();
                } else { // used[rem]==2
                    st.poll();
                }
            }
            k++;
        }
        return k;
    }
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        V = in.nextInt();
        int E = in.nextInt();
        G = new ArrayList<ArrayList<Integer>>();
        rG = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<V;i++) {
            ArrayList<Integer> add_1 = new ArrayList<Integer>();
            ArrayList<Integer> add_2 = new ArrayList<Integer>();
            G.add(add_1);
            rG.add(add_2);
        }
        vs = new ArrayList<Integer>();
        used = new int[V];
        cmp = new int[V];
        for (int i=0;i<E;i++) {
            int s = in.nextInt();
            int t = in.nextInt();
            G.get(s).add(t);
            rG.get(t).add(s);
        }

        scc();
        int Q = in.nextInt();
        for (int i=0;i<Q;i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            if (cmp[u]==cmp[v]) out.println(1);
            else out.println(0);
        }

        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

