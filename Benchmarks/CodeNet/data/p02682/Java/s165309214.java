import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int sum = Math.min(a, k);
      k -= Math.min(a, k);
      if(k > 0) {
        k -= Math.min(b, k);
        if(k > 0)
          sum -= Math.min(c, k);
      }
      System.out.println(sum);
  }
}