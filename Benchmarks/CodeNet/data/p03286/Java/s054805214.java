import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "";
    while(n != 0) {
      if(Math.abs(n) % 2 == 1) {
        ans = "1" + ans;
        n -= 1;
      } else {
        ans = "0" + ans;
      }
      n = n / (-2);
    }
    if(ans.equals("")) ans = "0";
    System.out.println(ans);
  }
}