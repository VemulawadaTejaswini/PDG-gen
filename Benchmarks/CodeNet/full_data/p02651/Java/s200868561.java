import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0; i < t; i++) {
      int n = sc.nextInt();
      long[] a = new long[n];
      for(int j = 0; j < n; j++) {
        a[j] = sc.nextLong();
      }
      String s = sc.next();
      HashSet[] list = new HashSet[n + 1];
      for(int j = 0; j <= n; j++) {
        list[j] = new HashSet<Long>();
      }
      list[n].add((long)0);
      for(int j = n - 1; j >= 0; j--) {
        if(s.charAt(j) == '0') {
       //   list[j] = list[j + 1];
          Iterator<Long> it = list[j + 1].iterator();
          while(it.hasNext()) {
            long tt = it.next();
  //          list[j].add(tt);
            tt = (tt ^ a[j]);
            list[j].add(tt);
          }
        } else {
          if(list[j + 1].contains(a[j])) {
            list[j] = list[j + 1];
          }
        }
      }
      int ans = 1;
      if(list[0].contains((long)0)) ans = 0;
      System.out.println(ans);
    }
  }
}