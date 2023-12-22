import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(line);
            if (n == 0) {
                break;
            }
            int m = Integer.parseInt(reader.readLine());
            int[][] graph = new int[m][m];
            for (int i = 0; i < m; i++) {
                String[] values = reader.readLine().split(",");
                int a = Integer.parseInt(values[0]);
                int b = Integer.parseInt(values[1]);
                int d = Integer.parseInt(values[2]);
                List<Integer> path = new ArrayList<Integer>();
                path.add(a);
                if (findPath(graph, a, b, path)) {
                    int maxIndex = findMaxEdge(graph, path);
                    if (maxIndex < 0) {
                        continue;
                    }
                    int maxFrom = path.get(maxIndex - 1);
                    int maxTo = path.get(maxIndex);
                    graph[maxFrom][maxTo] = 0;
                    graph[maxTo][maxFrom] = 0;
                }
                graph[a][b] = d;
                graph[b][a] = d;
            }

            int result = 0;
            for (int i = 0; i < m - 1; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (graph[i][j] > 0) {
                        result += graph[i][j] / 100 - 1;
                    }
                }
            }
            out.println(result);
        }
    }

    private static boolean findPath(int[][] graph, int a, int b,
            List<Integer> path) {
        if (graph[a][b] > 0) {
            path.add(b);
            return true;
        }
        for (int i = 0; i < graph.length; i++) {
            if (path.contains(i)) {
                continue;
            }
            if (graph[a][i] > 0) {
                path.add(i);
                if (findPath(graph, i, b, path)) {
                    return true;
                }
                path.remove(path.size() - 1);
            }
        }
        return false;
    }

    private static int findMaxEdge(int[][] graph, List<Integer> path) {
        int maxIndex = 0;
        int maxDistance = 0;
        int from = path.get(0);
        for (int i = 1; i < path.size(); i++) {
            int to = path.get(i);
            int d = graph[from][to];
            if (d > maxDistance) {
                maxDistance = d;
                maxIndex = i;
            }

            from = to;
        }
        return maxIndex;
    }
}