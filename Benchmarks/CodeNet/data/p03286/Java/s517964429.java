import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    String ans = "";
    if(n == 0) ans = "0";
    if(n != 0) {
      while(n != 0) {
        int n1 = Math.abs(n);
        if((n1 % 2) == 0) {
          ans = "0" + ans;
        } else {
          ans = "1" + ans;
        }
        n -= (n1 % 2);
        n /= (-2);
      }
    }
    System.out.println(ans);
  }
}