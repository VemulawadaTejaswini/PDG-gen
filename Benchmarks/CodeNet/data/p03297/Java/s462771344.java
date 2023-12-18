import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    long[] c = new long[n];
    long[] d = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      b[i] = sc.nextLong();
      c[i] = sc.nextLong();
      d[i] = sc.nextLong();
    }

    for (int i=0; i < n; i++) {
      long count = a[i];
      long tmp = -1;
      int ans = -1;

      while (true) {
        count = (count - b[i]) % b[i];

        if (count < 0) break;

        if (count <= c[i]) {
          count += d[i];
          if (tmp == count) {
            ans = 1;
            break;
          } else  if (tmp == -1) {
            tmp = count;
          }
        }
      }

      if (ans == 1) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
