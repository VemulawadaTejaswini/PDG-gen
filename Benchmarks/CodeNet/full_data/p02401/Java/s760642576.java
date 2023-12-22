import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();
      while (true) {
         if (op.equals("?"))  break;
         if ((a >= 0 && a <= 20000) && (b >= 0 && b <= 20000)) {
            if (op.equals("+")) {
               System.out.printf("%d\n", a + b);
            } else if (op.equals("-")) {
               System.out.printf("%d\n", a - b);
            } else if (op.equals("*")) {
               System.out.printf("%d\n", a * b);
            } else if (op.equals("/")) {
               System.out.printf("%d\n", a / b);
            }
         }  break;
      }
   }
}