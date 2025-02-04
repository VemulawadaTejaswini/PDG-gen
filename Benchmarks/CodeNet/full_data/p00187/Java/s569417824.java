import java.util.*;

public class Main
{
	static	double EPS=1e-5;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			Point p1=new Point(in.nextDouble(), in.nextDouble()); 
			Point p2=new Point(in.nextDouble(), in.nextDouble()); 
			if(p1.x==0&&p1.y==0&&p2.x==0&&p2.y==0)
				return;
			Point p3=new Point(in.nextDouble(), in.nextDouble()); 
			Point p4=new Point(in.nextDouble(), in.nextDouble()); 
			Point p5=new Point(in.nextDouble(), in.nextDouble()); 
			Point p6=new Point(in.nextDouble(), in.nextDouble());
			boolean judge=true;
			if(!lineCross(p1, p2, p3, p4))
				judge=false;
			if(!lineCross(p3, p4, p5, p6))
				judge=false;
			if(!lineCross(p5, p6, p1, p2))
				judge=false;

			if(judge)
			{
				double a1=slanting(p1, p2);
				double a2=slanting(p3, p4);
				double x1=(a1*p1.x-p1.y-a2*p3.x+p3.y)/(a1-a2);
				if(a1==-1.123)
					x1=p1.x;
				else if(a2==-1.123)
					x1=p3.x;
				double y1=(p2.y-p1.y)/(p2.x-p1.x)*(x1-p1.x)+p1.y;
				if(a1==-1.123)
					y1=(p4.y-p3.y)/(p4.x-p3.x)*(x1-p3.x)+p3.y;

				a1=slanting(p3, p4);
				a2=slanting(p5, p6);
				double x2=(a1*p3.x-p3.y-a2*p5.x+p5.y)/(a1-a2);
				if(a1==-1.123)
					x2=p3.x;
				else if(a2==-1.123)
					x2=p5.x;
				double y2=(p4.y-p3.y)/(p4.x-p3.x)*(x2-p3.x)+p3.y;
				if(a1==-1.123)
					y2=(p5.y-p6.y)/(p5.x-p6.x)*(x2-p5.x)+p5.y;

				a1=slanting(p5, p6);
				a2=slanting(p1, p2);
				double x3=(a1*p5.x-p5.y-a2*p1.x+p1.y)/(a1-a2);
				if(a1==-1.123)
					x3=p5.x;
				else if(a2==-1.123)
					x3=p1.x;
				double y3=(p6.y-p5.y)/(p6.x-p5.x)*(x3-p5.x)+p5.y;
				if(a1==-1.123)
					y3=(p2.y-p1.y)/(p2.x-p1.x)*(x3-p1.x)+p1.y;

				Point a=new Point(x1, y1);
				Point b=new Point(x2, y2);
				Point c=new Point(x3, y3);
				double S=triangleArea(a, b, c);
				
				if(S<EPS)
					System.out.println("kyo");
				else if(S<100000)
					System.out.println("syo-kichi");
				else if(S<1000000)
					System.out.println("kichi");
				else if(S<1900000)
					System.out.println("chu-kichi");
				else 
					System.out.println("dai-kichi");			
			}
			else
				System.out.println("kyo");
		}
	}

	static boolean lineCross(Point p1,Point p2,Point p3,Point p4)
	{
		double jc1=(p1.x-p2.x)*(p3.y-p1.y)+(p1.y-p2.y)*(p1.x-p3.x);
		double jd1=(p1.x-p2.x)*(p4.y-p1.y)+(p1.y-p2.y)*(p1.x-p4.x);
		double jc2=(p3.x-p4.x)*(p1.y-p3.y)+(p3.y-p4.y)*(p3.x-p1.x);
		double jd2=(p3.x-p4.x)*(p2.y-p3.y)+(p3.y-p4.y)*(p3.x-p2.x);
		return jc1*jd1<=0 && jc2*jd2<=0;
	}

	static double slanting(Point p1,Point p2)
	{
		if(Math.abs(p1.x-p2.x)<EPS)
			return -1.123;
		else
			return (p1.y-p2.y)/(p1.x-p2.x);
	}
	//3頂点からなる三角形の面積
	static double triangleArea(Point p1,Point p2,Point p3)
	{
		return Math.abs((p3.y-p1.y)*(p2.x-p1.x)-(p2.y-p1.y)*(p3.x-p1.x))/2;
	}
}
class Point
{
	double x;
	double y;
	Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}