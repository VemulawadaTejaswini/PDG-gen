/*
2 5 6 9   1
1 4 3 6   0
10 15 1 6 4
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int aEnd = a + w;
    int bEnd = b + w;
    int res = Integer.MAX_VALUE;
    
    if (b <= aEnd || bEnd >= a) {
      res = 0;
    } else {
      int candicate1 = Math.abs(Math.max(a, aEnd) - Math.min(b, bEnd));
      int candicate2 = Math.abs(Math.min(a, aEnd) - Math.max(b, bEnd));
      res = Math.min(candicate1, candicate2);
    }
    System.out.println(res);
  }
}