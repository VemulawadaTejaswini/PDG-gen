import java.util.*;

public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int x = sc.nextInt();
      
      int a = 0;
      int b = 0;
      
      int count = 0;
      
      for (int i = -10000; i < 10000; i++) {
         a = i;
         for (int j = -10000; j < 10000; j++) {
            b = j;
            int aa = (int)Math.pow(a, 5);
            int bb = (int)Math.pow(b, 5);
            int xx = aa - bb;
            if (xx == x) {
               count++;
               break;
            }
         }
         if (count != 0) {
            break;
         }
      }
      
      System.out.println(a + " " + b);
   }
}