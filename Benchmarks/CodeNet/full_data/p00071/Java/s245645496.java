import java.util.*;
public class Main{
  static Scanner sc = new Scanner(System.in);
  static char[][] map;
  static int[] dx = {0, -1, 0, 1}, dy = {1, 0, -1, 0};
  static int bombed_x, bombed_y;

  public static void main(String [] args){
    int loop = sc.nextInt();
    for(int i = 0;i < loop;i++){
      solve(i+1);
    }
  }

  static void solve(int index){
    readMap();
    int bomb_x = sc.nextInt() -1;
    int bomb_y = sc.nextInt() -1;
    dfs(bomb_x, bomb_y);
    System.out.println("Data " + String.valueOf(index) + ":");
    for(char[] ans_row: map){
      System.out.println(String.valueOf(ans_row));
    }
    return;
  }

  static void readMap(){
    map = new char[8][8];
    for(int i = 0; i < 8;i++){
      map[i] = sc.next().toCharArray();
    }
    return;
  }
static void dfs(int bomb_x, int bomb_y){
    map[bomb_y][bomb_x] = '0';
    for(int i = 0; i < 4;i++){
      for(int j = 1; j <= 3;j++){
        bombed_x = bomb_x + dx[i] * j;
        bombed_y = bomb_y + dy[i] * j;
        if(0 > bombed_x || bombed_x > 7 || 0 > bombed_y || bombed_y > 7)break;
        if(map[bombed_y][bombed_x] == '1'){
          dfs(bombed_x, bombed_y);
        }
      }
    }
    return;
  }
}