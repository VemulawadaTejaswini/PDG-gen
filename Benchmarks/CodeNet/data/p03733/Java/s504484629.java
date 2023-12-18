import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    
    int stack;
    int ans = 0;
    
    for(int i = 0; i < n; i++) {
      stack = sc.nextInt();
      if(stack < ans) ans = stack + t;
      else ans += t;
    }
    
    System.out.println(ans);
  }
}
