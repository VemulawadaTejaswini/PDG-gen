import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int ans = 0;
    int temp = 0;
    char[] ch = new char[str.length()];
    for(int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
      if(ch[i] == 'A' || ch[i] == 'T' || ch[i] == 'C' || ch[i] == 'G') {
        temp++;
      } else {
        ans = Math.max(ans, temp);
        temp = 0;
      }
    }
    ans = Math.max(ans, temp);
    System.out.println(ans);
  }
}
