import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    int[] dp = new int[n];


    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        dp[j] = Math.min(dp[j], Math.abs(a[i + j] - a[i]) + dp[i]);
      }
    }
    System.out.println(dp[n - 1]);
  }
}