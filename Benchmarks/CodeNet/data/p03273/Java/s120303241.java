import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();

    String[][] a = new String[H][W];

    for (int i = 0; i < H; i++) {
      String a_ = sc.next();
      a[i] = a_.split("");
    }

    sc.close();

    for (int i = 0; i < H; i++) {
      
      boolean isShow = false;

      for (int j = 0; j < W; j++) {

        boolean h = false;
        boolean w = false;

        for (int k = 0; k < H; k++) {
          if (a[k][j].equals("#")) {
            h = true;
          }
        }

        for (int k = 0; k < W; k++) {
          if (a[i][k].equals("#")) {
            w = true;
          }
        }

        if (h == true && w == true) {
          System.out.print(a[i][j]);
          isShow = true;
        }

      }

      if (isShow == true) {
        System.out.println("");
      }

    }

  }

}