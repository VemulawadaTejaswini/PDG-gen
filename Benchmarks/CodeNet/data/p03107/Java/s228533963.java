import java.util.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = scn.nextLine().toCharArray();
    LinkedList<Character> Slist = new LinkedList<>();
    for (Character ch : S) {
      Slist.add(ch);
    }

    int count = 0;
    for (int i = 0; i < Slist.size() - 1; i++) {
      String chunk = Slist.get(i).toString() + Slist.get(i + 1).toString();

      if (chunk.equals("10") || chunk.equals("01")) {
        count += 2;
        Slist.remove(i);
        Slist.remove(i);
        // System.out.println(Slist);
        i -= 2;

        if (i < -1) {
          i = -1;
        }
      }

    }

    System.out.println(count);
  }

}

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = scn.nextLine().toCharArray();

    HashMap<Character, Integer> map = new HashMap<>();
    map.put('0', 0);
    map.put('1', 0);
    for (char ch : S) {
      map.put(ch, map.get(ch) + 1);
    }

    int ans = 2 * Math.min(map.get('0'), map.get('1'));
    System.out.println(ans);

  }

}
