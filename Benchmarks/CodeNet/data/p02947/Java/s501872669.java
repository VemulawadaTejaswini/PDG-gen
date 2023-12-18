import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];

    int ans = 0;
    for (int i = 0; i < n; i++) {
      char[] t = sc.next().toCharArray();
      Arrays.sort(t);
      s[i] = "";
      for (int j = 0; j < 10; j++) {
        s[i] += String.valueOf(t[j]);
      }
    }

    for (int i = 0; i < n - 1; i++) {
      String a = s[i];
      for (int j = i + 1; j < n; j++) {
        if (a.equals(s[j])) ans++;
      }
    }
    
    System.out.println(ans);
  }
}
