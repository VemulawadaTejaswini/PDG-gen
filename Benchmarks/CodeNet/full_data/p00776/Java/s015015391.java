import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  String ans;
  ArrayList<String> list;
  int count;

  void dfs(String str) {
    //check
    char[] rep = str.toCharArray();
    for (int i = 'b'; i <= 'z'; ++i) {
//      rep = rep.replaceFirst((char) i + "", (char) (i - 1) + "");
      for (int j = 0; j < str.length(); ++j) {
        if (str.charAt(j) == i) {
          rep[j] = (char) (i - 1);
          break;
        }
      }
    }
    boolean flag = true;
    for (int i = 0; i < str.length(); ++i) {
      flag &= rep[i] == ans.charAt(i);
    }
    if (!flag) {
      return;
    }
    if (str.length() == ans.length()) {
      if (list.size() < 10) {
        list.add(str);
      } else {
        list.remove(5);
        list.add(str);
      }
      ++count;
    } else {
      char c = ans.charAt(str.length());
      dfs(str + c);
      if (c != 'z') {
        dfs(str + (char) (c + 1));
      }
    }
  }

  void run() {
    for (; ; ) {
      ans = sc.next();
      if (ans.equals("#")) {
        break;
      }
      list = new ArrayList<>();
      count = 0;

      dfs("");

//      debug(list);

      System.out.println(count);
      for (int i = 0; i < Math.min(count, 10); ++i) {
        System.out.println(list.get(i));
      }
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}