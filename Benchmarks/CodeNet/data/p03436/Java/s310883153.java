import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    char[][] map = new char[h][w];
    int count = 0;
    int[][] dist = new int[h][w];
    for(int i=0;i<h;i++){
      map[i] = sc.next().toCharArray();
      for(int j=0;j<w;j++){
        if(map[i][j] == '.')count++;
        dist[i][j] = -1;
      }
    }
    int[][] vec = {{1,0},{-1,0},{0,1},{0,-1}};
    Queue<Integer> yQueue = new ArrayDeque<Integer>();
    Queue<Integer> xQueue = new ArrayDeque<Integer>();
    int now_dist = 1;
    dist[0][0] = 0;
    yQueue.add(0);
    xQueue.add(0);
    int ytmp,xtmp,size,yto,xto;
    while(!yQueue.isEmpty()){
      size = yQueue.size();
      for(int j=0;j<size;j++){
        ytmp = yQueue.poll();
        xtmp = xQueue.poll();
        
        for(int i=0;i<4;i++){
          yto = ytmp + vec[i][0];
          xto = xtmp + vec[i][1];
          if(yto>=0 && yto < h && xto >=0 && xto < w &&
             dist[yto][xto]==-1 && map[yto][xto]=='.'){
            dist[yto][xto] = now_dist;
            yQueue.add(yto);
            xQueue.add(xto);
          }
        }
      }
      now_dist++;
    }
    if(dist[h-1][w-1]!=-1){
      System.out.print(count-dist[h-1][w-1]-1);
    }else{
      System.out.print(-1);
    }
    System.out.flush();
  }
}