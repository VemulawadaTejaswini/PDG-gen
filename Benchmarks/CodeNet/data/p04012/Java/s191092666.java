
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    Map<String, Integer> m = new HashMap<String, Integer>();
    for (int i = 0; i < s.length(); i++) {
      Integer cnt = m.get(String.valueOf(s.charAt(i)));
      if (cnt != null) {
        cnt = cnt + 1;
      } else {
        cnt = 1;
      }
      m.put(String.valueOf(s.charAt(i)), cnt);
    }

    boolean isBreak = false;
    for (Map.Entry<String, Integer> entry : m.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        isBreak = true;
        break;
      }
    }
    if(isBreak) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}
