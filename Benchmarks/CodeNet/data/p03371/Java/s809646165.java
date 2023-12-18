import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      long ans_1 = 0;
      long ans_2 = 0;

      ans_1 = a*x + b*y;

      if(a < b) {
        ans_2 += c*y*2;
        if(x > y) {
          ans_2 += (x-y)*a;
        }
      } else {
        ans_2 += c*x*2;
        if(y > x) {
          ans_2 += (y-x)*b;
        }
      }

      System.out.println(Math.min(ans_1,ans_2));
  }
}