import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int min = 100;
    int max = -100;
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      min = Math.min(min, a[i]);
      max = Math.max(max, a[i]);
    }
    
    long ans = Long.MAX_VALUE;
    for (int i = min; i <= max; i++) {
      long sum = 0;
      for (int j = 0; j < N; j++) {
        sum += (a[j]-i)*(a[j]-i);
      }
      ans = Math.min(ans, sum);
    }
    
    System.out.println(ans);
  }
}