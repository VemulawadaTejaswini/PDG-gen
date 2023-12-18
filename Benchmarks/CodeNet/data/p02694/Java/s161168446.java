import java.util.Scanner;

public class Main {

   public static void main(String args[]) {

     double a = 100;

     int b;

      Scanner scan = new Scanner(System.in);

      int k = scan.nextInt();

      int num = 0;

      while(true) {


        a = a * 1.01;

        b = (int)a;

        a = (double) b;

        num += 1;

        if (b >= k) {

            break;
        }

    
      }


      System.out.println(String.valueOf(num));

}
}

