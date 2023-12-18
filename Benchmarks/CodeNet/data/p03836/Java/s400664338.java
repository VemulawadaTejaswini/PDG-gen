import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    
    int x = tx - sx;
    int y = ty - sy;
    for (int j = 1; j <= 2; j++) {
      for (int i = 1; i <= x; i++) {
        System.out.print("R");
      }
      for (int i = 1; i <= y; i++) {
        System.out.print("U");
      }
      for (int i = 1; i <= x; i++) {
        System.out.print("L");
      }
      for (int i = 1; i <= y; i++) {
        System.out.print("D");
      }
    }
  }
}
