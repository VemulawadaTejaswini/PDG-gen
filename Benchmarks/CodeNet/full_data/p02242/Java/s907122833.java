import java.util.*;

public class Main {
    private static ArrayList<ArrayList<Integer>> adjList;
    private static int[][] weights;
    private static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        weights = new int[n][n];
        for (int i = 0; i < n; i++) {
            int u = in.nextInt();
            int k = in.nextInt();
            for (int j = 0; j < k; j++) {
                int v = in.nextInt();
                int c = in.nextInt();
                weights[u][v] = c;
                adjList.get(u).add(v);
            }
        }
        in.close();
        int[] dist = minDist();
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    private static int[] minDist() {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<Integer> fringe = new PriorityQueue<>(Comparator.comparingInt(x -> dist[x]));
        fringe.offer(0);
        while (!fringe.isEmpty()) {
            int u = fringe.poll();
            for (int v : adjList.get(u)) {
                int newDist = dist[u] + weights[u][v];
                if (newDist < dist[v]) {
                    fringe.remove(v);
                    dist[v] = newDist;
                    fringe.offer(v);
                }
            }
        }
        return dist;
    }
}

