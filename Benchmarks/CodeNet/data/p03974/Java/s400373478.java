import java.io.*;
import java.util.*;

public class Main {

    int[][] next = new int[26][500000];
    int[] id = new int[500000];
    int[] size = new int[500000];
    int[] deg = new int[500000];
    int[] jump = new int[500000];
    int[] parent = new int[500000];
    int[] length = new int[500000];
    int states = 1;

    int add(String s, int i) {
        int cur = 0;
        int cl = 0;
        for (char c : s.toCharArray()) {
            length[cur] = cl;
            if (next[c - 'a'][cur] == -1) {
                next[c - 'a'][cur] = states++;
                parent[next[c - 'a'][cur]] = cur;
                deg[cur]++;
            }
            size[cur]++;
            cur = next[c - 'a'][cur];
            cl++;
        }
        size[cur]++;
        id[cur] = i;
        length[cur] = cl;
        return cur;
    }

    int get(int cur, int k, String s) {
        cur = jump[cur];
        if (id[cur] != -1) {
            if (k == 1) {
                return id[cur];
            }
            k--;
        }


        for (int i = 0; i < s.length(); i++) {
            int nxt = next[s.charAt(i) - 'a'][cur];
            if (nxt == -1) {
                continue;
            }
            if (size[nxt] >= k) {
                return get(nxt, k, s);
            }
            k -= size[nxt];
        }
        return -1;
    }

    public void solve() {
        int n = in.nextInt();
        for (int[] i : next) {
            Arrays.fill(i, -1);
        }
        Arrays.fill(id, -1);
        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            last[i] = add(in.nextToken(), i);
        }
        parent[0] = -1;
        jump[0] = 0;
        for (int i = 1; i < states; i++) {
            jump[i] = i;
            if (id[i] == -1) {
                if (deg[parent[i]] == 1) {
                    jump[i] = jump[parent[i]];
                }
            }
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int k = in.nextInt();
            String s = in.nextToken();

            int cur = last[k - 1];
            int result = 0;

            while (true) {
                int par = jump[cur];
                if (id[par] != -1) {
                    result++;
                }
                if (par == 0) {
                    break;
                }
                int jj = -1;
                for (int j = 0; j < 26; j++) {
                    if (next[j][parent[par]] == par) {
                        jj = j;
                        break;
                    }
                }
                for (int j = 0; j < 26; j++) {
                    if (s.charAt(j) == 'a' + jj) {
                        break;
                    }
                    int nxt = next[s.charAt(j) - 'a'][parent[par]];
                    if (nxt != -1) {
                        result += size[nxt];
                    }
                }
                cur = parent[par];
            }
            out.println(result);
        }
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
