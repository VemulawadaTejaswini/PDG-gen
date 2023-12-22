import java.util.*;


class Graph {
    private int totalVertex;
    private LinkedList<LinkedList<Integer>> adjList;
    public Graph() { totalVertex = 0; }
    public void loadAdjList() {
        Scanner in = new Scanner(System.in);
        totalVertex = in.nextInt();
        adjList = new LinkedList<LinkedList<Integer>>();
        for(int i = 0; i < totalVertex; i ++) {
            LinkedList<Integer> tmp = new LinkedList<Integer>();
            int idx1 = in.nextInt() - 1;
            int degree = in.nextInt();
            for(int j = 0; j < degree; j ++) {
                int idx2 = in.nextInt() - 1;
                tmp.add(idx2);
            }
            adjList.add(tmp);
        }
        in.close();
    }

    public int[] BFS(int s) {
        int[] distance = new int[totalVertex];
        boolean[] visited = new boolean[totalVertex];
        ArrayList<Integer> toVisit = new ArrayList<Integer>();
        toVisit.add(s);
        for (int i = 0; i < totalVertex; i++) {
            distance[i] = -1;
            visited[i] = false;
        }
        visited[s] = true;
        distance[s] = 0;
        while (toVisit.size() > 0) {
            int vertex = toVisit.remove(0);
            Iterator<Integer> neighbors = adjList.get(vertex).iterator();
            while (neighbors.hasNext()) {
                int next = neighbors.next();
                if (!visited[next]) {
                    toVisit.add(next);
                    distance[next] = distance[vertex] + 1;
                    visited[next] = true;
                }
            }
        }
        return distance;
    }
}

public class Main {
    public static void main(String[] args) {
       Graph g = new Graph();
       g.loadAdjList();
       int[] distance = g.BFS(0);
       for (int i = 0; i < distance.length; i++)
           System.out.println((i+1) + " " + distance[i]);
    }
}

