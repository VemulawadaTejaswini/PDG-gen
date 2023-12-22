import java.util.Scanner;

public class Main {
	
	Scanner sc;
	
	class Point{
		public double x,y;
		
		public String toString(){
			return "("+x+","+y+")";
		}
		
		public Point(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	
	double getTheta(Point p,Point p0){
		double theta=Math.acos((p.x-p0.x)/Math.hypot(p.x-p0.x,p.y-p0.y));
		if(p.y<p0.y)theta=Math.PI*2-theta;
		return theta;
	}
	
	int solve(Point[] points){
		Point start=points[0];
		for(Point v:points){
			if(v.y<start.y)start=v;
		}
		Point p0=start;
		int n=0;
		double prev=0;
		do{
			double min=Math.PI*3;
			Point next=p0;
			for(Point p: points){
				double theta=getTheta(p,p0);
				if(theta>=prev&&theta<min){
					min=theta;
					next=p;
				}
			}
			p0=next;
			prev=min;
			++n;
		}while(p0!=start);
		return points.length-n;
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in).useDelimiter(",|\r\n|\n");
		
		int n;
		Point[] points;
		while((n=ni())!=0){
			points=new Point[n];
			for(int i=0;i<n;++i){
				points[i]=new Point(nd(),nd());
			}
			System.out.println(solve(points));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}
}