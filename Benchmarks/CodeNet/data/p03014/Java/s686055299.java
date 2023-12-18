import java.util.*;

public class Main {
  static int[][] rowLeftBlock;
  static int[][] rowRightBlock;
  static int[][] colUpperBlock;
  static int[][] colLowerBlock;
  static int H;
  static int W;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    H = sc.nextInt();
    W = sc.nextInt();
    rowLeftBlock = new int[H][W];
    rowRightBlock = new int[H][W];
    colUpperBlock = new int[H][W];
    colLowerBlock = new int[H][W];
    sc.nextLine();
    String[] S = new String[H];
    for (int i = 0; i < H; i++) {
      S[i] = sc.nextLine();      
    }
    for (int i = 0; i < H; i++) {
      int left = -1;
      int right = W;
      for (int j = 0; j < W; j++) {
        if(S[i].charAt(j) == '#') left = j;
        if(S[i].charAt(W-1-j) == '#') right = W-1-j;
        rowLeftBlock[i][j] = left;
        rowRightBlock[i][W-1-j] = right;
      }
    }
   
    for (int j = 0; j < W; j++) {
      int lower = H;
      int upper = -1;
      for (int i = 0; i < H; i++) {
        if(S[i].charAt(j) == '#') upper = i;
        if(S[H-1-i].charAt(j) == '#') lower = H-1-i;
        colUpperBlock[i][j] = upper;
        colLowerBlock[H-1-i][j] = lower;
        
      }
    }
    int best = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {      
        if(S[i].charAt(j) == '#') {
          continue;
        } else {
          int candidate = rowRightBlock[i][j] - rowLeftBlock[i][j] - 1;
          candidate += colLowerBlock[i][j] - colUpperBlock[i][j] - 1;
          candidate--;
          best = Math.max(best, candidate);
        }
      }
    }
    System.out.println(best);    
  }
}