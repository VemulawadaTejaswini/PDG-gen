import java.util.*;

class Main {
   static long gcd(long a, long b)
   {
      if(a % b == 0){
         return(b);
         }
      return(gcd(b, a % b));
   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      long    X    = scan.nextLong();
      long    Y    = scan.nextLong();
      int     a    = -1;

      if(X % Y == 0){
         System.out.println(a);
         return;
         }

      for(int i = 2;; i++){
          if(Y % i != 0 && gcd(Y, i) == 1){
             System.out.println(i * X);
             return;
             }
          }
   }
}
