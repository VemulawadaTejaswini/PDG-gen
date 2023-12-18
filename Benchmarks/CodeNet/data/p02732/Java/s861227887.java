import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      if (map.get(A[i]) == null) {
        map.put(A[i], 1);
      } else {
        map.put(A[i], map.get(A[i]) + 1);
      }
    }

    Map<Integer, Integer> cash = new HashMap<>();

    for (int n : A) {
      int sum = 0;
      if (cash.get(n) != null) {
        System.out.println(cash.get(n));
        continue;
      }
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (n == entry.getKey()) {
          sum += combi(entry.getValue()-1);
        } else {
          sum += combi(entry.getValue());
        }
      }
      System.out.println(sum);
      cash.put(n, sum);
    }
  }

  public static int combi(int n) {
    if (n < 2) return 0;

    return n * (n-1) / 2;
  }

}