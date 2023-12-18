import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s = sc.next();
    int first = 0;
    int l = 0;
    if(s.charAt(0) == ')') first = 1;
    if(s.charAt(s.length() - 1) == '(') l = 1;
    int plus = 0;
    int minus = 0;
    int lastP = 0;
    int firstM = 0;
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == '(') {
        plus++;
      } else {
        minus++;
      }
    }
    if(first == 1) {
      for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == ')') {
          firstM++;
        } else {
          break;
        }
      }
    }
    if(l == 1) {
      for(int i = s.length() - 1; i >= 0; i--) {
        if(s.charAt(i) == '(') {
          lastP++;
        } else {
          break;
        }
      }
    }
    String firstP = "";
    String lastM = "";
    for(int i = 0; i < firstM; i++) {
      firstP += "(";
    }
    for(int i = 0; i < lastP; i++) {
      lastM += ")";
    }
    String ans = firstP + s + lastM;
    int p = plus - lastP;
    int m = minus - firstM;
    if(p > m) {
      String a = "";
      for(int i = 0; i < (p - m); i++) {
        a += ")";
      }
      ans = ans + a;
    }
    if(p < m) {
      String a = "";
      for(int i = 0; i < (m - p); i++) {
        a += "(";
      }
      ans = a + ans;
    }
    System.out.println(ans);
  }
}