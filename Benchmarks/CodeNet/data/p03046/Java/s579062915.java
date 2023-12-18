import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int M = scanner.nextInt();
    int K = scanner.nextInt();
    List<Integer> ans = solve(M, K);
    if (ans == null) {
      System.out.println("-1");
      return;
    }
    StringBuilder sb = new StringBuilder();
    for (int n : ans) sb.append(n).append(' ');
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }

  private static List<Integer> solve(int M, int K) {
    if (K >= (1 << M)) return null;
    List<Integer> list = new ArrayList<>();
    if (K == 1) {
      if (M < 2) return null;
      list.add(2);
      list.add(3);
    } else if (Integer.bitCount(K) == 1) {
      list.add(1);
      list.add(K + 1);
      if (K + 1 >= (1 << M)) return null;
    } else {
      for (int i = 0; i < M; i++) {
        if ((K >> i & 1) == 1) list.add(1 << i);
      }
    }
    LinkedList<Integer> res = new LinkedList<>();
    res.add(K);
    for (int n : list) res.addFirst(n);
    for (int n : list) res.addLast(n);
    res.addLast(K);
    HashSet<Integer> set = new HashSet<>();
    set.add(K);
    set.addAll(list);
    for (int i = 0; i < (1 << M); i++) {
      if (!set.contains(i)) {
        res.addFirst(i);
        res.addLast(i);
      }
    }
    return res;
  }
}
