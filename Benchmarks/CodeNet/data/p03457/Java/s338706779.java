import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t0=0;
    int x0=0;
    int y0=0;
    for(int i=0;i<n;i++){
      int t=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
//      System.out.println(t+"-"+t0+" "+x+"-"+x0+" "+y+"-"+y0);
      if(t-t0<mh(x0,y0,x,y)||(mh(x0,y0,x,y)+t-t0)%2==1){
        System.out.println("No");
        return;
      }
      t0=t;
      x0=x;
      y0=y;
    }
    System.out.println("Yes");
  }
  static int mh(int x1,int y1,int x2,int y2){
    return Math.abs(x1-x2)+Math.abs(y1-y2);
  }
}