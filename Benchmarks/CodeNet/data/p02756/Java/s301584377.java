import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();
    int count = 0;
    for(int i = 0; i < n; ++i) {
      int op = sc.nextInt();
      if(op == 1) {
        ++count;
      }
      if(op == 2) {
        int mid = sc.nextInt();
        boolean did = (mid == 1) && (count & 1) == 0 || (mid == 2 && (count & 1) == 1);
        s = ope2(s, did, sc.next().charAt(0));
      }
    }
    if((count & 1) == 1) s = ope1(s);
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
  
  private static String ope2(String s, boolean d, char p) {
    if(d) return p + "" + s;
    else return s + p;
  }
}