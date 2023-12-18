import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    
    int N = s.length();
    if (x < -N || x > N || y < -N || y > N) {
      System.out.println("No");
      return;
    }
    byte okXe[] = new byte[2 * N + 1];
    byte okXo[] = new byte[2 * N + 1];
    byte okYe[] = new byte[2 * N + 1];
    byte okYo[] = new byte[2 * N + 1];
    for (int i = 0; i < 2 * N + 1; i++) {
      okXe[i] = 0;
      okXo[i] = 0;
      okYe[i] = 0;
      okYo[i] = 0;
    }
    okXe[N] = 1;
    okYe[N] = 1;
    
    int state = 0;
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'F') {
        count++;
      }
      if (s.charAt(i) == 'T' || i == s.length() - 1) {
        if (state == 0) {
          move(okXe, okXo, count);
          count = 0;
          state = 1;
        } else if (state == 1) {
          move(okYe, okYo, count);
          count = 0;
          state = 2;
        } else if (state == 2) {
          move(okXo, okXe, count);
          count = 0;
          state = 3;
        } else if (state == 3) {
          move(okYo, okYe, count);
          count = 0;
          state = 0;
        }
      }
    }
    if (okXe[N + x] + okXo[N + x] == 1 && okYe[N + y] + okYo[N + y] == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
  
  public static void move(byte[] a, byte[] b, int step) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 1) {
        b[i - step] = 1;
        b[i + step] = 1;
        a[i] = 0;
      }
    }
  }
}
