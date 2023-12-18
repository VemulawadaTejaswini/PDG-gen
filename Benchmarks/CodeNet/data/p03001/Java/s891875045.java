import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    float w,h,x,y,max,minx,miny,ans;
    Scanner sc=new Scanner(System.in);
    w=sc.nextInt();
    h=sc.nextInt();
    x=sc.nextInt();
    y=sc.nextInt();
    max=w*h;
    minx=(max-x*h > x*h)?x*h:max-x*h;
    miny=(max-w*y > w*y)?w*y:max-w*y;
    if(minx==miny){
      ans=minx;
      System.out.format("%f %d",ans, 1);
    }
    else{
      ans=Math.max(minx,miny);
      System.out.format("%f %d",ans, 0);
    }
  }
}
