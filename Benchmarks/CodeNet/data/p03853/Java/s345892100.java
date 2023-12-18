import java.util.*;

public class Main{
  static char[][] pic;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    pic = new char[H][W];
    for(int i=0; i<H; i++){
      String str = sc.next();
      for(int j = 0; j<W; j++){
        pic[i][j] = str.charAt(j);
      }
    }
    for(int i=0; i<2*H; i++){
      for(int j=0; j<W; j++){
        int k = i/2;
        System.out.print(pic[k][j]);
      }
      System.out.println();
    }
  }
}