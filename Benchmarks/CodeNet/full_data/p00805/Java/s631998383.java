import java.util.*;
import java.awt.geom.*;
public class Main {

	private void doit(){
		Scanner sc= new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			double [][]inputdata = new double[4][n];
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < n; j++){
					inputdata[i][j] = sc.nextDouble();
				}
			}
			//getline
			Line2D [] abLineList = new Line2D[n];
			Line2D [] cdLineList = new Line2D[n];
			for(int i = 0; i < n; i++){
				abLineList[i] = new Line2D.Double(inputdata[0][i], 0.0, inputdata[1][i], 1.0);
				cdLineList[i] = new Line2D.Double(0,inputdata[2][i],1,inputdata[3][i]);
			}
			
			//get intersect point
			
			////set flame
			Point2D [][] pointList = new Point2D.Double[n + 2][n + 2];
			pointList[0][0] = new Point2D.Double(0,0);
			pointList[n+1][0] = new Point2D.Double(0,1.0);
			pointList[0][n+1] = new Point2D.Double(1.0,0);
			pointList[n+1][n+1] = new Point2D.Double(1.0,1.0);
			for(int i = 0; i < n; i++){
				//x flame
				pointList[0][i + 1] = new Point2D.Double(inputdata[0][i], 0.0);
				pointList[n+1][i + 1] = new Point2D.Double(inputdata[1][i], 1.0);
				
				//yflame
				pointList[i + 1][0] = new Point2D.Double(0.0, inputdata[2][i]);
				pointList[i + 1][n+1] = new Point2D.Double(1.0, inputdata[3][i]);
			}
			
			////set point
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					pointList[i+1][j+1] = intersectPt(abLineList[j], cdLineList[i]);
				}
			}
			
			//get area
			double res = -1.0;
			for(int i = 0; i <= n; i++){
				for(int j = 0; j <= n; j++){
					double nowresult = getS(pointList[i][j], pointList[i][j+1], pointList[i+1][j+1], pointList[i+1][j]);
					res = Math.max(res, nowresult);
				}
			}
			System.out.printf("%.6f\n",res);
		}
	}

	private double getS(Point2D a, Point2D b, Point2D c, Point2D d) {
		double res = 0.0;
		res+= getC(a,b);
		res+= getC(b,c);
		res+= getC(c,d);
		res+= getC(d,a);
		return res;
	}

	private double getC(Point2D a, Point2D b) {
		double s = a.getX() * b.getY() - a.getY() * b.getX();
		return s /2;
	}

	private Point2D intersectPt(Line2D l, Line2D m) {
		
		Point2D lVec = getV(l.getP2(), l.getP1());
		Point2D mVec = getV(m.getP2(), m.getP1());
		Point2D m1l1Vec = getV(m.getP1(), l.getP1());
		double a = getC(m1l1Vec, lVec);
		double b = getC(lVec, mVec);
		double t = a / b;
		double resx = m.getX1() + t * mVec.getX();
		double resy = m.getY1() + t * mVec.getY();
		return new Point2D.Double(resx, resy);
	}

	private Point2D getV(Point2D p2, Point2D p1) {
		Point2D res = new Point2D.Double(p2.getX() - p1.getX(), p2.getY() - p1.getY());
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}