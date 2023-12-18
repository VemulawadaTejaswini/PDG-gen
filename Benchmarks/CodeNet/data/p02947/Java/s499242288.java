import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Long> map = new HashMap<String, Long>();
    long ans = 0;
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      String[] st = new String[10];
      for(int j = 0; j < 10; j++) {
        String t = String.valueOf(s.charAt(j));
        st[j] = t;
      }
      Arrays.sort(st);
      String m = "";
      for(int j = 0; j < 10; j++) {
        m += st[j];
      }
      if(map.containsKey(m)) {
        ans += (map.get(m));
        map.put(m, map.get(m) + 1);
      } else {
        map.put(m, (long)1);
      }
    }
    System.out.println(ans);
  }
}