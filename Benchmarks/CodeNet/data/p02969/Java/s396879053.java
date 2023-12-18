import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      scanner.close();
      System.out.println(3*x*x);
   }
}
