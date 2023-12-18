import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int x3 =0,x4 =0,y3 =0,y4 =0;
    int x = Math.abs(x1 - x2);
    int y = Math.abs(y1 - y2);
    if (x1 == x2 && y1 > y2) {
      x3 = x1 + y; y3 = y2;
      x4 = x1 + y; y4 = y1;
    }
    if (x1 == x2 && y1 < y2) {
      x3 = x1 - y; y3 = y2;
      x4 = x1 - y; y4 = y1;
    }
    if (x1 > x2 && y1 == y2) {
      x3 = x2; y3 = y1 + x;
      x4 = x1; y4 = y1 + x;
    }      
    if (x1 < x2 && y1 == y2) {
      x3 = x2; y3 = y1 + x;
      x4 = x1; y4 = y1 + x;
    }      
    if (x1 > x2 && y1 > y2) {
      x3 = x2 - y; y3 = y2 + x;
      x4 = x1 - y; y4 = y1 + x;
    }
    if (x1 < x2 && y1 > y2) {
      x3 = x2 + y; y3 = y1 + x;
      x4 = x1 + y; y4 = y2 + x;
    }
    if (x1 > x2 && y1 < y2) {
      x3 = x2 - y; y3 = y2 - x;
      x4 = x1 - y; y4 = y1 - x;
    }
    if (x1 < x2 && y1 < y2) {
      x3 = x2 - y; y3 = y2 + x;
      x4 = x1 - y; y4 = y1 + x;
    }
    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
  }
}