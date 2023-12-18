import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      int[][] z;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      z = new int[y][2];
      for (int i=0; i<y; i++) {
         for (int j=0; j<2; j++) {
            z[i][j] = scanner.nextInt();
         }
      }
      scanner.close();
      int sum = 0;
      int i,j;
      for (i = 0; i<x; i++) {
         for (j=0; j<y; j++) {
            if (i+1 >= z[j][0] && i+1 <= z[j][1]) {
               continue;
            } else {
               break;
            }
         }
         if (j==y) {
            sum++;
         }
      }
      System.out.println(sum);
   }
}
