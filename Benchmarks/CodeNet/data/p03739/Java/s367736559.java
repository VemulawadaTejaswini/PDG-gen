import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    long count1 = 0;
    long sum1 = 0;
    // 最初の和が正
    for (int i = 0; i < n; i++) {
      sum1 += a[i];
      if (i % 2 == 0 && sum1 <= 0) {
        count1 += (-sum1) + 1;
        sum1 = 1;
        // while (sum1 <= 0) {
        //   sum1++;
        //   count1++;
        // }
      } else if (i % 2 == 1 && sum1 >= 0) {
        count1 += sum1 + 1;
        sum1 = -1;
        // while (sum1 >= 0) {
        //   sum1--;
        //   count1++;
        // }
      }
    }
    long count2 = 0;
    long sum2 = 0;
    // 最初の和が負
    for (int i = 0; i < n; i++) {
      sum2 += a[i];
      if (i % 2 == 0 && sum2 >= 0) {
        count2 += sum2 + 1;
        sum2 = -1;
        // while (sum2 >= 0) {
        //   sum2--;
        //   count2++;
        // }
      } else if (i % 2 == 1 && sum2 <= 0) {
        count2 += (-sum2) + 1;
        sum2 = 1;
        // while (sum2 <= 0) {
        //   sum2++;
        //   count2++;
        // }
      }
    }
    long ans = Long.min(count1, count2);
    System.out.println(ans);
  }
}