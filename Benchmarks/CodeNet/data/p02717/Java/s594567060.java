import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    int t = y;
    y = x;
    x = t;

    int r = x;
    x = z;
    z = r;
    System.out.println(x + " " + y + " " + z);

  }
}
