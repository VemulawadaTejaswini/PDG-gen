
/* ITP1_5_B */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H==0 && W==0) {
        return;   // 終了処理
      } else {
        // 最初の1行目を記述
        for(int i = 0; i < W; i++) {
          System.out.print("#");
        }
        System.out.println();
        // 2行目以降
        // 縦
        for(int x = 1; x < H; x++) {
          System.out.print("#");
          // 横
          for(int y = 1; y < W-2; y++) {
            System.out.print(".");
          }
          System.out.println("#");
        }
        // 最後の1行目を記述
        for(int i = 0; i < W; i++) {
          System.out.print("#");
        }
        System.out.println();
        System.out.println();
      }
    }
  }
}

