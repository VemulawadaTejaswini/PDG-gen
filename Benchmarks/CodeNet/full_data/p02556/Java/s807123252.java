import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] x = new long[n];
    long[] y = new long[n];
    long max = 0;
    long mod = 1000000007;
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextLong();
      y[i] = sc.nextLong();
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        long temp = (Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j])) % mod;
        if (max < temp) {
          max = temp;
        }
      }
    }
    System.out.println(max);
  }
}