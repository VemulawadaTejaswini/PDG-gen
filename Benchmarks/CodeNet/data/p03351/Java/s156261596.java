import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();

      int[] n = {1, 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484, 512, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1000, 1001};

     int i = 0; 
     
      for (i = 0; i < 43; i++) {
         if ( x < n[i]) {
            break;
         }
      }

      System.out.println(n[i-1]);
   }
}