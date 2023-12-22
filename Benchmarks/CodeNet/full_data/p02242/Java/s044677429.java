import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
public class Main {

  public static Integer getMinNode(HashSet<Integer> unvisited, int[] results) {
    Integer minNode = null;
    int min = Integer.MAX_VALUE;
    Iterator<Integer> it = unvisited.iterator();
    while(it.hasNext()){
      Integer currNode = it.next();
      if (results[currNode] < min) {
        minNode = currNode;
        min = results[currNode];
      }
    }
    return minNode;
  }

  public static int[] dijkstras(
    ArrayList<ArrayList<Integer>> graph,
    ArrayList<ArrayList<Integer>> graphWeights) {

    // Initialize an empty visited set
    HashSet<Integer> visited = new HashSet<Integer>();

    // Initialize unvisisted set with all nodes
    HashSet<Integer> unvisited = new HashSet<Integer>();
    for (int i = 0; i < graph.size(); i++) {
      unvisited.add(i);
    }

    // Initialize results set with all infinity values (except for initial node 0)
    int[] results = new int[graph.size()];
    for (int i = 1; i < graph.size(); i++) {
      results[i] = Integer.MAX_VALUE;
    }

    while (visited.size() < graph.size()) {
      Integer currNode = getMinNode(unvisited, results);
      visited.add(currNode);
      unvisited.remove(currNode);
      ArrayList<Integer> neighbors = graph.get(currNode);
      ArrayList<Integer> neighborsWeights = graphWeights.get(currNode);
      for (int i = 0; i < neighbors.size(); i++) {
        if (results[currNode] + neighborsWeights.get(i) < results[neighbors.get(i)])
          results[neighbors.get(i)] = results[currNode] + neighborsWeights.get(i);
      }
    }

    return results;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> graphWeights = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < n; i++) {
      Integer idx = s.nextInt();
      ArrayList<Integer> neighbors = new ArrayList<Integer>();
      ArrayList<Integer> neighborsWeights = new ArrayList<Integer>();
      int numNeighbors = s.nextInt();
      for (int j = 0; j < numNeighbors; j++) {
        neighbors.add(s.nextInt());
        neighborsWeights.add(s.nextInt());
      }
      graph.add(neighbors);
      graphWeights.add(neighborsWeights);
    }
    s.close();
    int[] results = dijkstras(graph, graphWeights);
    for (int i = 0; i < results.length; i++) {
      System.out.println(i + " " + results[i]);
    }
  }

}

