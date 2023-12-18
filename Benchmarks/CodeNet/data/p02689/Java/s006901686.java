//package beginner166.c;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] heights = new int[n];
            for (int i = 0; i < n; ++i) {
                heights[i] = in.nextInt();
            }

            Map<Integer, List<Integer>> adj = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                adj.put(i, new ArrayList<>());
            }

            for (int i = 0; i < m; ++i) {
                int from = in.nextInt() - 1;
                int to = in.nextInt() - 1;

                List<Integer> x = adj.get(from);
                x.add(to);

                List<Integer> y = adj.get(to);
                y.add(from);
            }

            int result = 0;
            for (int i = 0; i < n; ++i) {
                List<Integer> neighbors = adj.get(i);
                boolean isGoodObs = true;

                for (Integer neighbor : neighbors) {
                    if (neighbors.stream().filter(x -> x.equals(neighbor)).count() > 1) {
                        isGoodObs = false;
                        break;
                    }

                    if (heights[neighbor] > heights[i]) {
                        isGoodObs = false;
                        break;
                    }
                }

                if (isGoodObs) {
                    ++result;
                }
            }

            out.println(result);
        }
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

    }
}