import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      long[] arr = new long[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextLong();

      long time = 0;
      long a = 1;
      for(int i = 0; i < n; i++) {
          a = lcm(a, arr[i]);
          time = Math.max(time, a);
      }
      
      System.out.println(time);
  }
  
  private static long lcm(long a, long b) {
      return a * (b / gcd(a, b));
  }
  
  private static long gcd(long a, long b) {
    if(b == 0)
      return a;
    return gcd(b, a % b);
  }
}
