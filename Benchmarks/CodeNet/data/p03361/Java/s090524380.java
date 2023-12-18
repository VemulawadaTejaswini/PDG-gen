import java.util.*;

public class Main{
  static int H, W;
  static char[][] field;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    H = Integer.parseInt(S[0]);
    W = Integer.parseInt(S[1]);
    field = new char[H][W];
    for(int i = 0; i < H; i++){
      String s = sc.nextLine();
      for(int j = 0; j < W; j++){
        field[i][j] = s.charAt(j);
      }
    }
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        boolean c1, c2, c3, c4;
        c1 = c2 = c3 = c4 = false;
        if(field[i][j] == '#'){
          c1 = func(i+1,j);
          c2 = func(i-1,j);
          c3 = func(i,j+1);
          c4 = func(i,j-1);
          if(!c1 && !c2 && !c3 && !c4){
          System.out.println("No");
          return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
  public static boolean func(int h, int w){
    if(h >= H || w >= W || w < 0 || h < 0){
      return false;
    }
    if(field[h][w] == '#'){
      return true;
    }else{
      return false;
    }
  }
}