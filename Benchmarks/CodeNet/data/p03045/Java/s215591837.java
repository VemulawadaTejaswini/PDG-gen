import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try (CustomReader in = new CustomReader()) {
            new Main().execute(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute(CustomReader in) throws IOException {
        int[] nm = in.readLineAsIntArray();
        int N = nm[0];
        int M = nm[1];
        Key[] keys = new Key[M];

        for (int i = 0; i < M; i++) {
            int[] xyz = in.readLineAsIntArray();
            keys[i] = new Key(xyz[0], xyz[1], xyz[2]);
        }
        Arrays.sort(keys, (a, b) -> a.x - b.x);
        int[] cards = new int[N];
        int magic = 1;
        cards[0] = 1;
        for (int i = 0; i < M; i++) {
            Key key = keys[i];
            if (cards[key.x] == 0) {
                cards[key.x] = 1;
                magic++;
            }
            if (key.z == 0) {
                cards[key.y] = cards[key.x];
            } else {
                cards[key.y] = rev(cards[key.x]);
            }
        }
        for (int i = 0; i < N; i++) {
            if (cards[i] == 0) {
                magic++;
            }
        }
        System.out.println(magic);
    }

    private int rev(int x) {
        return (x == 1) ? 2 : 1;
    }

    class Key {
        final int x;
        final int y;
        final int z;

        public Key(int x, int y, int z) {
            this.x = Math.min(x, y) - 1;
            this.y = Math.max(x, y) - 1;
            this.z = z % 2;
        }
    }

    private void dfs(int root, HashMap<Integer, List<Edge>> g, int[] color, boolean[] visited) {
        int rColor = color[root];
        List<Edge> next = g.getOrDefault(root, new ArrayList<>());
        for (Edge e : next) {
            if (!visited[e.to]) {
                if (e.weight % 2 == 0) {
                    color[e.to] = rColor;
                } else {
                    color[e.to] = reverse(rColor);
                }
                visited[e.to] = true;
                dfs(e.to, g, color, visited);
            }
        }
    }

    private int reverse(int col) {
        return (col == 0) ? 1 : 0;
    }

    static class Edge {
        public final int from;
        public final int to;
        public final int weight;

        public Edge(int u, int v, int w) {
            from = u;
            to = v;
            weight = w;
        }
    }

    static class CustomReader extends BufferedReader {

        public CustomReader() throws IOException {
            super(new InputStreamReader(System.in));
        }

        public int[] readLineAsIntArray() throws IOException {
            String[] strArray = this.readLine().split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0, n = strArray.length; i < n; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            return intArray;
        }

        public int[][] readAsIntMatrix(int rows, int columns) throws IOException {
            int[][] matrix = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                String[] r = this.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(r[j]);
                }
            }
            return matrix;
        }

    }
}