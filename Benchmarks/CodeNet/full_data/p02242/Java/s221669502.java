import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "10\n" +
            "0 2 1 1 2 3\n" +
            "1 2 3 3 2 1\n" +
            "2 2 3 1 6 10\n" +
            "3 1 4 1\n" +
            "4 1 7 1\n" +
            "5 2 3 1 6 1\n" +
            "6 2 3 1 8 1\n" +
            "7 2 5 1 8 4\n" +
            "8 1 9 100000\n" +
            "9 0";
}

class Solver {
    Solver() {}

    void solve(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());

        long[][] matrix = new long[n][n];
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j ++) {
                matrix[i][j] = Long.MAX_VALUE;
            }
        }

        for (int i = 0 ; i < n; i ++) {
            int[] split = splitInt(scanner.nextLine());
            int u = split[0];
            int k = split[1];
            for (int j = 0; j < k; j ++) {
                int v = split[2 + j * 2];
                int c = split[2 + j * 2 + 1];

                matrix[u][v] = c;
            }
        }

        for (int i = 0; i < n; i ++) {
            long ans = MatrixDijkstra.dijkstra(0, i, matrix, Long.MAX_VALUE);
            System.out.println(i + " " + ans);
        }
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }

    private long[] splitLong(String s) {
        String[] split = s.split(" ");
        long[] splitLong = new long[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitLong[i] = Long.parseLong(split[i]);
        }
        return splitLong;
    }
}

/**
 * ????????? i ??????????????? j ?????§??????????????¢????±?????????¢?????´?????????
 * O(N^2)
 */
class MatrixDijkstra {
    static long dijkstra(int start, int goal, long[][] matrix, long noEdgeValue) {
        long[] dp = new long[matrix.length];
        for (int i = 0; i < dp.length; i ++) {
            dp[i] = noEdgeValue;
        }

        boolean[] visited = new boolean[matrix.length];

        PriorityQueue<NodeDistance> heap = new PriorityQueue<>();
        heap.add(new NodeDistance(start, 0));

        while (heap.size() > 0) {
            NodeDistance top = heap.poll();
            if (visited[top.nodeId]) continue;

            visited[top.nodeId] = true;
            dp[top.nodeId] = top.distance;

            for (int k = 0; k < matrix.length; k ++) {
                if (!visited[k] && matrix[top.nodeId][k] != noEdgeValue) {
                    heap.add(new NodeDistance(k, dp[top.nodeId] + matrix[top.nodeId][k]));
                }
            }
        }

        return dp[goal];
    }
}

class NodeDistance implements Comparable<NodeDistance> {
    int nodeId;
    long distance;

    NodeDistance(int nodeId, long distance) {
        this.nodeId = nodeId;
        this.distance = distance;
    }

    @Override
    public int compareTo(NodeDistance o) {
        return (int) Math.signum(distance - o.distance);
    }
}