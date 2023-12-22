import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
   Scanner S = new Scanner(System.in);

      while(true){

      int x = S.nextInt();
      int y = S.nextInt();

      if (x == 0 && y ==0)break;

      if(x < y) System.out.printf("%d %d\n",x, y);

      else System.out.printf("%d %d\n",y, x);

      }
 }
}

