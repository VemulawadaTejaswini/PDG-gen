import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine().trim());
    List<Pair> pairs = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      String[] line = sc.nextLine().trim().split(" ");
      int time = Integer.valueOf(line[0]);
      int limit = Integer.valueOf(line[1]);
      pairs.add(new Pair(time, limit));
    }
    Collections.sort(pairs);
    int currentTime = 0;
    for (Pair pair : pairs) {
      currentTime += pair.time;
      if (currentTime > pair.limit) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
  public static class Pair implements Comparable<Pair> {
    final int time;
    final int limit;

    Pair(int time, int limit) {
      this.time = time;
      this.limit = limit;
    }

    @Override
    public int compareTo(Pair o) {
      return limit - o.limit;
    }
  }
}