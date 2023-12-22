
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int ans = 0;
    if(((k % 2) == 0) || ((k % 5) == 0)) {
      ans = -1;
    } else {
      int t = (7 % k);
      if(t == 0) {
        ans = 1;
      } else {
        for(int i = 2; i <= k; i++) {
          t = ((10 * t + 7) % 7);
          if(t == 0) {
            ans = i;
            break;
          }
        }
      }
    }
    System.out.println(ans);
  }
}