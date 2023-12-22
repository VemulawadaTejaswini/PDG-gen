import java.util.*;

class Main{
  static boolean[][] field = new boolean[12][12];
  
  public static void paint(int x, int y){
    field[x][y] = false;
    if (x > 0 && field[x-1][y]) {
      paint(x-1,y);
    }
    if (y > 0 && field[x][y-1]) {
      paint(x,y-1);
    }
    if (x < 11 && field[x+1][y]) {
      paint(x+1,y);
    }
    if (y < 11 && field[x][y+1]) {
      paint(x,y+1);
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      for (int i = 0; i < 12; i++) {
        String str = sc.next();
        for (int j = 0; j < 12; j++) {
          if (str.charAt(j) == '1') {
            field[i][j] = true;
          }
          else {
            field[i][j] = false;
          }
        }
      }
      int num = 0;
      for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
          if (field[i][j]) {
            paint(i,j);
            num++;
          }
        }
      }
      System.out.println(num);
    }
  }
}