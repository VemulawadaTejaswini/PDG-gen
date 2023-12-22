import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Point p1,p2,p3;
		double a,b,c;
		double X,Y,R;
		double A1,B1,C1,A2,B2,C2;
		for(int i=0;i<n;i++){
			p1=new Point(scan.nextDouble(),scan.nextDouble());
			p2=new Point(scan.nextDouble(),scan.nextDouble());
			p3=new Point(scan.nextDouble(),scan.nextDouble());
			a=calcEdge(p1,p2);
			b=calcEdge(p2,p3);
			c=calcEdge(p1,p3);
			A1=2.0*(p2.getX()-p1.getX());
			B1=2.0*(p2.getY()-p1.getY());
			C1=(p1.getX())*(p1.getX())-(p2.getX())*(p2.getX())+(p1.getY())*(p1.getY())-(p2.getY())*(p2.getY());
			A2=2.0*(p3.getX()-p1.getX());
			B2=2.0*(p3.getY()-p1.getY());
			C2=(p1.getX())*(p1.getX())-(p3.getX())*(p3.getX())+(p1.getY())*(p1.getY())-(p3.getY())*(p3.getY());
			X=(B1*C2-B2*C1)/(A1*B2-A2*B1);
			Y=(C1*A2-C2*A1)/(A1*B2-A2*B1);
			R=a/(2.0*Math.sqrt((2.0*(a*a*b*b+b*b*c*c+c*c*a*a)-(a*a*a*a+b*b*b*b+c*c*c*c))/(4.0*b*b*c*c)));
			System.out.printf("%.3f %.3f %.3f\n",X,Y,R);
		}
		scan.close();
	}
	private static double calcEdge(Point p1,Point p2)
	{
		return Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+
				(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
	}
	private static class Point
	{
		private double x;
		private double y;
		private Point(double x,double y)
		{
			this.x=x;
			this.y=y;
		}
		public double getX()
		{
			return this.x;
		}
		public double getY()
		{
			return this.y;
		}
	}
}