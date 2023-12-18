import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int K = Integer.parseInt(sc.next());

    ArrayList<String> subs = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < 5; j++) {
        if (i + j >= s.length()) {
          break;
        }
        subs.add(s.substring(i, i + j + 1));
      }
    }
    subs.sort(null);
    String ans = subs.get(0);
    int count = 1;
    if (count == K) {
      System.out.println(ans);
      return;
    }
    for (int i = 1; i < subs.size(); i++) {
      if (ans.equals(subs.get(i))) {
        continue;
      } else {
        ans = subs.get(i);
        count++;
      }
      if (count == K) {
        System.out.println(ans);
        break;
      }
    }
  }
}