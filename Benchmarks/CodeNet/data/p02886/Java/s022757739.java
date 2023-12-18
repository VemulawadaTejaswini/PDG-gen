import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] d = new long[n];
    for(int i = 0; i < n; i++) {
      d[i] = sc.nextLong();
    }
    long ans = 0;
    for(int i = 0; i < n; i++) {
      for(int j = i + 1; j < n; j++) {
        ans += (d[i] * d[j]);
      }
    }
    System.out.println(ans);
  }
}