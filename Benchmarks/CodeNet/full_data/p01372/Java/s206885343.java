import java.util.*;

public class Main{
  static final char MINUS = 'M';
  static HashSet<Integer> set;

  static boolean isdigit(char ch){
    return '0' <= ch && ch <= '9' || ch == MINUS;
  }

  static String replace(String s){
    int before = s.length();

    while(true){
      for(int i=0;i<s.length();i++){
        if(s.charAt(i) == '('){
          int j = i+1;
          while(isdigit(s.charAt(j)))j++;
          if(s.charAt(j) == ')'){
            s = s.substring(0,i) + s.substring(i+1,j) + s.substring(j+1);
            break;
          }
        }
      }

      if(before == s.length()) return s;
      before = s.length();
    }
  }

  static boolean check(String s){
    for(int i=0;i<s.length();i++){
      if(!isdigit(s.charAt(i))){
        return false;
      }
    }
    return true;
  }

  static int toInt(String s){
    if(s.charAt(0) == MINUS){
      return -1 * Integer.parseInt(s.substring(1));
    }
    else{
      return Integer.parseInt(s);
    }
  }

  static void solve(String s){
    if(check(s)){
      set.add(toInt(s));
      return;
    }

    for(int i=0;i<s.length();i++){
      char op = s.charAt(i);
      if(op != '+' && op != '-' && op != '*' && op != '/') continue;
      if(!isdigit(s.charAt(i-1)) || !isdigit(s.charAt(i+1))) continue;

      int l = i-1;
      int r = i+1;
      while(l>=0 && isdigit(s.charAt(l))) l--;
      while(r<s.length() && isdigit(s.charAt(r))) r++;

      int left = toInt(s.substring(l+1,i));
      int right = toInt(s.substring(i+1,r));
      int cal = 0;

      switch(op){
      case '+': cal = left + right; break;
      case '-': cal = left - right; break;
      case '*': cal = left * right; break;
      case '/':
        if(right == 0) continue;
        cal = left / right;
      }

      String next = "" + Math.abs(cal);
      if(cal < 0) next = MINUS + next;

      solve(replace( s.substring(0,l+1) + next + s.substring(r) ));
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      String s = sc.next();
      if(s.equals("#")) break;
      set = new HashSet<Integer>();
      solve(replace(s));
      System.out.println(set.size());
    }
  }
}