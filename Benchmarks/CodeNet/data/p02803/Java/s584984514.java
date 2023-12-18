import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] dx={1,0,-1,0};
    int[] dy={0,1,0,-1};
    int h=sc.nextInt();
    int w=sc.nextInt();
    String[] a=new String[h];
    for(int i=0;i<h;i++){
      a[i]=sc.next();
    }
    Grid gr=new Grid(h,w,a);
    GridL gl=new GridL(h,w);
    gl.fill(-1L);
    Xy startXy=null;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(gr.at(j,i)=='.'){
          startXy=new Xy(j,i);
          break;
        }
      }
      if(startXy!=null){
        break;
      }
    }
    Deque<Xy> dq=new ArrayDeque<>();
    dq.addLast(startXy);
    gl.set(0,startXy.x,startXy.y);
    while(!dq.isEmpty()){
      Xy hr=dq.pollFirst();
      for(int i=0;i<4;i++){
        int nx=hr.x+dx[i];
        int ny=hr.y+dy[i];
        if(gr.contains(nx,ny)&&gr.at(nx,ny)=='.'&&gl.get(nx,ny)==-1){
          dq.addLast(new Xy(nx,ny));
          gl.set(gl.get(hr.x,hr.y)+1,nx,ny);
        }
      }
    }
//    System.out.println(gr.toString());
//    System.out.println(gl.toString());
    int mx=0;
    int my=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(gl.get(mx,my)<gl.get(j,i)){
          mx=j;
          my=i;
        }
      }
    }
    dq.add(new Xy(mx,my));
    gl.fill(-1);
    gl.set(0,mx,my);
    while(!dq.isEmpty()){
      Xy hr=dq.pollFirst();
      for(int i=0;i<4;i++){
        int nx=hr.x+dx[i];
        int ny=hr.y+dy[i];
        if(gr.contains(nx,ny)&&gr.at(nx,ny)=='.'&&gl.get(nx,ny)==-1){
          dq.addLast(new Xy(nx,ny));
          gl.set(gl.get(hr.x,hr.y)+1,nx,ny);
        }
      }
    }
//    System.out.println(gl.toString());
    long ans=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        ans=Math.max(gl.get(j,i),ans);
      }
    }
    System.out.println(ans);
  }
  static class Grid{
    int h;
    int w;
    String[] a;
    Grid(int h,int w,String[] a){
      this.h=h;
      this.w=w;
      this.a=a;
    }
    char at(int x,int y){
      return a[y].charAt(x);
    }
    boolean contains(int x,int y){
      return ((0<=x&&x<w)&&(0<=y&&y<h));
    }
    public String toString(){
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<h;i++){
        sb.append(a[i]+"\n");
      }
      return sb.toString();
    }
  }
  static class GridL{
    int h;
    int w;
    long[][] a;
    GridL(int h,int w){
      this.h=h;
      this.w=w;
      a=new long[h][w];
    }
    void set(long v,int x,int y){
      a[y][x]=v;
    }
    void fill(long v){
      for(int i=0;i<h;i++){
        Arrays.fill(a[i],v);
      }
    }
    long get(int x,int y){
      return a[y][x];
    }
    public String toString(){
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<h;i++){
        sb.append(Arrays.toString(a[i])+"\n");
      }
      return sb.toString();
    }
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
    public String toString(){
      return "[x"+String.valueOf(x)+",y"+String.valueOf(y)+"]";
    }
  }
}