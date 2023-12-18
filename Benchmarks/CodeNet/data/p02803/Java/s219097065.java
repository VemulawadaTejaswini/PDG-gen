import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] dx={1,0,0,-1};
    int[] dy={0,1,-1,0};
    int h=sc.nextInt();
    int w=sc.nextInt();
    String[] a=new String[h];
    int[][] l=new int[h][w];
    for(int i=0;i<h;i++){
      a[i]=sc.next();
    }
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        l[i][j]=-1;
      }
    }
    Xy startXy=null;
    Deque<Xy> dq=new ArrayDeque<>();
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(a[i].charAt(j)=='.'){
          startXy=new Xy(i,j);
          l[i][j]=0;
          break;
        }
      }
      if(startXy!=null){
        break;
      }
    }
//    System.out.println(startXy);
    dq.addLast(startXy);
    while(!dq.isEmpty()){
      Xy here=dq.pollFirst();
      int hx=here.x;
      int hy=here.y;
      for(int i=0;i<4;i++){
        int nx=hx+dx[i];
        int ny=hy+dy[i];
        if(nx<0||w<=nx||ny<0||h<=ny){
          continue;
        }
        if(a[ny].charAt(nx)=='.'&&l[ny][nx]==-1){
          l[ny][nx]=l[hy][hx]+1;
          dq.addLast(new Xy(nx,ny));
        }
      }
    }
//    System.out.println(Arrays.deepToString(l));
    Xy maxXy=new Xy(0,0);
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(l[maxXy.y][maxXy.x]<l[i][j]){
          maxXy=new Xy(j,i);
        }
      }
    }
//    System.out.println(maxXy);
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        l[i][j]=-1;
      }
    }
//    System.out.println(Arrays.deepToString(l));
    dq.addLast(maxXy);
    l[maxXy.y][maxXy.x]=0;
    while(!dq.isEmpty()){
      Xy here=dq.pollFirst();
      int hx=here.x;
      int hy=here.y;
      for(int i=0;i<4;i++){
        int nx=hx+dx[i];
        int ny=hy+dy[i];
        if(nx<0||w<=nx||ny<0||h<=ny){
          continue;
        }
        if(a[ny].charAt(nx)=='.'&&l[ny][nx]==-1){
          l[ny][nx]=l[hy][hx]+1;
          dq.addLast(new Xy(nx,ny));
        }
      }
    }
    int ans=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        ans=Math.max(l[i][j],ans);
      }
    }
//    System.out.println(Arrays.deepToString(l));
    System.out.println(ans);
  }
  static class Xy{
    int x;
    int y;
    Xy(int a,int b){
      x=a;
      y=b;
    }
    public String toString(){
      return "["+String.valueOf(x)+","+String.valueOf(y)+"]";
    }
  }
}