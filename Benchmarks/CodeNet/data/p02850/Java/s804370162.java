import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        Map<Edge, Integer> edgeOrder = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            edgeOrder.put(new Edge(ai-1,bi-1), i);
            adjList.get(ai-1).add(bi-1);
        }
        int k = adjList.get(0).size();
        for (int i = 1; i < n; i++) {
            k = Math.max(adjList.get(i).size()+1, k);
        }
        int[] colors = new int[n-1];
        dfs(0, adjList, 1, colors, edgeOrder);
        System.out.println(k);
        for (int color : colors) {
            System.out.println(color);
        }
    }

    static void dfs(int node, List<List<Integer>> adjList, int color, int[] colors, Map<Edge, Integer> edgeOrder) {
        List<Integer> children = adjList.get(node);
        int i = 1;
        for(int child : children) {
            if(i == color) i++;
            int order = edgeOrder.get(new Edge(node, child));
            colors[order] = i;
            dfs(child, adjList, i, colors, edgeOrder);
            ++i;
        }
    }

    static class Edge {
        final int x;
        final int y;

        public Edge(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return x == edge.x &&
                    y == edge.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
