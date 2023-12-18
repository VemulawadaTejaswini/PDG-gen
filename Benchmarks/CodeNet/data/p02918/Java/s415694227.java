import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int count = 0;
    String str = sc.next();
    char[] ch = new char[n];
    for(int i = 0; i < n; i++) {
      ch[i] = str.charAt(i);
    }
    char temp = ch[0];
    for(int i = 0; i < n; i++) {
      if(temp != ch[i]) {
        count++;
        temp = ch[i];
      }
    }
    int ans = n;
    if(count / 2 >= k) ans -= (count - 2 * k + 1);
    else ans --;
    System.out.println(ans);
  }
}
