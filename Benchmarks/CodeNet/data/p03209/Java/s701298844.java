import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static long ans = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    long[] size = new long[N+1];
    long[] meat = new long[N+1];
    size[0] = 1;
    meat[0] = 1;
    for (int i = 0; i < N ; i++) {
      size[i + 1] = 2 * size[i] + 3;
      meat[i + 1] = 2 * meat[i] + 1;
    }
    calc(N, meat, size, X);
    System.out.println(ans);
  }

  static void calc(int n, long[] meat, long[] size, long x) {
    if (1 == x) {
      return;
    } else if (size[n - 1] + 1 > x) {
      calc(n - 1, meat, size, x - 1);
    } else if (size[n - 1] + 1 == x) {
      ans = ans + meat[n - 1];
    } else if (size[n - 1] + 2 == x) {
      ans = meat[n - 1] + 1 + ans;
    } else if (2 * size[n - 1] + 2 > x) {
      ans = ans + meat[n - 1]+1;
      calc(n - 1, meat, size, x - (size[n - 1] + 2));
    } else {
      ans = ans + meat[n];
    }
  }
}
