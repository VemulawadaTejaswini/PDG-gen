import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int M = sc.nextInt();
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      list.add(new ArrayList<>());
    }
    for (int i = 0; i < N; i++) {
      int X = Integer.parseInt(sc.next());
      list.get(X % M).add(X);
    }
    int ans = list.get(0).size() / 2;
    if (M % 2 == 0) ans += list.get(M / 2).size() / 2;
    for (int i = 1; i < (M + 1) / 2; i++) {
      ArrayList<Integer> l1 = list.get(i);
      ArrayList<Integer> l2 = list.get(M - i);
      ans += Math.min(l1.size(), l2.size());
      ArrayList<Integer> l = l1.size() < l2.size() ? l2 : l1;
      HashSet<Integer> exist = new HashSet<>();
      int dup = 0;
      for (int v : l) {
        if (exist.contains(v)) {
          ++dup;
          exist.remove(v);
        } else {
          exist.add(v);
        }
      }
      ans += Math.min(dup, Math.abs(l1.size() - l2.size()) / 2);
    }
    System.out.println(ans);
  }
}
