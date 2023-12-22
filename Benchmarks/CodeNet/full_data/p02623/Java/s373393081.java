import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // n 机A上の本の数
    int n = sc.nextInt();
    // m 机B上の本の数
    int m = sc.nextInt();
    // k 持っている時間
    int k = sc.nextInt();
    int count = 0;
    List<Integer> atimes = new LinkedList<Integer>();
    List<Integer> btimes = new LinkedList<Integer>();

    for (int i = 0; i < n; i++) {
      atimes.add(sc.nextInt());
    }
    for (int j = 0; j < m; j++) {
      btimes.add(sc.nextInt());
    }
    // tester
    // 数学的帰納法よりmin(A, B)を選び続けるのが最小
    int a = atimes.get(0);
    int b = btimes.get(0);
    while (k >= Math.min(a, b)) {
      if (a <= b) {
        k -= a;
        atimes.remove(0);
      } else {
        k -= b;
        btimes.remove(0);
      }
      count++;
      if (!(atimes.isEmpty())) {
        a = atimes.get(0);
      } else {
        a = Integer.MAX_VALUE;
      }
      if (!(btimes.isEmpty())) {
        b = btimes.get(0);
      } else {
        b = Integer.MAX_VALUE;
      }
    }
    System.out.println(count);
  }
}