import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true){
         int a = Integer.parseInt(sc.next());
         String op = sc.next();
         int b = Integer.parseInt(sc.next());
         if ("?".equals(op)) break;
         if ((a >= 0 && a <= 20000) && (b >= 0 && b <= 20000)) {
            if ("+".equals(op)) {
               System.out.println(a + b);
            } else if ("-".equals(op)) {
               System.out.println(a - b);
            } else if ("*".equals(op)) {
               System.out.println(a * b);
            } else if ("/".equals(op)) {
               System.out.println(a / b);
            }
         }
      }
   }
}