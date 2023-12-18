import java.util.*;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  public void solve() {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String s = input.next();

    String[] s1 = new String[n - 1];
    String[] s2 = new String[n - 1];
    for (int i = 0; i < n - 1; i++) {
      s1[i] = s.substring(0, i + 1);
      s2[i] = s.substring(i + 1);
    }

    int cnt = 0;
    for (int i = 0; i < n - 1; i++) {
      Map<Character, Integer> sum1 = new HashMap<>();
      Map<Character, Integer> sum2 = new HashMap<>();

      char[] c1 = s1[i].toCharArray();
      char[] c2 = s2[i].toCharArray();
      for (int j = 0; j < c1.length; j++)
        if (sum1.containsKey(c1[j])) {
          sum1.put(c1[j], sum1.get(c1[j]) + 1);
        } else {
          sum1.put(c1[j], 1);
        }
      for (int k = 0; k < c2.length; k++)
        if (sum2.containsKey(c2[k])) {
          sum2.put(c2[k], sum2.get(c2[k]) + 1);
        } else {
          sum2.put(c2[k], 1);
        }
      Set<Character> keys = sum1.keySet();
      Iterator<Character> it = keys.iterator();
      int tmp = 0;
      while (it.hasNext()) {
        if (sum2.containsKey(it.next())) {
          tmp++;
        }
      }
      cnt = Math.max(cnt, tmp);
    }

    System.out.println(cnt);
  }
}
