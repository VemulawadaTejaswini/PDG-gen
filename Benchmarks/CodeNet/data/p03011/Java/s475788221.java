import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();

    int x = Math.min(p+q,q+r);
    int y = Math.min(x,r+p);
    System.out.println(y);

  }
}
