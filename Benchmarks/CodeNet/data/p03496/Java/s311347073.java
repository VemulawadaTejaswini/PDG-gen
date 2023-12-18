import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int minIdx = 0, maxIdx = 0;

      for(int i = 1; i <= n; i++) {
        int num = sc.nextInt();
        if(num < min) {
          min = num;
          minIdx = i;
        }
        if(num >= max) {
          max = num;
          maxIdx = i;
        }
      }
      System.out.println(2*n-1);
      if(Math.abs(min) > Math.abs(max)) {
        for(int i = 1; i <= n; i++) {
          System.out.println(minIdx + " " + i);
        }
        for(int i = n; i > 1; i--) {
          System.out.println(i + " " + (i-1));
        }
      } else {
        for(int i = 1; i <= n; i++) {
          System.out.println(maxIdx + " " + i);
        }
        for(int i = 1; i < n; i++) {
          System.out.println(i + " " + (i+1));
        }
      }
  }
}