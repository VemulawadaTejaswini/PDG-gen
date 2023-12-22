import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 * D - .. (Double Dots) https://atcoder.jp/contests/abc168/tasks/abc168_d
 */

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);
    Queue<Edge> edgeQueue = new ArrayDeque<>();

    int[] distance = new int[n + 1];
    int[] marks = new int[n + 1];

    Arrays.fill(distance, -1);
    distance[0] = 0;
    distance[1] = 0;

    for (int i = 0; i < m; i++) {
      String[] atob = sc.nextLine().split(" ");
      Edge edge = new Edge(Integer.parseInt(atob[0]), Integer.parseInt(atob[1]));
      edgeQueue.add(edge);
    }
    while (!edgeQueue.isEmpty()) {
      Edge edge = edgeQueue.poll();
      if (distance[edge.va] == -1 && distance[edge.vb] == -1) {
        if (edge.isSearched) {
          //break;
          System.out.println("No");
          return;
        } else {
          edge.isSearched = true;
          edgeQueue.add(edge);
          continue;
        }
      } else if (distance[edge.va] == -1) {
        distance[edge.va] = distance[edge.vb] + 1;
        marks[edge.va] = edge.vb;
      } else if (distance[edge.vb] == -1) {
        distance[edge.vb] = distance[edge.va] + 1;
        marks[edge.vb] = edge.va;
      } else {
        if (distance[edge.va] > distance[edge.vb] + 1) {
          distance[edge.va] = distance[edge.vb] + 1;
          marks[edge.va] = edge.vb;
        }
        if (distance[edge.vb] > distance[edge.va] + 1) {
          distance[edge.vb] = distance[edge.va] + 1;
          marks[edge.vb] = edge.va;
        }
      }
    }

    if (Arrays.asList(distance).contains(-1)) {
      System.out.println("No");
      return;
    }
    System.out.println("Yes");
    for (int i = 2; i < marks.length; i++) {
      System.out.println(marks[i]);
    }
  }
}

class Edge {

  int va;
  int vb;
  boolean isSearched = false;

  public Edge(int va, int vb) {
    this.va = va;
    this.vb = vb;
  }
}