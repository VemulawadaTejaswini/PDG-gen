import java.util.Scanner;
import java.awt.Graphics;

class Main{

    //private Graphics g = new Graphics();

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Point p1 = new Point();
	p1.Point(0.0,0.0);	
	Point p2 = new Point();
	p2.Point(100.0,0.0);	
	p1.printPoint();
	Koch(n,p1,p2);
	p2.printPoint();
    }

    public static void Koch(int n, Point p1, Point p2){
	if(n==0){
	    return;
	}else{
	    Point s = new Point();
	    s.Point((2*p1.x+p2.x)/3, (2*p1.y+p2.y)/3);
	    Point t = new Point();
	    t.Point((p1.x+2*p2.x)/3, (p1.y+2*p2.y)/3);
	    Point u = new Point();
	    u.Point((t.x-s.x)*Math.cos(60*Math.PI/180)
		    -(t.y-s.y)*Math.sin(60*Math.PI/180)+s.x, 
		    (t.x-s.x)*Math.sin(60*Math.PI/180)
		    +(t.y-s.y)*Math.cos(60*Math.PI/180)+s.y);
	    Koch(n-1, p1, s);
	    s.printPoint();
	    Koch(n-1,s,u);
	    u.printPoint();
	    Koch(n-1,u,t);
	    t.printPoint();
	    Koch(n-1,t,p2);
	}
    }
    
    static class Point{
	public double x;
        public double y;

	public void Point(double x1, double y1){
	    x = x1;
	    y = y1;
	}

	public void printPoint(){
	    System.out.println(String.format("%02.8f",x)+" "+String.format("%02.8f",y));
	}
    }
}

