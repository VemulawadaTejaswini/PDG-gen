import java.util.*;

public class Main{
  static int H, W;
  static char[][] field;
  static int[][] var, hor;
  static boolean[][] reached_v, reached_h;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    H = Integer.parseInt(S[0]);
    W = Integer.parseInt(S[1]);
    
    field = new char[H][W];
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        field[i][j] = T.charAt(j);
      }
    }
    
    var = new int[H][W];
    hor = new int[H][W];
    reached_v = new boolean[H][W];
    reached_h = new boolean[H][W];
    
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(!reached_v[i][j]){
          var[i][j] = func1(i,j,0);
        }
      }
    }
    
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(!reached_h[i][j]){
          hor[i][j] = func2(i,j,0);
        }
      }
    }
    
    int ans = 0;
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        int n = var[i][j] + hor[i][j];
        ans = ans < n ? n : ans; 
      }
    }
    System.out.println(ans-1);
  }
  
  public static int func1(int h, int w, int count){
    if(h >= H || w >= W || h < 0 || w < 0){
      return count;
    }
    reached_v[h][w] = true;
    if(field[h][w] == '#'){
      return count;
    }
    
    return var[h][w] = func1(h+1, w, count+1);
  }
  
  public static int func2(int h, int w, int count){
    if(h >= H || w >= W || h < 0 || w < 0){
      return count;
    }
    reached_h[h][w] = true;
    if(field[h][w] == '#'){
      return count;
    }
    
    return hor[h][w] = func2(h, w+1, count+1);
  }
}