import java.io.*;
import java.util.*;

//すべてのマスが満たすべき条件の時は、ある変数の値を0,正で分けることがフラグ


class Main{
  public static void main(String[] args){
    int[] dx = {-1, 0,0,1};
    int[] dy = { 0,-1,1,0};

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    boolean canpaint = true;
    String bomb = "#";
    char[] charBomb = bomb.toCharArray();
    String[][] s = new String[100][100];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        s[i][j] = sc.next();
      }
    }
    int[][] map = new int[100][100];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if(s[i][j] == bomb){
          int count = 0;
          // boolean exist = true;
          for(int k = 0; k < 4; k++){
            if(0 <= i+dy[k] && i+dy[k] <= h && 0 <= j+dx[k] && j+dx[k] <= w){
              if( s[i+dy[k]][j+dx[k]] != bomb) count++;
            }
            if(count >= 4) {
              canpaint = false;
              break;
            }

          }

        }
      }
    }
    // boolean can = true;
    // for (int i = 0; i < h; i++) {
    //   for (int j = 0; j < w; j++) {
    //     if(s[i].charAt(j) == charBomb[0] && map[i][j] == 0){
    //       can = false;
    //     }
    //   }
    // }

    if(canpaint){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
