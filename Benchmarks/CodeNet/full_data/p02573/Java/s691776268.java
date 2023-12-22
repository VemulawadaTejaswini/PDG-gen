import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(in.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] A = new int[M], B = new int[M];
    for (int i = 0; i < M; ++i) {
      st = new StringTokenizer(in.readLine());
      A[i] = Integer.parseInt(st.nextToken());
      B[i] = Integer.parseInt(st.nextToken());
    }

    System.out.println(solve(N, M, A, B));

    in.close();
  }

  private static int solve(int N, int M, int[] A, int[] B) {
    Map<Integer, Set<Integer>> graph = new HashMap<>();
    for (int i = 0; i < M; ++i) {
      addEdge(graph, A[i], B[i]);
      addEdge(graph, B[i], A[i]);
    }

    int numGroups = 0;
    Integer[] nodeGroupMap = new Integer[N + 1];
    for (int i = 1; i <= N; ++i) {
      if (nodeGroupMap[i] == null) {
        nodeGroupMap[i] = numGroups;
        groupNodes(graph, i, nodeGroupMap, numGroups++);
      }
    }

    int maxGroupSize = 0;
    int[] groupSizes = new int[numGroups];
    for (int i = 1; i <= N; ++i) {
      groupSizes[nodeGroupMap[i]]++;
      maxGroupSize = Math.max(maxGroupSize, groupSizes[nodeGroupMap[i]]);
    }

    return maxGroupSize;
  }

  private static void addEdge(Map<Integer, Set<Integer>> graph, int from, int to) {
    Set<Integer> adjacents = graph.getOrDefault(from, new HashSet<>());
    adjacents.add(to);
    graph.put(from, adjacents);
  }

  private static void groupNodes(Map<Integer, Set<Integer>> graph, int node, Integer[] nodeGroupMap, int group) {
    if (graph.containsKey(node)) {
      for (int next : graph.get(node)) {
        if (nodeGroupMap[next] == null) {
          nodeGroupMap[next] = group;
          groupNodes(graph, next, nodeGroupMap, group);
        }
      }
    }
  }
}