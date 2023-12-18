import java.util.*;

public class Main{
  static int H, W;
  static int max = 0;
  static int[] ih = {1,0,-1,0};
  static int[] iw = {0,1,0,-1};
  static char[][] maze;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    H = Integer.parseInt(S[0]);
    W = Integer.parseInt(S[1]);
    
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
        int sh = i;
        int sw = j;
        for(int k = 0; k < H; k++){
          for(int l = 0; l < W; l++){
            if(maze[k][l] == '#' || (sh == k && sw == j)){
              continue;
            }
            int gh = k;
            int gw = l;
            func(sh, sw, gh, gw);
          }
        }
      }
    }
    System.out.println(max);
  }
  public static void func(int sh, int sw, int gh, int gw){
    int[][] route = new int[H][W];
    Queue<Integer> qh = new ArrayDeque<>();
    Queue<Integer> qw = new ArrayDeque<>();
    qh.add(sh);
    qw.add(sw);
    
    while(!qh.isEmpty()){
      int nh = qh.poll();
      int nw = qw.poll();
      
      if(nh == gh && nw == gw){
        if(route[gh][gw] > max){
          max = route[gh][gw];
        }
        return;
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