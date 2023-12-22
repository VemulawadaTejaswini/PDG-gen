import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  static char [][] map;
  static boolean [][] mapSearched;
  static int [] dx = {0, -1, 0, 1}, dy = {1, 0, -1, 0};
  static int H;
  static int W;
  static int ans;

  public static void main(String [] args){
    while(solve()){
      System.out.println(ans);
    }
  }

  static boolean solve(){
    H = sc.nextInt();
    W = sc.nextInt();
    if(H == 0 && W == 0)return false;
    readMap();
    createMapSearched();
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        dfs(j, i, 0);
      }
    }
    return true;
  }
static void dfs(int x, int y, int node){
    if(mapSearched[y][x] == true) return;
    mapSearched[y][x] = true;
    for(int i = 0; i < dx.length ; i++){
      if(check(x + dx[i], y + dy[i])){
        if(map[y + dy[i]][x + dx[i]] == map[y][x]){
          dfs(x + dx[i], y + dy[i], node + 1);
        }
      }
    }
    if(node == 0){
      ans++;
      return;
    }
    return;
  }

  static boolean check(int x, int y){
    if(x < 0 || W <= x || y < 0 || H <= y) return false;
    else return true;
  }

  static void readMap(){
    map = new char[H][W];
    for(int i = 0; i < H; i++){
      map[i] = sc.next().toCharArray();
    }
    return;
  }

  static void createMapSearched(){
    mapSearched = new boolean[H][W];
    for(int i = 0; i < H; i++){
      Arrays.fill(mapSearched[i], false);
    }
  }
}