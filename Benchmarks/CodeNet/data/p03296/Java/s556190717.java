import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int p = 1;
    int a = sc.nextInt();
    for(int i = 1; i < n; i++) {
      int b = sc.nextInt();
      if(a == b) {
        p++;
        if(i == (n - 1)) ans += (p / 2); 
      } else {
        ans += (p / 2);
        p = 1;
      }
      a = b;
    }
    System.out.println(ans);
  }
}