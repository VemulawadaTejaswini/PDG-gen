import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int n = sc.nextInt();
      
      int max = 0;
      int y = 0;
      for (int i = n; i >= 0; i=i-1) {
         y = (int)Math.floor(a*i)/b - a*(int)Math.floor(i/b);
         
         if (max < y) {
            max = y;
         }   
         if (max == n) {
            break;
         }   
      }
      
      System.out.println(max);
   }
}
