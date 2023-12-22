import java.io.*;
import java.util.*;
import java.lang.*;
 class Main{
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Point p1 = new Point(0.0, 0.0);
    Point p2 = new Point(100.0, 0.0);
    System.out.printf("%.8s %.8s\n",p1.x,p1.y);
    koch(n, p1, p2);
    System.out.printf("%.8s %.8s\n",p2.x,p2.y);
  }
  static void koch(int d, Point p1, Point p2){
    if(d==0)return;
    double rad = 60*Math.PI/180.0;//Math.toRadians(60);
    Point s = new Point((2.0*p1.x+1.0*p2.x)/3.0, (2.0*p1.y+1.0*p2.y)/3.0);
    Point t = new Point((1.0*p1.x+2.0*p2.x)/3.0,(1.0*p1.y+2.0*p2.y)/3.0);
    Point u = new Point((t.x-s.x)*Math.cos(rad)-(t.y-s.y)*Math.sin(rad)+s.x, (t.x-s.x)*Math.sin(rad)+(t.y-s.y)*Math.cos(rad)+s.y);
    koch(d-1, p1, s);
    System.out.printf("%.8s %.8s\n",s.x,s.y);
    koch(d-1, s, u);
    System.out.printf("%.8s %.8s\n",u.x,u.y);
    koch(d-1, u, t);
    System.out.printf("%.8s %.8s\n",t.x,t.y);
    koch(d-1, t, p2);
  }
}

class Point{
  double x = 0.0;
  double y = 0.0;
  Point(double x, double y){
    this.x = x;
    this.y = y;
  }
  Point(){
    this.x = 0.0;
    this.y = 0.0;
  }
}
