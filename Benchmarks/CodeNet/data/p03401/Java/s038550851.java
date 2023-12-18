import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 0;
    long sum = 0;
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    sum = Math.abs(a[0]) + Math.abs(a[n - 1]);
    for(int i = 0; i < (n - 1); i++) {
      sum += Math.abs(a[i] - a[i + 1]);
    }
    System.out.println(sum - Math.abs(a[0]) - Math.abs(a[0] - a[1]) + Math.abs(a[1]));
    for(int i = 1; i < (n - 1); i++) {
      System.out.println(sum - Math.abs(a[i - 1] - a[i]) - Math.abs(a[i] - a[i + 1]) + Math.abs(a[i - 1] - a[i + 1]));
    }
    System.out.println(sum - Math.abs(a[n - 1]) - Math.abs(a[n - 1] - a[n - 2]) + Math.abs(a[n - 2]));
  }
}