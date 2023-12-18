import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int hw = 0;
      
      for (int i = 0; i < m; i++) {
         int a = sc.nextInt();
         hw += a;
      }
      if (n - hw >= 0) {
         System.out.println(n - hw);
      } else {
         System.out.println("-1");
      }
      
   }   
}
