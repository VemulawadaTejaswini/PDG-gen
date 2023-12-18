import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int vx = x2 - x1;
    int vy = y2 - y1;

    int vx1 = (-1) * vy;
    int vy1 = vx;
    int vx2 = (-1) * vy1;
    int vy2 = vx1;

    int x3 = x2 + vx1;
    int y3 = y2 + vy1;
    int x4 = x3 + vx2;
    int y4 = y3 + vy2;
    System.out.print(x3);
    System.out.print(" ");
    System.out.print(y3);
    System.out.print(" ");
    System.out.print(x4);
    System.out.print(" ");
    System.out.print(y4);
  }
}