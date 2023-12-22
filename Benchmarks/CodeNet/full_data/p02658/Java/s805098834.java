import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long ans = 1;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if(a == 0) {
        ans = 0;
      } else {
        if(ans <= ((long)Math.pow(10, 18) / a)) {
          if(ans >= 0) ans *= a;
        } else {
          ans = -1;
        }
      }
    }
    System.out.println(ans);
  }
}