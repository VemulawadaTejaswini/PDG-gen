import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			boolean check=false; 
			Point a=new Point(sc.nextDouble(),sc.nextDouble());
			Point b=new Point(sc.nextDouble(),sc.nextDouble());
			Point c=new Point(sc.nextDouble(),sc.nextDouble());
			Point p=new Point(sc.nextDouble(),sc.nextDouble());
			if((p.x-a.x)*(p.x-b.x)<0&&(p.x-a.x)*(p.x-c.x)<0){
				double i=func(a,b,p.x);
				double j=func(a,c,p.x);
				if((p.y-i)*(p.y-j)<0){
					check=true;
				}
			}else if((p.x-a.x)*(p.x-b.x)<0&&(p.x-b.x)*(p.x-c.x)<0){
				double i=func(a,b,p.x);
				double j=func(b,c,p.x);
				if((p.y-i)*(p.y-j)<0){
					check=true;
				}
			}else if((p.x-b.x)*(p.x-c.x)<0&&(p.x-a.x)*(p.x-c.x)<0){
				double i=func(b,c,p.x);
				double j=func(a,c,p.x);
				if((p.y-i)*(p.y-j)<0){
					check=true;
				}
			}
			if(check){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	static double func(Point p1,Point p2,double c){
		double f;
		double a=(p1.y-p2.y)/(p1.x-p2.x);
		f=a*(c-p1.x)+p1.y;
		return f;
	}
}

class Point{
	double x,y;
	Point(double a,double b){
		x=a;
		y=b;
	}
}