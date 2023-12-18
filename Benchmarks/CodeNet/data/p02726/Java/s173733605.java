import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    Map<Integer, Node> nodes = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      Node node = new Node(i);
      nodes.put(i, node);
    }
    for (Node base : nodes.values()) {
      for (Node target : nodes.values()) {
        base.calculate(target, x, y);
      }
      base.count();
    }
    Map<Integer, Long> answer = nodes.values().stream()
      .flatMap(v -> v.distanceToNumOfId.entrySet().stream())
      .collect(Collectors.groupingBy(
        e -> e.getKey(),
        Collectors.summingLong(e -> e.getValue())
      ));
    for (int i = 1; i < n; i++) {
      pw.println(answer.getOrDefault(i, 0L) / 2);
    }
  }

  static class Node {

    private int id;

    private Map<Node, Integer> idToDistance = new HashMap<>();
    private Map<Integer, Long> distanceToNumOfId;

    public Node(int id) {
      this.id = id;
    }

    void calculate(Node target, int x, int y) {
      int targetId = target.id;
      idToDistance.put(
        target,
        Math.min(Math.min(
          Math.abs(id - target.id),
          Math.abs(x - id) + 1 + Math.abs(y - targetId)),
          Math.abs(y - id) + 1 + Math.abs(x - targetId))
      );
    }

    void count() {
      distanceToNumOfId = idToDistance.values().stream()
        .collect(Collectors.groupingBy(
          Function.identity(),
          Collectors.counting()
        ));
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Node node = (Node) o;
      return id == node.id;
    }

    @Override
    public int hashCode() {
      return Objects.hash(id);
    }

    @Override
    public String toString() {
      return "Node{" +
        "id=" + id +
        '}';
    }
  }
}
