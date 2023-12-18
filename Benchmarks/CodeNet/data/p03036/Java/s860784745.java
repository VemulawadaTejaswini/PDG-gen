import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int d = sc.nextInt();
    int x2000 = sc.nextInt();

    int x = r * x2000 - d;
    for (int i = 0; i < 10; i++) {
      System.out.println(x);
      x = r * x - d;
    }
  }
}
