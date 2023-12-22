import java.util.*;
public class Main {

  public static void main(String[] args) { 
      long max = 1_000_000_000_000_000_000L;

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
      long res = 1L;
      for(long num : arr) {
        res *= num;
        if(res > max) {
          System.out.println(-1);
          return;
        }
      }
      System.out.println(res);
  }
}