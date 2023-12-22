import java.util.Scanner;

public class Main {

   public static void main(String args[]) {

      Scanner scan = new Scanner(System.in);

      int k = scan.nextInt();

      int a = scan.nextInt();

      int b = scan.nextInt();
      scan.close();

      Boolean check = false;

      while (true) {

         int i = 1;

         int c = k * i;

         if (c >= a && c <= b) {
            check = true;
         }

         i++;

         if (c > b) {
            break;
         }

      }

      if (check == true) {
         System.out.println("OK");
      } else {
         System.out.println("NG");
      }
   }

}
