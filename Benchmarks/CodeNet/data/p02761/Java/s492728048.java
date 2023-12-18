import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] s = new int[m];
    int[] c = new int[m];


    for (int i = 0; i < m; i++) {
      s[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }

    TreeMap<Integer,Integer> mp = new TreeMap<Integer,Integer>();

    for (int i = 0; i < m; i++) {
      if (mp.containsKey(s[i])) {
        int k = mp.get(s[i]);
        if (k != c[i]) {
          System.out.println(-1);
          return;
        }
      }
      mp.put(s[i],c[i]);
    }

    String h = "";

    for (int i = 1; i <= n; i++) {
      Integer x = mp.get(i);
      if (mp.containsKey(x)) {
        System.out.println(-1);
        return;
      }
      if (x == null) {
        if (i == 1) {
          h += "1";
        } else {
          h += "0";
        }
      } else {
        h += String.valueOf(x);
      }
    }

    if (h.charAt(0) == '0') {
      System.out.println(-1);
    } else {
      System.out.println(h);
    }

  }
}
