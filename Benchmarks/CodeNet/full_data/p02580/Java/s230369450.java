import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] HWM = sc.nextLine().split(" ");
    int H = Integer.parseInt(HWM[0]);
    int W = Integer.parseInt(HWM[1]);
    int[] lineH = new int[H];
    int[] lineW = new int[W];
    int M = Integer.parseInt(HWM[2]);
    boolean[][] map = new boolean[H][W];
    
    String[] tem;
    int a = 0;
    int b = 0;
    for(int i = 0; i < M; ++i) {
      tem = sc.nextLine().split(" ");
      a = Integer.parseInt(tem[0]) - 1;
      b = Integer.parseInt(tem[1]) - 1;
      ++lineH[a];
      ++lineW[b];
      map[a][b] = true;
    }
    
    int maxH = 0;
    int maxAns = 0;
    
    for(int i = 0; i < lineH.length; ++i) {
      if(lineH[i] >= maxH) {
        for(int j = 0; j < lineW.length; ++j) {
          if(maxAns < lineH[i] + lineW[j] - (map[i][j] ? 1 : 0)) {
            maxAns = lineH[i] + lineW[j] - (map[i][j] ? 1 : 0);
          }
        }
      }
    }
    
    System.out.println(maxAns);
  }
}