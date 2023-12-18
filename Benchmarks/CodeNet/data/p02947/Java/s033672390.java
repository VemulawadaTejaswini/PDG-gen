
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Integer> map = new HashMap<String, Integer>();

    for (int i = 0; i < n; i++) {
      String in = sc.next();
      char[] chars = in.toCharArray();
      Arrays.sort(chars);
      String s = new String(chars);

      Integer p = map.get(s);
      if (p == null) {
        map.put(s, 1);
      } else {
        map.put(s, p + 1);
      }
    }

    int cnt = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      int i = entry.getValue();
      if (i > 1) {
        // valueC2
        cnt += (i * (i - 1)) / 2;
      }
    }
    System.out.println(cnt);
  }
}
