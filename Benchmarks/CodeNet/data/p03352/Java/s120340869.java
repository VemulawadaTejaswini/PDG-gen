import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();

      int max = 1;
      int cur = 1;
      
      for(int i = 2; i * i <= x; i++) {
        int fac = 1;
        while(factor(i, fac + 1) <= x)
          fac++;
        max = Math.max(max, (int)Math.pow(i, fac));
      }
      System.out.println(max);
  }

  private static int factor(int a, int n) {
    if(n == 0)
      return 1;
    if(n == 1)
      return a;
    int fac = factor(a, n / 2);
    return n % 2 == 0 ? fac*fac : fac*fac * a;
  }
}
