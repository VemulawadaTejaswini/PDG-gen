import java.util.*;
public class Main {
  static class Count { int value; }
  public static void main(String[] args) {
    String s = new Scanner(System.in).next();
    HashMap<Character,Count> map = new HashMap<>();
    for (int i = 0; i < 4; i++) {
      char ch = s.charAt(i);
      Count x = map.get(ch);
      if (x == null) {
        x = new Count();
        map.put(ch, x);
      }
      x.value++;
    }
    if (map.size() != 2) {
      System.out.println("No");
      return;
    }
    for (Count c : map.values()) {
      if (c.value != 2) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}