import java.util.Scanner;

class ITP_1_1_C {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int area = a * b;
      int round = 2 * (a + b);

      System.out.println(area + " " + round);
   }
}