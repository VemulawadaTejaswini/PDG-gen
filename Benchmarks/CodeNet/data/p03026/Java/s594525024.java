
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            class hoge {
                int index;
                int value;
                int vertex;
            }
            List<hoge>  c = new ArrayList<>();
            int[][] graph = new int[n+1][n+1];
            int[] d = new int[n+1];
            for (int i = 0; i < n-1; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                d[a[i]]++;
                d[b[i]]++;
                graph[a[i]][b[i]] = 1;
                graph[b[i]][a[i]] = 1;

            }
            for (int i = 0; i < n; i++) {
                hoge h = new hoge();
                h.index = i;
                h.value = sc.nextInt();
                c.add(h);
            }
            int[] visited = new int[n+1];
            Queue<Integer> queue = new ArrayDeque<>();
            c.sort(new Comparator<hoge>() {
                @Override
                public int compare(hoge hoge1, hoge hoge2) {
                    return hoge1.value - hoge2.value;
                }
            });
            int cindex = 0;
            for (int i = 1; i < n+1; i++) {
                if (d[i] == 1) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
            int[] ans = new int[n+1];
            int sum = 0;
            while (!queue.isEmpty()) {
                int l = queue.size();
                for (int i = 0; i < l; i++) {
                    int leaf = queue.poll();
                    if (d[leaf] != 1) {
                        visited[leaf] = 0;
                        continue;
                    }
                    ans[leaf] = c.get(cindex).value;
                    c.get(cindex).vertex = leaf;
                    cindex ++;
                    for (int j = 1; j < n+1; j++) {
                        if (graph[leaf][j] == 1 && visited[j] == 0) {
                            queue.add(j);
                            sum += ans[leaf];
                            visited[j] = 1;
                            graph[leaf][j] = 0;
                            d[leaf] --;
                            graph[j][leaf] = 0;
                            d[j] --;
                        } else if (graph[leaf][j] == 1) {
                            sum += ans[leaf];
                            graph[leaf][j] = 0;
                            d[leaf] --;
                            graph[j][leaf] = 0;
                            d[j] --;
                        }
                    }
                }
            }
            System.out.println(sum);
            c.sort(new Comparator<hoge>() {
                @Override
                public int compare(hoge hoge1, hoge hoge2) {
                    return hoge1.vertex - hoge2.vertex;
                }
            });
            for (int i = 0; i < n; i++) {
                System.out.print(c.get(i).value);
                if (i != n - 1)System.out.print(" ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}