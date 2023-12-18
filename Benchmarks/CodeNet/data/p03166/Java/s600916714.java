import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[][] path = new int[M][2];

    for (int i = 0; i < M; i++) {
      path[i][0] = scanner.nextInt();
      path[i][1] = scanner.nextInt();
    }
    System.out.println(solve(path, N));
  }

  private static int solve(int[][] path, int N) {
    int length = 0;
    Map<Integer, List<Integer>> aList = new HashMap<>();
    for (int[] ints : path) {
      List<Integer> orDefault = aList.getOrDefault(ints[0], new ArrayList<>());
      orDefault.add(ints[1]);
      aList.put(ints[0], orDefault);
    }

    int[] dp = new int[N + 1];
    for (Map.Entry<Integer, List<Integer>> entry : aList.entrySet()) {
      traceThePathWith(entry.getValue(), dp, aList, entry.getKey());
    }
    for (int value : dp) {
      length = Math.max(length, value);
    }

    return length;
  }

  private static List<Integer> traceThePathWith(
      List<Integer> key, int[] dp, Map<Integer, List<Integer>> entry, Integer entryKey) {

    List<Integer> integers = new ArrayList<>();
    for (Integer integer : key) {
      dp[integer] = Math.max(dp[integer], dp[entryKey] + 1);
      if (entry.containsKey(integer)) {
        integers = traceThePathWith(entry.get(integer), dp, entry, integer);
      }
    }
    key.remove(entryKey);
    key.addAll(integers);
    return key;
  }
}
