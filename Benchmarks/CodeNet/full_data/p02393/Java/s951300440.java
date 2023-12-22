import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a > b) {// b < a
      if (c > a) {// b < a < c
        System.out.printf("%d %d %d", b, a, c);
      } else if (c < b) {// c < b < a
        System.out.printf("%d %d %d", c, b, a);
      } else {// b < c < a
        System.out.printf("%d %d %d", b, c, a);
      }
    } else {// a < b
      if (c > b) {// a < b < c
        System.out.printf("%d %d %d", a, b, c);
      } else if (c < a) {// c < a < b
        System.out.printf("%d %d %d", c, a, b);
      } else {// a < c < b
        System.out.printf("%d %d %d", a, c, b);
      }
    }

    System.out.printf("\n");
    sc.close();
  }
}

