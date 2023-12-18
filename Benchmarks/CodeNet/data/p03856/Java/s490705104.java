import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int p = s.length() - 1;
    String ans = "NO";
    String str = "";
    while(p >= 0) {
      if(s.charAt(p) == 'm') {
        str = "dream" + str;
        p -= 5;
      } else if(s.charAt(p) == 'e') {
        str = "erase" + str;
        p -= 5;
      } else if(s.charAt(p) == 'r') {
        p -= 2;
        if(p >= 0) {
          if(s.charAt(p) == 'm') {
            if(p >= 4) {
              if((s.charAt(p - 4) == 'd') && (s.charAt(p - 3) == 'r') && (s.charAt(p - 2) == 'e') && (s.charAt(p - 1) == 'a') && (s.charAt(p) == 'm') && (s.charAt(p + 1) == 'e') && (s.charAt(p + 2) == 'r')) {
                str = "dreamer" + str;
                break;
              } else {
                break;
              }
            } else {
              break;
            }
          } else if(s.charAt(p) == 's') {
            if(p >= 3) {
              if((s.charAt(p - 3) == 'e') && (s.charAt(p - 2) == 'r') && (s.charAt(p - 1) == 'a') && (s.charAt(p) == 's') && (s.charAt(p + 1) == 'e') && (s.charAt(p + 2) == 'r')) {
                str = "eraser" + str;
                break;
              } else {
                break;
              }
            } else {
              break;
            }
          } else {
            break;
          }
        } else {
          break;
        }
      } else {
        break;
      }
    }
    if(str.equals(s)) ans = "YES";
    System.out.println(ans);
  }
}
