import java.util.*;

public class Main{
  static int H, W;
  static int max = 0;
  static int[] ih = {1,0,-1,0};
  static int[] iw = {0,1,0,-1};
  static int[][] route;
  static char[][] maze;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    H = Integer.parseInt(S[0]);
    W = Integer.parseInt(S[1]);
    route = new int[H][W];
    maze = new char[H][W];
    for(int i = 0; i < H; i++){
      String T = sc.nextLine();
      for(int j = 0; j < W; j++){
        maze[i][j] = T.charAt(j);
      }
    }
    
    for(int i = 0; i < H; i++){
      for(int j = 0; j < W; j++){
        if(maze[i][j] == '#'){
          continue;
        }
        func(i,j);
      }
    }
    System.out.println(max);
  }
  public static void func(int sh, int sw){
    for(int i = 0; i < H; i++){
      Arrays.fill(route[i], 0);
    }
    Queue<Integer> qh = new ArrayDeque<>();
    Queue<Integer> qw = new ArrayDeque<>();
    qh.add(sh);
    qw.add(sw);
    
    while(!qh.isEmpty()){
      int nh = qh.poll();
      int nw = qw.poll();
      
      if(route[nh][nw] > max){
        max = route[nh][nw];
      }
      
      for(int i = 0; i < 4; i++){
        int fh = nh+ih[i];
        int fw = nw+iw[i];
        
        if(fh < 0 || fh >= H || fw < 0 || fw >= W){
          continue;
        }
        if(maze[fh][fw] == '#' || route[fh][fw] > 0){
          continue;
        }
        
        qh.add(fh);
        qw.add(fw);
        route[fh][fw] = route[nh][nw]+1;
      }
    }
  }
}
