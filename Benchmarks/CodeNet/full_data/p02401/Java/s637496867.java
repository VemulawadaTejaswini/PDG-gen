import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();
      if (op.equals("+"))
         System.out.printf("%d\n", a + b);
      else if (op.equals("-"))
         System.out.printf("%d\n", a - b);
      else if (op.equals("*"))
         System.out.printf("%d\n", a * b);
      else if (op.equals("/"))
         System.out.printf("%d\n", a / b);
      else if (op.equals("?"))
         System.out.println();
   }
}