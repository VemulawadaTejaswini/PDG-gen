import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    in.close();
    int num = Integer.parseInt(str.substring(0, 3));
    int ans = Math.abs(753 - num);
    for (int i = 3; i < str.length(); i++) {
      num = (num % 100) * 10 + (int)str.charAt(i);
      int tmp = Math.abs(753 - num);
      if (ans < tmp) {
        ans = tmp;
      }
      if (ans == 0) {
        break;
      }
    }
    System.out.println(ans);
  }
}
    