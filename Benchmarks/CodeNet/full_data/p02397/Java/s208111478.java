import java.util.*;

class Main {

   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      while (x != 0 && y != 0) {
         if (x < y)
            System.out.printf("%d %d\n", y, x);
         else
            System.out.printf("%d %d\n", x, y);
         x = sc.nextInt();
         y = sc.nextInt();
      }
   }
}