import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static double cross(double x1,double y1,double x2,double y2,double xp,double yp){
		double v1x=x2-x1;
		double v1y=y2-y1;
		double v2x=xp-x1;
		double v2y=yp-y1;
		return (v1x*v2y-v2x*v1y);
	}
	
	public static boolean intersect(double x1,double y1,double x2,double y2,double x3,double y3,double xp,double yp){
		double d1=cross(x1,y1,x2,y2,xp,yp)*cross(x1,y1,x2,y2,x3,y3);
		double d2=cross(xp,yp,x3,y3,x1,y1)*cross(xp,yp,x3,y3,x2,y2);
		if(d1<0 && d2<0) return true;
		else return false;
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
			if(intersect(x1,y1,x2,y2,x3,y3,xp,yp) || intersect(x1,y1,x3,y3,x2,y2,xp,yp) || intersect(x3,y3,x2,y2,x1,y1,xp,yp)){
				System.out.println("NO");
			}
			else System.out.println("YES");
		}
	}
}