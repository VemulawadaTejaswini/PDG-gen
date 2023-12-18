import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0, z;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      z = scanner.nextInt();
      scanner.close();
      int temp;
      temp = z;
      for (int i=1; i<11; i++) {
         temp = x*temp-y;
         System.out.println(temp);
      }

   }
}
