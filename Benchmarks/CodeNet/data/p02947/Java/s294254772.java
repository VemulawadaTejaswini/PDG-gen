import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] t = new int[N][26];
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      for (int j = 0; j < s.length(); j++) {
        t[i][s.charAt(j) - 'a']++;
      }
    }
    long ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (Arrays.equals(t[i], t[j])) {
          ans++;
        }
      }
    }
    System.out.println(ans);
  }


  private static HashMap<Integer, Long> cache = new HashMap<>();
  private static long sum(int v) {
    if (v == 1) {
      return 1;
    }
    Long cached = cache.get(v);
    if (cached != null) {
      return cached;
    }
    long value = v + sum(v-1);
    cache.put(v, value);
    return value;
  }
}