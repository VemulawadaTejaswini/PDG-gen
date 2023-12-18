import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int W=sc.nextInt();
      int H=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();

      int x1,y1,x2,y2;

      double cX,cY;

      int cnt=0;
      double S=W*H/2;

      if(W%2==0 && H%2==0){
        if(W/2==x && H/2==y){
          cnt=1;
        }
      }
      System.out.println(S+" "+cnt);
      /*else{
        cX=W/2;
        cY=H/2;
        x1=x-cX;
        y1=y-cY;
        x2=-x1;
        y2=-y2;

      }*/


    }
}
