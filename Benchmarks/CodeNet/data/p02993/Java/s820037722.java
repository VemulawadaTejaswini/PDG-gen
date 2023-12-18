import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      scanner.close();
      int x1 = (int)(x/1000);
      int x2 = (int)((x-x1*1000)/100);
      int y1 = (int)(x/100);
      int y2 = (int)((x-x1*1000)/10);
      int y3 = x-x1*1000-x2*100;
      // System.out.println(y1);
      // System.out.println(y2);
      // System.out.println(y3);
      if (y1%11==0 || y2%11==0 || y3%11==0) {
         System.out.println("Bad");
      } else {
         System.out.println("Good");
      }
   }
}
