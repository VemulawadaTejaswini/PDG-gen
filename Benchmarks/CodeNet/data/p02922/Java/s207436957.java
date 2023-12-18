import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int ans = 0;
    for (int i = 0;0 < b;i++) {
      b -= a;
      if (i == 0) {
        a -= 1;
      }
      ans ++;
    }
    System.out.println(ans);
  }
}

