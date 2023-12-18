import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static boolean isL(long n) {
    String x = String.valueOf(n);
    for (int i = 1; i < x.length(); ++i) {
      if (Math.abs((int)x.charAt(i-1) - (int)x.charAt(i)) > 1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    long n = in.nextLong();
    long count = 1;
    for (long k = 3; k <= n; ++k) {
      long temp = n % k;
      if (temp != 0) {
        if (temp == 1) {
          count++;
        }
      } else {
        long tn = n;
        while (tn >= k && tn != 1) {
          tn = tn / k;
        }
        if (tn == 1) count++;
      }
    }
    System.out.println(count);
  }
}