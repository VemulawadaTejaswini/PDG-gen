import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int N=0,L=0;
      Scanner scanner = new Scanner(System.in);
      N = scanner.nextInt();
      L = scanner.nextInt();
      scanner.close();

      // if (L < 1 && L+N-1 > 0) {
      //    int sum=0;
      //    for (int i=0; i<N; i++) {
      //       sum = sum+(L+i);
      //    }
      //    System.out.println(sum);
      // } else {
         int min = 1000;
         int flag = 0;
         for (int i=0; i<N; i++) {
            if (Math.abs(L+i)<min) {
               min = Math.abs(L+i);
               if (L+i<0) {
                  flag = 0;
               } else {
                  flag = 1;
               }
            }
         }
         int sum=0;
         for (int i=0; i<N; i++) {
            sum = sum+(L+i);
         }
         //System.out.println(min);
         if (flag == 0) {
            sum = sum + min;
         } else{
            sum = sum - min;
         }
         //sum = sum - min;
         System.out.println(sum);
      //}

   }
}
