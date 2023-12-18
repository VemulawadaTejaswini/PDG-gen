import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    String pixel[][];
    pixel = new String[H][W];
    for (int i=0; i<H; i++) {
      for (int j=0; j<W; j++) {
        pixel[i][j] = sc.next();
      }
    }

    String newPixel[][];
    newPixel = new String[2*H][W];
    for (int i=0; i<H; i+=2) {
      for (int j=0; j<W; j++) {
        newPixel[i][j] = pixel[i][j];
        newPixel[i+1][j] = pixel[i][j];
      }
    }

    for (int i=0; i<2*H; i++) {
      for (int j=0; j<W; j++) {
        System.out.print(newPixel[i][j]);
      }
      System.out.print("\n");
    }
  }
}
