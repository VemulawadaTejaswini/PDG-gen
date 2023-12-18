import java.util.*;
public class Main{

  public static void main(String[] args){
      int MOD = 1000000007;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(Math.abs(n - m) > 1) {
        System.out.println(0);
        return;
      }
      long sum = 1;
      sum = fac(sum, n);
      sum = fac(sum, m);
      if(Math.abs(n - m) == 0)
        sum = sum * 2 % MOD;
      System.out.println(sum);
  }

  private static long fac(long sum, int n) {
      int MOD = 1000000007;
      while(n > 1) {
        sum = sum * n % MOD;
        n--;
      }
      return sum;
  } 
}
