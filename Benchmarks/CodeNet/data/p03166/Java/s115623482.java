import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader in;
            PrintWriter out;
            boolean useOutput = false;
            // if (System.getProperty("ONLINE_JUDGE") == null) useOutput = true;
            if (useOutput) {
                FileInputStream fin = new FileInputStream(new File("src/testdata.in"));
                in = new InputReader(fin);
                FileOutputStream fout = new FileOutputStream(new File("src/testData.out"));
                out = new PrintWriter(fout);
            } else {
                InputStream inputStream = System.in;
                in = new InputReader(inputStream);
                OutputStream outputStream = System.out;
                out = new PrintWriter(outputStream);
            }
            Solver solver = new Solver(in, out);
            solver.solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Solver {

        private InputReader cin;
        private PrintWriter cout;

        Solver (InputReader cin, PrintWriter cout) {
            this.cin = cin; this.cout = cout;
        }

        int dis[], used[];
        List<List<Integer>> mp;
        List<Integer> order;

        public void dfs (int index) {
            if (used[index] == 1) return;
            used[index] = 1;
            List<Integer> curList = mp.get(index);
            for (int i = 0; i < curList.size(); ++i) {
                dfs(curList.get(i));
            }
            order.add(index);
        }

        public void solve () {
            try {
                int n = cin.nextInt(), m = cin.nextInt();
                mp = new ArrayList<>();
                dis = new int[n + 1];
                used = new int[n + 1];
                order = new ArrayList<>();
                for (int i = 0; i <= n; ++i) mp.add(new ArrayList<>());
                for (int i = 0; i < m; ++i) {
                    int x = cin.nextInt(), y = cin.nextInt();
                    mp.get(x).add(y);
                }
                Arrays.fill(dis, 0);
                Arrays.fill(used, 0);
                for (int i = 1; i <= n; ++i) {
                    if (used[i] == 0) {
                        dfs(i);
                    }
                }
                int ans = 0;
                for (int i : order) {
                    for (int j : mp.get(i)) {
                        dis[i] = Math.max(dis[i], dis[j] + 1);
                    }
                    ans = Math.max(ans, dis[i]);
                }
                cout.println(ans);
            } catch (RuntimeException e) {
                e.printStackTrace();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}