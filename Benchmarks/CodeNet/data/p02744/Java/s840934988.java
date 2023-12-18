import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    List<StringBuilder> list = rec('a', N - 1);
    for (StringBuilder sb : list) {
      System.out.println(sb.toString());
    }
  }

  private static List<StringBuilder> rec(char ch, int remain) {
    List<StringBuilder> res = new ArrayList<>();
    if (remain == 0) {
      res.add(new StringBuilder().append(ch));
      return res;
    }
    for (char c = 'a'; c <= ch + 1; c++) {
      List<StringBuilder> list = rec(c, remain - 1);
      for (StringBuilder sb : list) {
        StringBuilder sb2 = new StringBuilder().append(ch);
        sb2.append(sb);
        res.add(sb2);
      }
    }
    return res;
  }
}
