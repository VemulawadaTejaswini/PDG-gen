import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int s = S.length();
    
    int ans = 0;
    boolean f = false;
    for(int i = s-1; i >= 0; i--){
      int n = S.charAt(i) - '0';
      if(n == 0) continue;
      int m = 10-n;
      if(n < m){
        ans += n;
        f = false;
      }else{
        ans += m;
        f = true;
      }
    }
    if(f) ans++;
    System.out.println(ans);
  }
}
