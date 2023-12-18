import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long MOD = (long)Math.pow(10, 9) + 7;
    int n = sc.nextInt();
    String s1 = sc.next();
    String s2 = sc.next();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      if(s1.charAt(i) == s2.charAt(i)) {
        list.add(1);
      } else {
        list.add(0);
        i++;
      }
    }
    long ans = 6;
    if(list.get(0) == 1) ans = 3;
    for(int i = 1; i < list.size(); i++) {
      int p = list.get(i - 1);
      int q = list.get(i);
      if((p == 0) && (q == 0)) ans = (ans * 3) % MOD;
      if((p == 0) && (q == 1)) ans = (ans * 1) % MOD;
      if((p == 1) && (q == 0)) ans = (ans * 2) % MOD;
      if((p == 1) && (q == 1)) ans = (ans * 2) % MOD;
    }
    System.out.println(ans);
  }
}