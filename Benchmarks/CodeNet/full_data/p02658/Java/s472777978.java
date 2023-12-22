import java.util.*;
public class Main {

  public static void main(String[] args) { 
      long max = 1_000_000_000_000_000_000L;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long res = 1L;
      while(n-- > 0) {
        long num = sc.nextLong();
        res *= num;
        if(res > max) {
          res = -1;
          break;
        }

      }
      while(n-- > 0) {
        long num = sc.nextLong();
        if(num == 0) {
          res = 0;
          break;
        }
      }
      System.out.println(res);
  }
}