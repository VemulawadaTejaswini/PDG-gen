import java.util.*;

class Main{
  static int[] dx={1,0,0,-1};
  static int[] dy={0,1,-1,0};
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    String[] a=new String[h];
    for(int i=0;i<h;i++){
      a[i]=sc.next();
    }
    Xy startXy=null;
    Deque<Xy> dq=new ArrayDeque<>();
    int ans=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(a[i].charAt(j)=='.'){
          startXy=new Xy(j,i);
          ans=Math.max(calc(h,w,startXy,a),ans);
        }
      }
    }
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
  static int calc(int h,int w,Xy startXy,String[] a){
//    System.out.println(startXy+" "+h+" "+w);
    int[][] l=new int[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        l[i][j]=-1;
      }
    }
    Deque<Xy> dq=new ArrayDeque<>();
    dq.addLast(startXy);
    l[startXy.y][startXy.x]=0;
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
    int res=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        res=Math.max(l[i][j],res);
      }
    }
    return res;
  }
}
