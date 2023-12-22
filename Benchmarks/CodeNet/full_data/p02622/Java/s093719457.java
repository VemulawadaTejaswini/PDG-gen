import java.util.*;

class Main{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str_S = sc.next();
    char[] s = str_S.toCharArray();
    String str_T = sc.next();
    char[] t = str_T.toCharArray();
    int result = 0;
    for(int i = 0;i < s.length;i++) {
      if(s[i] != t[i]) {
        result++;
      }
    }
    System.out.println(result);
  }
}