import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String s = sc.next();

    String check = "";
    int flg = 0;
    int cnt = 0;
    int cnt2 = 0;
    
    for (int i=0; i<n; i++) {
      check = s.substring(i,i+1);
      if (flg == 0 && check.equals("#")) {
        flg++;
      }
      if (flg == 1 && check.equals(".")) {
        cnt++;
      }
    }
    
    flg = 0;
    
    for (int i=0; i<n; i++) {
      check = s.substring(n-i-1,n-i);
      if (flg == 0 && check.equals(".")) {
        flg++;
      }
      if (flg == 1 && check.equals("#")) {
        cnt2++;
      }
    }
    
    System.out.println(Math.min(cnt,cnt2));
  }
}
