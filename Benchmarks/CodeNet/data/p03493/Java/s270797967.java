import java.util.*;

class Main {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int     N    = Integer.parseInt(scan.next(), 2);

      switch(N){
          case 1:
          case 2:
          case 4:
             System.out.println("1");
             break;

          case 3:
          case 5:
          case 6:
             System.out.println("2");
             break;

          case 7:
             System.out.println("3");
             break;

          case 0:
             System.out.println("0");
             break;
             }
   }
}