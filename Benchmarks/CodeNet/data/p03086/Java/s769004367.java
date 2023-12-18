import java.util.ArrayList;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int cnt = 0;
    char[] reg = { 'A', 'G', 'C', 'T' };
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (int i = 0; i < s.length(); i++) {
      boolean iscont = false;
      for (int j = 0; j < 4; j++) {
        if (s.charAt(i) == reg[j]) {
          cnt++;
          iscont = true;
          break;
        }
      }
      if (!iscont) {
        ans.add(cnt);
        cnt = 0;
      }
    }
    ans.add(cnt);
    int max = ans.get(0);
    for (int i = 1; i < ans.size(); i++) {
      if (max < ans.get(i)) {
        max = ans.get(i);
      }
    }
    System.out.println(max);
  }

}
