import java.util.Scanner;

public class Main {
  int[] dx = {0,1,0,-1,0};
  int[] dy = {0,0,1,0,-1};
  int h,w,ay,ax,by,bx;
  String ghostpat;
  int patiter;
  int[][] mp;
  int qiter;
  int[][][] queue;
  int[] qsize;
  int nowdist,ans;
  public static void main(String[] args){
    new Main();
  }
  void step(){
    // ghost step
    {
      int id = 0;
      char c = ghostpat.charAt(patiter);
      if(c=='5')id = 0;
      else if(c=='6')id = 1;
      else if(c=='2')id = 2;
      else if(c=='4')id = 3;
      else if(c=='8')id = 4;
      int nby = by+dy[id];
      int nbx = bx+dx[id];
      if(0<=nby && nby<h && 0<=nbx && nbx<w){
        by = nby;
        bx = nbx;
      }
      patiter ++;
      if(patiter >= ghostpat.length()){
        patiter = 0;
      }
    }
    // player step
    {
      int now = qiter;
      int nxt = now^1;
      qsize[nxt] = 0;
      for(int i=0;i<qsize[now];i++){
        int y = queue[now][i][0];
        int x = queue[now][i][1];
        // System.out.println(y+" "+x);
        for(int j=1;j<5;j++){
          int ny = y+dy[j];
          int nx = x+dx[j];
          if(ny<0 || nx<0 || ny>=h || nx>=w)continue;
          if(mp[ny][nx]!=0)continue;
          mp[ny][nx] = 1;
          int s = qsize[nxt];
          queue[nxt][s][0] = ny;
          queue[nxt][s][1] = nx;
          qsize[nxt]++;
        }
      }
      qiter ^= 1;
    }
    // check
    if(mp[by][bx]==1){
      ans = nowdist;
    }
  }
  public Main(){
    Scanner sc = new Scanner(System.in);
    while(true){
      h = sc.nextInt();
      w = sc.nextInt();
      if(h==0 && w==0)break;
      mp = new int[h][w];
      ay=0;ax=0;by=0;bx=0;
      for(int i=0;i<h;i++){
        String s = sc.next();
        for(int j=0;j<w;j++){
          char c = s.charAt(j);
          if(c=='#'){
            mp[i][j] = -1;
          }else{
            mp[i][j] = 0;
            if(c=='A'){
              ay = i;
              ax = j;
            }else if(c=='B'){
              by = i;
              bx = j;
            }
          }
        }
      }
      ghostpat = sc.next();
      patiter = 0;
      queue = new int[2][1000][2];
      qsize = new int[2];
      qiter = 0;
      queue[0][0][0]=ay;
      queue[0][0][1]=ax;
      qsize[0] = 1;
      mp[ay][ax] = 1;
      nowdist = 0;
      ans = -1;
      for(int i=0;i<10000;i++){
        nowdist++;
        step();
        if(ans!=-1)break;
      }
      if(ans!=-1){
        System.out.println(ans+" "+by+" "+bx);
      }else{
        System.out.println("impossible");
      }
    }
  }
}