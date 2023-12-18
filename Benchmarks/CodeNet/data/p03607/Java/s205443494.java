import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    Map<Integer, Integer> m = new HashMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      int num = scanner.nextInt();
      if (m.get(num) == null) {
        m.put(num, 1);
      } else {
        m.remove(num);
      }
    }

    System.out.println(m.size());

  }

}