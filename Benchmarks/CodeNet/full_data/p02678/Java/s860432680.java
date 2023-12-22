import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[] result = new int[n];
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int from = reader.nextInt();
            int to = reader.nextInt();
            edges.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
            edges.computeIfAbsent(to, k -> new ArrayList<>()).add(from);
        }

        ArrayDeque<Integer> bfs = new ArrayDeque<>();
        bfs.addLast(1);
        int visited = 1;
        result[0] = -1;
        while (bfs.size() > 0) {
            int current = bfs.pollFirst();
            for (int next : edges.getOrDefault(current, Collections.emptyList())) {
                if (result[next - 1] == 0) {
                    result[next - 1] = current;
                    bfs.addLast(next);
                    visited++;
                }
            }
        }

        if (visited == n) {
            System.out.println("Yes");
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < result.length; i++) {
                sb.append(result[i]).append('\n');
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("No");
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}