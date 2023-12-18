import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "Yes";
    List<Integer> list = new ArrayList<Integer>();
    list.add(sc.nextInt());
    for (int i = 1; i < N; i++) {
      list.add(sc.nextInt());
      int formar = list.get(i - 1);
      int latter = list.get(i);
      if (latter - formar != 0) {
        if (list.get(i) - list.get(i - 1) == 1) {
          list.set(i, list.get(i) - 1);
        } else {
          ans = "No";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}
