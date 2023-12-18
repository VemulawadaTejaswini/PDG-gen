import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      String s = sc.next();
      
      int count = 0;
      
      if (s.length() % 2 != 0) {
         System.out.println("No");
         count = 1;
      } 
      
      if (count == 0) {
      
         for (int i = 0; i < s.length(); i = i + 2) {
            
            if (s.substring(i, i+2).equals("hi")) {
               count = 0;
            } else {
               count = 2;
               break;
            }
         }
      }
      
      if (count == 0) {
         System.out.println("Yes");
      } else if (count == 2) {
         System.out.println("No");
      }
               
   }        
}
