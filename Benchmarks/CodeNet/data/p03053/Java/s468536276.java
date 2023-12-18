import java.util.Scanner;

public class Main{

  static int h,w;
  static boolean[][] a,b;
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    h=stdIn.nextInt();
    w=stdIn.nextInt();
    a=new boolean[h][w];
    b=new boolean[h][w];
    for(int y=0;y<h;y++){
      String s=stdIn.next();
      for(int x=0;x<w;x++){
        a[y][x]=s.charAt(x)=='#';
      }
    }
    int c=1;
    for(;;c++){
      reset();
      for(int y=0;y<h;y++){
        for(int x=0;x<w;x++){
          if(a[y][x] && !b[y][x]){
            b[y][x]=true;
            check(y-1,x);
            check(y+1,x);
            check(y,x-1);
            check(y,x+1);
          }
        }
      }
      System.out.println();
      boolean flag=true;
      for(int y=0;y<h;y++){
        for(int x=0;x<w;x++){
          if(!a[y][x]){
            flag=false;
          }
        }
      }
      if(flag)break;
    }
    System.out.println(c);
  }

  static void check(int y,int x){
    if(y>=0 && y<h && x>=0 && x<w){
      if(!a[y][x] && !b[y][x]){
        a[y][x]=true;
        b[y][x]=true;
      }
    }
  }

  static void reset(){
    for(int y=0;y<h;y++){
      for(int x=0;x<w;x++){
        b[y][x]=false;
      }
    }
  }
}
