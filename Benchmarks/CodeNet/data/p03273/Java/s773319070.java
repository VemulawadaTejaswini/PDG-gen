import java.util.Scanner;

public class Main {
  final static char WHITE = '.';
  final static char BLACK = '#';

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int H = in.nextInt();
      int W = in.nextInt();
      char[][] a = new char[H][W];

      for (int i = 0; i < a.length; ++i) {
        a[i] = in.next().toCharArray();
      }

      boolean[] isRemovedH = new boolean[H];
      boolean[] isRemovedW = new boolean[W];
      
      for (int i = 0; i < a.length; ++i) {
        boolean isAllWhite = true;

         for (int j = 0; j < a[i].length; ++j) {
           if (a[i][j] == BLACK) {
             isAllWhite = false;
             break;
           }
         }

         isRemovedH[i] = isAllWhite;
      }

      for (int j = 0; j < a[0].length; ++j) {
        boolean isAllWhite = true;

         for (int i = 0; i < a.length; ++i){
           if (a[i][j] == BLACK) {
             isAllWhite = false;
             break;
           }
         }

         isRemovedW[j] = isAllWhite;
      }

      for (int i = 0; i < a.length; ++i) {
         if (isRemovedH[i] == false) {
           for (int j = 0; j < a[i].length; ++j) {
             if (isRemovedW[j] == false) {
               System.out.print(a[i][j]);
             }
           }
           System.out.println();
         }
      }
    }
  }
}