import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      String  X     = scan.next();
      String  Y     = scan.next();
      int     count = 0;

      for(int i = 0; i < 3; i++){
          if(X.charAt(i) != Y.charAt(2 - i)){
             System.out.println("NO");
             }
          else{
              count++;
              }
          }
      if(count == 3){
         System.out.println("YES");
         }
      else{
          System.out.println("NO");
          }
   }
}
