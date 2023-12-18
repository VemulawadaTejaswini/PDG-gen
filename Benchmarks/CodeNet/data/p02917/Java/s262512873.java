import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int b[] = new int[n-1];
    int ans = 0;
    
    for (int i=0; i<n-1; i++) {
      b[i] = Integer.parseInt(sc.next());
    }
    
    ans += b[0] + b[n-2];
    
    for (int i=1; i<n-1; i++) {
      ans += Math.min(b[i], b[i-1]);
    }
    
    System.out.println(ans);
  }
}
