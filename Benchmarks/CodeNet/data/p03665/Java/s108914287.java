import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int t = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if((a % 2) == 1) t++;
    }
    long ans = (long)Math.pow(2, n - 1);
    if(t == 0) {
      if(p == 0) {
        ans = (long)Math.pow(2, n);
      } else {
        ans = 0;
      }
    } 
    System.out.println(ans);
  }
}