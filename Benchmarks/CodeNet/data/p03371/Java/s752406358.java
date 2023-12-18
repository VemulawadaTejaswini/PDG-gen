import java.util.Scanner;

class Main {
  public static void main(String argv[]) {
    int a, b, c, x, y, sum = 0;
    Scanner sc = new Scanner(System.in);
    a = Integer.parseInt(sc.next());
    b = Integer.parseInt(sc.next());
    c = Integer.parseInt(sc.next());
    x = Integer.parseInt(sc.next());
    y = Integer.parseInt(sc.next());
    
    if ((a + b) - c*2 >= 0) {
      sum += c * (Math.min(x, y) * 2);
    } else {
      sum += a * x + b * y;
      System.out.println(sum);
      return;
    }
    
    if (x > y) {
      if (a >= c*2) {
        sum += c*2*(x-y);
      } else {
        sum += a*(x^y);
      }
    } else if (y > x) {
      if (b >= c*2) {
        sum += c*2*(y-x);
      } else {
        sum += b*(y-x);
      }
    }
      
      System.out.println(sum);
  }
}