import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      scanner.close();
      if (x>12) {
         System.out.println(y);
      } else if (x < 6) {
         System.out.println(0);
      } else {
         System.out.println(y/2);
      }

   }
}
