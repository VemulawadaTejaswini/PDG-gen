import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int res = 0;
    int count = 0;
    int max = scan.nextInt();
    for (int i = 1; i < N; i++) {
      int h = scan.nextInt();
      if (max >= h) {
        count++;
      } else {
        count = 0;
      }
      res = Math.max(res, count);
      max = h;
    }
    scan.close();
    
    System.out.println(res);
  }
}