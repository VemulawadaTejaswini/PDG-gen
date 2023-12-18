import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    sc.close();

    // +-+-+...の場合
    long sum1 = 0;
    long count1 = 0;

    for (int i = 0; i < n; i++) {
      
      sum1 += a[i];

      if (i % 2 == 0) {
        if (sum1 <= 0) {
          count1 += (1 - sum1);
          sum1 = 1;
        }
      } else {
        if (0 <= sum1) {
          count1 += (sum1 + 1);
          sum1 = -1;
        }
      }

    }

    // -+-+_...の場合
    long sum2 = 0;
    long count2 = 0;

    for (int i = 0; i < n; i++) {
      
      sum2 += a[i];

      if (i % 2 == 0) {
        if (0 <= sum2) {
          count2 += (sum2 + 1);
          sum2 = -1;
        }
      } else {
        if (sum2 <= 0) {
          count2 += (1 - sum2);
          sum2 = 1;
        }
      }

    }

    System.out.println(Math.min(count1, count2));

  }

}