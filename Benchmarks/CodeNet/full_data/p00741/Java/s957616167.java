import java.util.Scanner;

//深さ優先探索を用いる
public class Main{
  public static int[] dx = {1, 1, 1, 0, -1, -1, -1, 0};
  public static int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int w = Integer.parseInt(sc.next());
      int h = Integer.parseInt(sc.next());
      if(h == 0 && w == 0){
        break;
      }
      int[][] c = new int[h][w];//島の情報(海か陸か)
      int [][] seen = new int[h][w];//探索済みか？初期値0
      //初期化用
      for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          c[i][j] = Integer.parseInt(sc.next());
          seen[i][j] = 0;
        }
      }

      //探索用
      int k = 1;//島の数(k-1)
      for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          //falseが返ってきたとき初手で島が見つからなかったからkは増やさない
          if(dfs(true, k, c, seen, j, i, h, w)) k++;
        }
      }
      System.out.printf("%d\n", k - 1);

      /*for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          System.out.printf("%d", [i][j]);
        }
        System.out.printf("\n");
      }*/
    }
  }

  //深さ優先探索(引数が多くて気持ち悪い) グローバル変数を用いるしかないのか？
  public static boolean dfs(boolean flag, int num, int[][] c, int[][] seen, int x, int y, int h, int w){
    //初手が探索済みの陸もしくは海ならばfalseを返す
    if(flag && (seen[y][x] != 0 || c[y][x] == 0)){
      return false;
    }
    //初手以外で領域外、海、探索済みだった場合trueを返す
    else if( x >= w || y >= h || x < 0 || y < 0 || c[y][x] == 0 || seen[y][x] != 0){
      return true;
    }
    else{
      //陸ならば同一のナンバーで管理する
      seen[y][x] = num;
      for(int _x: dx){
        for(int _y:dy){
          //上下左右斜めで再起で探索
          dfs(false, num, c, seen, x + _x, y + _y, h, w);
        }
      }
      //true
      return true;
    }
  }
}
