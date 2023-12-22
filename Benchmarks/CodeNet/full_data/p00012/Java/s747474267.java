import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static double dist(double x, double y, double x1, double y1, double x2, double y2){
		double v1x=x-x1;
		double v2x=x2-x1;
		double v1y=y-y1;
		double v2y=y2-y1;
		double d=(v1x*v2y-v2x*v1y)/Math.sqrt(v2x*v2x+v2y*v2y);
		return Math.abs(d);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			double x3=in.nextDouble();
			double y3=in.nextDouble();
			double xp=in.nextDouble();
			double yp=in.nextDouble();
			if(dist(xp,yp,x1,y1,x2,y2)>dist(x3,y3,x1,y1,x2,y2)) System.out.println("NO");
			else if(dist(xp,yp,x2,y2,x3,y3)>dist(x1,y1,x2,y2,x3,y3)) System.out.println("NO");
			else if(dist(xp,yp,x1,y1,x3,y3)>dist(x2,y2,x1,y1,x3,y3)) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}