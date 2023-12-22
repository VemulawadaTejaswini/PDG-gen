import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String S = s.next();
    String T = s.next();
    System.out.println(changesRequired(S, T));
    s.close();
  }

  private static Integer changesRequired(String S, String T) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < S.length() - T.length(); i++) {
      int changesRequired = 0;
      for (int j = 0; j < T.length(); j++) {
        if (S.charAt(i + j) != T.charAt(j)) {
          changesRequired++;
        }
      }
      list.add(changesRequired);
    }
    return Collections.min(list);
  }
}
