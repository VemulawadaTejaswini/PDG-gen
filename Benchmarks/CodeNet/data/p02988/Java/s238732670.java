import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }
    
    int ans = 0;
    for (int i = 2; i < n; i++) {
      int p1 = p[i-2];
      int p2 = p[i-1];
      int p3 = p[i];
      if (p1 < p2 && p2 < p3 || p3 < p2 && p2 < p1) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}