import java.util.*;
import java.io.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int h, w, a, b;
    h = sc.nextInt();
    w = sc.nextInt();
    a = sc.nextInt();
    b = sc.nextInt();

    sc.close();

    for (int i = 1; i <= h; i++) {
      for (int j = 1; j <= w; j++) {
        if (i <= b ) {
          if (j <= a) {
            System.out.print("0");
          } else {
            System.out.print("1");
          }
        } else {
          if (j <= a) {
            System.out.print("1");
          } else {
            System.out.print("0");
          }
        }
      }
      System.out.println();
    }

  }
}