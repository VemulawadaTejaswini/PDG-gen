import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    if (a <= c && b >= d) {
      System.out.println(d-c);
    } else if (b > c && b < d) {
      System.out.println(b-c);
    } else if (b <= c || a <= d) {
      System.out.println(0);
    } else if (c <= a && b <= d) {
      System.out.println(b-a);
    } else if (a < d && d < b) {
      System.out.println(d-a);
    }

  }

}
