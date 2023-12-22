/* Volume0-0007(借金地獄) */

import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws java.lang.Exception {
    // 入力された値をゲット
    Scanner sc = new Scanner(System.in);
    double n = sc.nextInt();  // 1個目をxにセット
    double kane = 100000;     // 借金を開始
    for(int i=0; i<n; i++) {
      // n週間後の利息
      kane = kane + (kane * 0.05);
    }
    int total = (int)kane;
    // 1000円未満を切り上げて出力
    System.out.println(Math.round((double)total / 10000) * 10000);
  }
}
