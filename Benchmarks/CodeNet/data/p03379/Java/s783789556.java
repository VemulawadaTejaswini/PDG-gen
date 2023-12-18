import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int a = scan.nextInt();

      long[] ar = new long[a];
      for(int i = 0; i < a; i++){
          ar[i] = scan.nextLong();
          }
      long[] br = new long[a];
      for(int i = 0; i < a; i++){
          br[i] = ar[i];
          }
      for(int i = 0; i < a; i++){
          br[i] = 0;
          Arrays.sort(br);

          System.out.println(br[1+(a/2)]);
          
          for(int l = 0; l < a; l++){
              br[i] = ar[i];
              }
          }
   }
}
