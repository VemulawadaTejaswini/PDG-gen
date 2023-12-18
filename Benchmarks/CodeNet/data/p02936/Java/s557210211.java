import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    static List<List<Integer>> edge;
    static int[] count;
    public static void main(String[]$) throws IOException {
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        count = new int[n];
        edge = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge.get(a).add(b);
        }
        for (int i = 0; i < q; i++) {
            int p = scanner.nextInt() - 1;
            int x = scanner.nextInt();
            count[p] += x;
        }
        dfs(0);
        for (int i : count) {
            System.out.println(i);
        }
    }

    static void dfs(int v) {
        for (Integer i : edge.get(v)) {
            count[i] += count[v];
            dfs(i);
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}