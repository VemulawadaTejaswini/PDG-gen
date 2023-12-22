import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		int q = in.nextInt();
		for(int i=0;i<q;i++)new CGL_2A().doIt();
	}

	class CGL_2A{
		final double EPS=1.0e-8;
		void doIt(){
			Line2D l1 = new Line2D.Double(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			Line2D l2 = new Line2D.Double(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			System.out.println(isParallel(l1, l2));
		}

		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}

		Point2D diff(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
		boolean intersectLL(Line2D l1,Line2D l2){
			return intersectLL(l1.getP1(),l1.getP2(),l2.getP1(),l2.getP2());
		}
		boolean intersectLL(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
			return (Math.abs(cross(diff(a2, a1), diff(b2, b1)))>EPS)||(Math.abs(cross(diff(a2, a1), diff(a1, b1)))<EPS);
		}

		Point2D intersectionPoint(Line2D l1,Line2D l2){
			return intersectionPoint(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2()); 
		}

		Point2D intersectionPoint(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
			Point2D a=diff(a2,a1),
					b=diff(b2,b1);
			return sum(a1, mul(cross(b, diff(b1,a1))/cross(b,a), a));
		}

		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n,p1.getY()*n);
		}

		Point2D sum(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(),p1.getY()+p2.getY());
		}

		boolean parallel(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){     
			double kata1=(y1-y2)/(x1-x2);
			double kata2=(y3-y4)/(x3-x4);
			if(kata1==kata2)return true;
			if((y1-y2==0&&y3-y4==0)||(x1-x2==0&&x3-x4==0))return true;
			return false;
		}
		boolean parallel(Line2D l1,Line2D l2){
			return parallel(l1.getP1().getX(), l1.getP1().getY(), l1.getP2().getX(),l1.getP2().getY(),
					l2.getP1().getX(),l2.getP1().getY(),l2.getP2().getX(),l2.getP2().getY());
		}
		
		boolean orthogonal(Line2D l1,Line2D l2){
			return orthogonal(l1.getP1().getX(), l1.getP1().getY(), l1.getP2().getX(),l1.getP2().getY(),
					l2.getP1().getX(),l2.getP1().getY(),l2.getP2().getX(),l2.getP2().getY());
		}
		boolean orthogonal(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
			double a=(y1-y2)/(x1-x2);
			double b=(y3-y4)/(x3-x4);
			if(a==-(1/b)||-(1/a)==b)return true;
			return false;
		}

		int isParallel(Line2D l1,Line2D l2){
			if(parallel(l1, l2))return 2;
			if(orthogonal(l1, l2))return 1;
			return 0;
		}
	}

}