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

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        System.out.print((i < b ^ j < a ? 1 : 0));
      }
      System.out.println();
    }

  }
}