import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong() - (long)(i + 1);
      sum += a[i];
    }
    long t = sum / n;
    long ans = Long.MAX_VALUE;
    long s1 = 0;
    long s2 = 0;
    long s3 = 0;
    long s4 = 0;
    long s5 = 0;
    long s6 = 0;
    long s7 = 0;
    long s8 = 0;
    long s9 = 0;
    long s0 = 0;
    for(int i = 0; i < n; i++) {
      s1 += Math.abs(a[i] - t);
    }
    ans = Math.min(ans, s1);
    for(int i = 0; i < n; i++) {
      s2 += Math.abs(a[i] - t - 1);
    }
    ans = Math.min(ans, s2);
    for(int i = 0; i < n; i++) {
      s3 += Math.abs(a[i] - t + 1);
    }
    ans = Math.min(ans, s3);
    for(int i = 0; i < n; i++) {
      s4 += Math.abs(a[i] - t + 2);
    }
    ans = Math.min(ans, s4);
for(int i = 0; i < n; i++) {
      s5 += Math.abs(a[i] - t - 2);
    }
    ans = Math.min(ans, s5);
for(int i = 0; i < n; i++) {
      s6 += Math.abs(a[i] - t + 3);
    }
    ans = Math.min(ans, s6);
for(int i = 0; i < n; i++) {
      s7 += Math.abs(a[i] - t - 3);
    }
    ans = Math.min(ans, s7);
for(int i = 0; i < n; i++) {
      s8 += Math.abs(a[i] - t + 4);
    }
    ans = Math.min(ans, s8);
for(int i = 0; i < n; i++) {
      s9 += Math.abs(a[i] - t - 4);
    }
    ans = Math.min(ans, s9);
for(int i = 0; i < n; i++) {
      s0 += Math.abs(a[i] - t + 5);
    }
    ans = Math.min(ans, s0);
    System.out.println(ans);
  }
}