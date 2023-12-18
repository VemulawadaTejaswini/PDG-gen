import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      int res = 1;
      for(int i = 2; i * n <= m; i++) {
        if(m % i == 0) {
          if(m / i >= n) res = i;
        }
      }
      System.out.println(res);
  }
}