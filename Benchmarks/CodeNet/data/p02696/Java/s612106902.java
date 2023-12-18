import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();
      
      int max = 0;
      int y = 0;
      for (int i = 0; i <= n; i++) {
 //        if (i/b == 0 && i != 0) {
 //           y = a*i + a;
//         } else {
            y = a*i/b - a*(i/b);
 //        }
         if (max < y) {
            max = y;
         }      
      }
      
      System.out.println(max);
   }
}
