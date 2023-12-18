import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static final Set<Character> chars = new HashSet<>();

  static {
    int a = 'a';
    for (int i = 0; i < 26; i++) {
      chars.add((char) (a + i));
    }
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    String s = sc.next();

//    Map<Character, List<Integer>> headsMap = new HashMap<>();
//
//    for (int i = 0; i < s.length(); i++) {
//      char c = s.charAt(i);
//      List<Integer> heads = headsMap.getOrDefault(c, new ArrayList<>());
//      heads.add(i);
//      headsMap.put(c, heads);
//    }

    Map<Character, List<Integer>> headsMap = new HashMap<>();

    int res = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      List<Integer> heads = headsMap.getOrDefault(c, new ArrayList<>());

      for (int l : heads) {
        int k = 0;
        while (l + k < i && i + k < n && s.charAt(l + k) == s.charAt(i + k)) k++;
        res = Math.max(res, k);
      }

      heads.add(i);
      headsMap.put(c, heads);
    }
//
//    int res = 0;
//    for (char c : headsMap.keySet()) {
//      if (headsMap.get(c).size() < 2) continue;
//      List<Integer> heads = headsMap.get(c);
//      for (int i = 0; i < heads.size(); i++) {
//        for (int j = i + 1; j < heads.size(); j++) {
//          int k = 0;
//          while (i + k < j && j + k < s.length() && s.charAt(i + k) == s.charAt(j + k)) k++;
//          res = Math.max(res, k);
//        }
//      }
//    }

    os.println(res);
  }
}