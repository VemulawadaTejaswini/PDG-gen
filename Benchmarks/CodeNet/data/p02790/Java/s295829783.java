import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int A = Integer.parseInt(a);
    int B = Integer.parseInt(b);
    String ax = "";
    String bx = "";
    for (int i=0; i<B; i++) {
      ax += a;
    }
    for (int i=0; i<A; i++) {
      bx += b;
    }
    if (ax.compareTo(bx) < 0) {
      System.out.println(ax);
    } else {
      System.out.println(bx);
    }
  }
}
    