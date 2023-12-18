import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] b = new int[n+1];

    for (int i = 1; i < n; i++) {
      b[i] = sc.nextInt();
    }

    b[0] = b[1];
    b[n] = b[n-1];
    
    int ans = 0;
    for (int i = 1; i < n; i++) {
      int a = Math.min(b[i-1], b[i]);
      ans += Math.min(a, b[i+1]);
    }
    ans += b[n];
    
    System.out.println(ans);
  }
}
