import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner stdIn = new Scanner(System.in);
      int a = stdIn.nextInt();
      int b = stdIn.nextInt();
      int a1 = a*b;
      int a2 = 2*(a+b);
      System.out.printf("%d %d\n", a1, a2);
      }
 }

