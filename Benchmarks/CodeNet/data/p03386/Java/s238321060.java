import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      long    A    = scan.nextInt();
      long    B    = scan.nextInt();
      long    K    = scan.nextInt();
      long    u    = 0;

      if((B - A) <= K){
         for(long i = A; i <= B; i++){
             System.out.println(i);
             }
         }
      else{
          for(long i = A; i < A + K; i++){
              System.out.println(i);
              }
          for(long i = B - K + 1; i <= B; i++){
              System.out.println(i);
              }
          }
   }
}
