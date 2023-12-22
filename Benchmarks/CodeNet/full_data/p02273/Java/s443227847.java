import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Point p1=new Point(0,0);
		Point p2=new Point(100,0);
		System.out.println("0.00000000 0.00000000");
		koch(n,p1,p2);
		System.out.println("100.00000000 0.00000000");
	}
	public static void koch(int n,Point p1,Point p2){
		if(n==0) return;
		Point s=new Point(0,0);
		Point t=new Point(0,0);
		Point u=new Point(0,0);
		s.x=(2*p1.x+1*p2.x)/3;
		s.y=(2*p1.y+1*p2.y)/3;
		t.x=(1*p1.x+2*p2.x)/3;
		t.y=(1*p1.y+2*p2.y)/3;
		u.x=(t.x-s.x)/2-(t.y-s.y)*Math.sqrt(3)/2+s.x;
		u.y=(t.x-s.x)*Math.sqrt(3)/2-(t.y-s.y)/2+s.y;

		koch(n-1,p1,s);
		//System.out.println(s.x+" "+s.y);
		System.out.printf("%.8f %.8f",s.x,s.y);
		System.out.println("");
		koch(n-1,s,u);
		//System.out.println(u.x+" "+u.y);
		System.out.printf("%.8f %.8f",u.x,u.y);
		System.out.println("");
		koch(n-1,u,t);
		//System.out.println(t.x+" "+t.y);
		System.out.printf("%.8f %.8f",t.x,t.y);
		System.out.println("");
		koch(n-1,t,p2);
	}
}
class Point{
	double x,y;
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
}
