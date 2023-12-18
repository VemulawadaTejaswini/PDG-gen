import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] as = new int[n];
    for (int i = 0; i < n; i++) {
      as[i] = sc.nextInt();
    }
    long[] sums = new long[n];

    long count = 0;
    if (as[0] == 0) {
      int add = 1;
      for (int i = 1; i < n; i++) {
        int now = as[i];
        if (now != 0) {
          add = now < 0 ? 1 : -1;
          if (i % 2 == 1) {
            add = -add;
          }
          break;
        }
      }
      as[0] = add;
      count = Math.abs(add);
    }
    sums[0] = as[0];
    for (int i = 1; i < n; i++) {
      sums[i] = sums[i - 1] + as[i];
    }
    for (int i = 1; i < n; i++) {
      long prev = sums[i - 1];
      long now = sums[i];
      if (prev < 0 && 0 < now || 0 < prev && now < 0) {
        continue;
      }
      long add = -now + (now < 0 ? 1 : -1);
      as[i] += add;
      for (int j = i; j < n; j++) {
        sums[j] += add;
      }
      count += Math.abs(add);
    }
    System.out.println(count);
  }
}
