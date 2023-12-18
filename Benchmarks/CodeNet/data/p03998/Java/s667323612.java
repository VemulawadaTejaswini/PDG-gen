import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sa = sc.next();
    String sb = sc.next();
    String sc = sc.next();
    int la = sa.length();
    int lb = sb.length();
    int lc = sc.length();
    int pa = 0;
    int pb = 0;
    int pc = 0;
    int h = 0;
    String ans = "A";
    for(int i = 0; i < (la + lb + lc); i++) {
      if(h == 0) {
        if(pa < la) {
          if(sa.charAt(pa) == 'a') {
            h = 0;
          } else if(sa.charAt(pa) == 'b') {
            h = 1;
          } else {
            h = 2;
          }
          pa++;
        } else {
          break;
        }
      } else if(h == 1) {
        if(pb < lb) {
          if(sb.charAt(pb) == 'a') {
            h = 0;
          } else if(sb.charAt(pb) == 'b') {
            h = 1;
          } else {
            h = 2;
          }
          pb++;
        } else {
          ans = "B";
          break;
        }
      } else {
        if(pc < lc) {
          if(sc.charAt(pc) == 'a') {
            h = 0;
          } else if(sc.charAt(pc) == 'b') {
            h = 1;
          } else {
            h = 2;
          }
          pc++;
        } else {
          ans = "C";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}