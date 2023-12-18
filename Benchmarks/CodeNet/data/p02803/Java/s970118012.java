import java.util.*;

class Main{
  static int[] dy={1,0,-1,0};
  static int[] dx={0,1,0,-1};
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    String[] a=new String[h];
    for(int i=0;i<h;i++){
      a[i]=sc.next();
    }
    Deque<C> dq=new ArrayDeque<>();
    int[][] d=new int[h][w];
    boolean[][] v=new boolean[h][w];
    int max=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(a[i].charAt(j)=='.'){
//          System.err.println("["+i+":"+j+"]");
          dq.add(new C(j,i));
          d[i][j]=0;
          v[i][j]=true;
          while(!dq.isEmpty()){
            C here=dq.pollFirst();
            int hy=here.y;
            int hx=here.x;
//            System.err.println(hy+":"+hx);
            for(int k=0;k<4;k++){
              int nx=hx+dx[k];
              int ny=hy+dy[k];
              if(0<=nx&&nx<w&&0<=ny&&ny<h&&a[ny].charAt(nx)=='.'&&!v[ny][nx]){
                v[ny][nx]=true;
                d[ny][nx]=d[hy][hx]+1;
                max=Math.max(d[ny][nx],max);
                dq.add(new C(nx,ny));
              }
            }
          }
//          System.err.println(Arrays.deepToString(d));
          for(int k=0;k<h;k++){
            Arrays.fill(v[k],false);
          }
        }
      }
    }
    System.out.println(max);
  }
  static class C{
    int y;
    int x;
    C(int x,int y){
      this.x=x;
      this.y=y;
    }
  }
}