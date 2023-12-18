import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String str = sc.next();
    char[] ch = new char[str.length()];
    for(int i = 0; i < n; i++) ch[i] = str.charAt(i);
    for(int i = 0; i < n; i++) {
      if(ch[i] + n <= 'Z') {
        ch[i] += n;
      } else {
        n = 26 - n;
        ch[i] -= n;
      }
    }
    str = String.valueOf(ch);
    System.out.println(str);
  }
}
