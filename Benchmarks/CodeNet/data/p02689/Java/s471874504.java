import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n, m;
            n = reader.nextInt();
            m = reader.nextInt();

            ArrayList<Pair> graph[] = new ArrayList[n];
            for (int j = 0; j < n; j++) {
                graph[j] = new ArrayList<>();
            }

            Pair pair[] = new Pair[n];
            for (int j = 0; j < n; j++) {
                pair[j] = new Pair(reader.nextInt(), j);
            }

            for (int j = 0; j < m; j++) {
                int a = reader.nextInt() - 1;
                int b = reader.nextInt() - 1;

                graph[a].add(pair[b]);
                graph[b].add(pair[a]);
            }

            // Sort the graph according to height
            for (int j = 0; j < n; j++) {
                graph[j].sort(Pair.comp);
            }

            boolean isGood[] = new boolean[n];
            for (int j = 0; j < n; j++) {
                isGood[j] = true;
            }
            
            for (int j = 0; j < n; j++) {
                if (isGood[j]) {
                    if (graph[j].size() == 0) {
                        isGood[j] = true;
                    } else {
                        if (pair[j].height > graph[j].get(0).height) {
                            isGood[j] = true;
                            for (int x = 0; x < graph[j].size(); x++) {
                                isGood[graph[j].get(x).index] = false;
                            }
                        } else {
                            isGood[j] = false;
                        }
                    }
                } else {
                    // Ignore this observatory
                }
            }

            int ans = 0;
            for (int j = 0; j < n; j++) {
                if (isGood[j])
                    ans++;
            }

            log.write(ans + "\n");
            log.flush();
            log.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Pair {
        int height;
        int index;

        public Pair(int height, int index) {
            this.height = height;
            this.index = index;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public static final Comparator<Pair> comp = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return Integer.compare(o2.height, o1.height);
            }
        };
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}