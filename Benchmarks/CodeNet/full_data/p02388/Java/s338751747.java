import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input x : ");
      int x = sc.nextInt();
      int xcube = x * x * x;
      System.out.println(xcube);
      sc.close();
   }
}