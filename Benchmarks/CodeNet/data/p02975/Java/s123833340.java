import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static boolean check(final List<Integer> list) {
    return Main.check(list.get(0), list.subList(1, list.size() - 1));
  }
  public static boolean check(final int first, final List<Integer> list) {
    List<Integer> tmpList;
    int a, b, tmp;
    loop: for (int i = 0; i < list.size(); i++) {
      tmpList = list;
      a = first;
      b = tmpList.remove(i);
      while (!tmpList.isEmpty())
        if (tmpList.contains(a ^ b)) {
          tmp = b;
          b = tmpList.remove(tmpList.indexOf(a ^ b));
          a = tmp;
        } else
          continue loop;
      if (tmpList.isEmpty())
        return true;
    }
    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0, end = sc.nextInt(); i < end; i++)
      list.add(sc.nextInt());

    boolean result = Main.check(list);
    System.out.println(result ? "Yes" : "No");
  }
}