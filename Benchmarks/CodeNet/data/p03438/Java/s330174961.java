import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      int     num   = scan.nextInt();
      int     count = 0;

      int[] A = new int[num];
      int[] B = new int[num];

      for(int i = 0; i < num; i++){
          A[i] = scan.nextInt();
          }
      for(int j = 0; j < num; j++){
          B[j] = scan.nextInt();
          }
      for(int i = 0; i < num; i++){
          count += B[i] - A[i];
          }
      if(count % 3 == 0 && count > 0){
         System.out.println("Yes");
         return;
         }
      else{
          System.out.println("No");
          return;
          }
   }
}
