import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n+1];

    for (int i = 0; i < n; i++) {
      char[] t = sc.next().toCharArray();
      Arrays.sort(t);
      s[i] = "";
      for (int j = 0; j < 10; j++) {
        s[i] += String.valueOf(t[j]);
      }
    }

    s[n] = "zzzzzzzzzzz";
    Arrays.sort(s);
    
    int cnt = 1;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (s[i].equals(s[i+1])) {
        cnt++;
      } else {
        for (int j = 1; j < cnt; j++) {
          ans += j;
        }
        cnt = 1;
      }
    }
    
    System.out.println(ans);
  }
}
