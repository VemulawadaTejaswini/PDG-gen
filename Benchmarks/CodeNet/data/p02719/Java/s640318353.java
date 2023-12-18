import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    long n = in.nextLong();
    long k = in.nextLong();
    if (n < k) {
      System.out.println(n);
    } else if (n == k) {
      System.out.println(0);
    } else {
      long x = n % k;
      long y = Math.abs(x - k);
      System.out.println(x < y ? x : y);
    }
  }
}