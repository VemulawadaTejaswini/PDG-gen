import java.util.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean[] used = new boolean[30];
    String ans = "";
    if (s.length() < 26) {
      for (int i=0; i<s.length(); i++) {
        used[Ind(s.charAt(i))] = true;
      }
      for (int i=0; i<30; i++) {
        if(!used[i]) {
          ans = s + ((char) (i + 97));
          break;
        }
      }
    } else {
      int index = -1;
      for (int i = s.length() - 2; i >= 0; i--) {
        if( s.charAt(i) < s.charAt(i+1)) {
          index = i;
          break;
        }
      }
      if (index == -1) {
        ans = "-1";
      } else {
        char c = 'z';
        for (int j = index + 1; j < s.length(); j++) {
          if (s.charAt(j) > s.charAt(index) && s.charAt(j) < c) {
            c = s.charAt(j);
          }
        }
        ans = s.substring(0,index) + c;
      }
    }
    System.out.println(ans);
    
   }
  public static int Ind(char x) {
    return ((int) x) - 97;
  }
}