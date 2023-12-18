import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();
    for(int i = 0; i < n; ++i) {
      int op = sc.nextInt();
      if(op == 1) {
        s = ope1(s);
      }
      if(op == 2) {
        s = ope2(s, sc.nextInt(), sc.next().charAt(0));
      }
    }
    System.out.println(s);
  }
  
  private static String ope1(String s) {
    StringBuffer str = new StringBuffer();
    char[] a = s.toCharArray();
    for(int i = a.length - 1; i > -1; --i) {
      str.append(a[i] + "");
    }
    return str.toString();
  }
  
  private static String ope2(String s, int num, char p) {
    if(num == 1) return p + "" + s;
    else return s + p;
  }
}