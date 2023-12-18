import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    int[] p = new int[n];
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      if(h[a] > h[b]) {
        p[b]++;
      } else {
        p[a]++;
      }
    }
    int ans = 0;
    for(int i = 0; i < n; i++) {
      if(p[i] == 0) ans++; 
    }
    System.out.println(ans);
  }
}