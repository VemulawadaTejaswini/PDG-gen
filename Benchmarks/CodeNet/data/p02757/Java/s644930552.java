import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p = sc.nextInt();
      String s = sc.next();
      long res = 0;
      if(p == 2 || p == 5) {
          for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '0' || (s.charAt(i) - '0') % p == 0)
                res += (i + 1);
          }
          System.out.println(res);
          return;
      }
      Map<Integer, Integer> prefixCnt = new HashMap<>();
      prefixCnt.put(0, 1);
      int fac = 1; 
      int cur = 0;
      
      for(int i = s.length() - 1; i >= 0; i--) {
        cur = (cur + (s.charAt(i) - '0') * fac) % p;
        fac = (fac * 10) % p;
        if(prefixCnt.containsKey(cur)) {
          res += prefixCnt.get(cur);
          prefixCnt.put(cur, prefixCnt.get(cur) + 1);
        } else
          prefixCnt.put(cur, 1);
      }
      System.out.println(res);
  }
}