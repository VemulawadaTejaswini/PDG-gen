import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < t.length(); i++) {
      set.add((int)t.charAt(i));
    }
    ArrayList[] list = new ArrayList[26];
    for(int i = 0; i < 26; i++) {
      list[i] = new ArrayList();
    }
    for(int i = 0; i < s.length(); i++) {
      int tt = s.charAt(i) - 'a';
      list[tt].add(i + 1);
    }
    int p = 0;
    for(Iterator<Integer> i = set.iterator(); i.hasNext();) {
      int str = i.next();
      int tt = str - 'a';
      if(list[tt].size() == 0) p++;
    }
    if(p > 0) {
      System.out.println(-1);
    } else {
      int slen = s.length();
      int[][] pos = new int[26][slen + 1];
      for(Iterator<Integer> i = set.iterator(); i.hasNext();) {
        int str = i.next();
        int tt = str - 'a';
        int h = 1;
        for(int j = 0; j < list[tt].size(); j++) {
          for(int k = h; k <= (int)list[tt].get(j); k++) {
            pos[tt][k] = (int)list[tt].get(j) - k;
          }
          h = (int)list[tt].get(j) + 1;
        }
        for(int k = h; k <= slen; k++) {
          pos[tt][k] = (int)list[tt].get(0) + slen - k;
        }
      }
      int ans = 1;
      for(int i = 0; i < t.length(); i++) {
        int tt = (int)t.charAt(i) - 'a';
        int r = ans % slen;
        if(r == 0) r = slen;
        ans += pos[tt][r];
      }      
      System.out.println(ans);
    }
  }
}
