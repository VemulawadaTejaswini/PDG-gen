import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String ans = "";
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++) {
        for(int k = 0; k < 2; k++) {
          int t = a;
          if(i == 0) {
            t += b;
          } else {
            t -= b;
          }
          if(j == 0) {
            t += c;
          } else {
            t -= c;
          }
          if(k == 0) {
            t += d;
          } else {
            t -= d;
          }
          if(t == 7) {
            ans = String.valueOf(a);
            if(i == 0) {
              ans += "+";
            } else {
              ans += "-";
            }
            ans += String.valueOf(b);
            if(j == 0) {
              ans += "+";
            } else {
              ans += "-";
            }
            ans += String.valueOf(c);
            if(k == 0) {
              ans += "+";
            } else {
              ans += "-";
            }
            ans += String.valueOf(d);
            ans += "=7";
          }
        }
      }
    }
    System.out.println(ans);
  }
}