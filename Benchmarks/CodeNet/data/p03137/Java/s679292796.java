import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] x = new long[m];
    for(int i = 0; i < m; i++) {
      x[i] = sc.nextLong();
    }
    Arrays.sort(x);
    long[] sa = new long[m - 1];
    for(int i = 0; i < (m - 1); i++) {
      sa[i] = x[i + 1] - x[i];
    }
    Arrays.sort(sa);
    long t = 0;
    if(n >= m) {
      System.out.println(0);
    } else {
      for(int i = m - 2; i >= m - 1 - n; i--) {
        t += sa[i];
      }
      System.out.println(x[m - 1] - x[0] - t);
    }
  }
}
