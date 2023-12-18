import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int[] b = new int[n + 1];
    int[] w = new int[n + 1];
    int p = 0;
    for(int i = 0; i < n; i++) {
      if(s.charAt(i) == '.') p++;
    }
    w[0] = p;
    for(int i = 0; i < n; i++) {
      if(s.charAt(i) == '.') { 
        w[i + 1] = w[i] - 1;
        b[i + 1] = b[i];
      } else {
        w[i + 1] = w[i];
        b[i + 1] = b[i] + 1;
      }
    }
    int ans = n;
    for(int i = 0; i <= n; i++) {
      ans = Math.min(ans, b[i] + w[i]);
    }
    System.out.println(ans);
  }
}
