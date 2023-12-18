import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      if (min > a[i]) {
        min = a[i];
      }
      if (max < a[i]) {
        max = a[i];
      }
    }
    int cost = Integer.MAX_VALUE;
    for (int i = min; i <= max; i++) {
      int tmp = 0;
      for (int j = 0; j < N; j++) {
        tmp += getCost(a[j], i);
      }
      if (cost > tmp) {
        cost = tmp;
      }
    }
    System.out.println(cost);
  }

  public static int getCost(int x, int y) {
    return (x - y) * (x - y);
  }
}