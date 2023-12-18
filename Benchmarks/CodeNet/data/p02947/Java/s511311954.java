import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = Integer.parseInt(in.nextLine());
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      char[] s = in.nextLine().toCharArray();
      Arrays.sort(s);
      String str = String.valueOf(s);
      map.put(str, map.getOrDefault(str, 0) + 1);
    }
    int ans = 0;
    for (String str : map.keySet()) {
      int cnt = map.get(str);
      if (cnt > 1) {
        ans += (cnt * (cnt - 1)) / 2;
      }
    }
    System.out.println(ans);
  }
}
