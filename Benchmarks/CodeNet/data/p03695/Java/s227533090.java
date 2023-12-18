import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    int[] rate = new int[9];
    for (int i = 0; i < N; i++) {
      if (3200 <= a[i]) {
        rate[8]++;
      } else {
        rate[a[i] / 400]++;
      }
    }
    int min = 0;
    int max = 0;
    for (int i = 0; i <= 7; i++) {
      if (0 < rate[i]) {
        min++;
        max++;
      }
    }
    max += rate[8];
    if (min == 0) {
      min = 1;
    }
    System.out.println(min + " " + max);
  }
}