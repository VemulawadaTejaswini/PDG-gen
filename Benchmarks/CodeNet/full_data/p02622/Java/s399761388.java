import java.util.*;

public class Main {
 
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    String S = sc.nextString();
    String T = sc.nextString();
    
    int ans = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) != T.charAt(i)) {
        ans++;
      }
    }
    
    return ans;
  }
}