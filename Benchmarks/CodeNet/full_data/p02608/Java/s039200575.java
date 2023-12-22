import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int N = sc.nextInt();
    for (int i =1; i<N+1; i++) {
      int count =0;
      for (int x =1; x<Math.sqrt(i); x++) {
        for (int y =x; y<Math.sqrt(i); y++) {
          double z = (-(x+y) + Math.sqrt(4 * i - 3 * x * x - 3 * y * y - 2 * x * y))/2;
          if (z % 1 != 0 || z < y) {
            continue;
          } else {
            if (x == y && y == z && z == x) {
              count++;
            } else if (x == y || y == z) {
              count+=3;
            } else {
              count+=6;
            }
          }
        }
      }
      System.out.println(count);
    }
  }
}