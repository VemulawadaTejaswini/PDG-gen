import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] path = new char[h][w];
    int[][] cnt = new int[h][w];
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++)cnt[i][j]=-1;
      path[i]=sc.next().toCharArray();
    }
    int res = 0;
    for(int i=0;i<h;i++)
      for(int j=0;j<w;j++)if(path[i][j]=='#')res++;
    cnt[0][0]=1;
    Queue<pair> que = new ArrayDeque<pair>();
    que.add(new pair(0,0));
    while(!que.isEmpty()){
      pair p = que.poll();
      if(p.x==h-1&&p.y==w-1)break;
      for(int i=0;i<4;i++){
        int cx = p.x+dx[i];
        int cy = p.y+dy[i];
        if(cx>=0&&cx<=h-1&&cy>=0&&cy<=w-1&&path[cx][cy]=='.'&&cnt[cx][cy]==-1){
          cnt[cx][cy]=cnt[p.x][p.y]+1;
          que.add(new pair(cx,cy));
        }
      }
    }
    if(cnt[h-1][w-1]!=-1)System.out.println(h*w-cnt[h-1][w-1]-res);
    else System.out.println(-1);
  }
  public static class pair{
    int x;
    int y;
    pair(int x,int y){
      this.x = x;
      this.y = y;
    }
  }
}