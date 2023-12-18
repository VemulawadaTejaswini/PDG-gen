import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[2000];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int[] cost1 = new int[201];
    int cost = 999999;
    int cnt = 0;
    for (int i = -100; i <= 100; i++) {
      for (int j = 0; j < n; j++) {
        if (a[j] != i) cost1[cnt] += (int)Math.pow(Math.abs(a[j] - i), 2);
      }
      cost = Math.min(cost, cost1[cnt]);
      cnt++;
    }

    System.out.println(cost);
  }
}