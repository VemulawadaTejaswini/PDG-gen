import java.util.*;
import java.math.BigInteger; 
public class Main {

  public static void main(String[] args) { 
BigInteger max = BigInteger.valueOf(1_000_000_000_000_000_000L);
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      long[] arr = new long[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
        if(arr[i] == 0) {
          System.out.println(0);
          return;
        }
      }
      BigInteger res = BigInteger.ONE;
      for(long num : arr) {
        res = res.multiply(BigInteger.valueOf(num));
        if(res.compareTo(max) > 0) {
          System.out.println(-1);
          return;
        }
      }
      System.out.println(res);
  }
}