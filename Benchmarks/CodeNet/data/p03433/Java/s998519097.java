import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     X     = scan.nextInt();
      int     Y     = scan.nextInt();
      int     count = 0;

      if(X % 500 > Y){
         System.out.println("No");
         }
      else{
          System.out.println("Yes");
          }
   }
}
