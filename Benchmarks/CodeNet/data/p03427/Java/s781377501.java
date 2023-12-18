import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();
    int ans = 9 * (n.length() - 1) + Character.getNumericValue(n.charAt(0)) - 1;

    boolean flag = true;
    for (int i = 0; i < n.length(); i++) {
      if (Character.getNumericValue(n.charAt(i)) != 9) {
        flag = false;
      }
    }

    if (flag == true) {
      ans += 1;
    }

    System.out.println(ans);
  }
}
