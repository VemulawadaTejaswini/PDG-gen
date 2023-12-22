import java.util.*;
public class Bbattle {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int i = 0;

    while (a > 0 && c > 0) {
      if (i % 2 == 0) {
        c -= b;
      } else {
        a -= d;
      }
      i++;
    }
    if (a > 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();

  }
}