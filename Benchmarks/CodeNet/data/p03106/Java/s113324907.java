import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int ans = 0;
    int p = 1;
    for(int i = Math.min(a, b); i >= 1; i--) {
      if(((a % i) == 0) && ((b % i) == 0)) {
        if(p == k) {
          ans = i;
        } else {
          
        }
        p++;
      }
    }
    System.out.println(ans);
  }
}