import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
//        new D().doIt();
    	new C().doIt();
    }
    class C{
    	Point2D map[][] = new Point2D[32][32];
    	double EPS = 1.0e-08;
    	void PointSet(int n){
    		//a
    		for(int i = 1;i < n;i++)map[0][i] = new Point2D.Double(0,sc.nextDouble());
    		//b
    		for(int i = 1;i < n;i++)map[n][i] = new Point2D.Double(1,sc.nextDouble());
    		//c
    		for(int i = 1;i < n;i++)map[i][0] = new Point2D.Double(sc.nextDouble(),0);
    		//d
    		for(int i = 1;i < n;i++)map[i][n] = new Point2D.Double(sc.nextDouble(),1);
    	}
    	void check(int n){
    		for(int i = 0;i < n;i++){
    			for(int j = 0;j < n;j++){
    				System.out.print(map[i][j]);
    			}
    			System.out.println();
    		}
    	}
    	Point2D intersectPtSS(Line2D l, Line2D m) {
    	    Point2D lVec = sub(l.getP2(), l.getP1());
    	    Point2D mVec = sub(m.getP2(), m.getP1());
    	    Point2D m1l1Vec = sub(m.getP1(), l.getP1());
    	    double a = cross(m1l1Vec, lVec);
    	    double b = cross(lVec, mVec);
    	    if(Math.abs(a) < EPS && Math.abs(b) < EPS){
    	    	//???????????´???????£??????´???
    	    	if(l.getP1().distance(m.getP1()) < EPS) return l.getP1();
    	    	if(l.getP1().distance(m.getP2()) < EPS) return l.getP1();
    	    	return l.getP2();
    	    }
    	    double t=a/b;
    	    double resx = m.getX1() + t * mVec.getX();
    	    double resy = m.getY1() + t * mVec.getY();
    	    return new Point2D.Double(resx, resy);
    	}
    	
    	double cross(Point2D p1, Point2D p2){
    		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
    		return res;
    	}
    	
    	Point2D sub(Point2D p2, Point2D p1) {
            double x = p2.getX() - p1.getX();
            double y = p2.getY() - p1.getY();
            return new Point2D.Double(x, y);
    	}
    	
    	void LineSet(int n){
    		for(int i = 1;i < n;i++){
    			Line2D ll = new Line2D.Double(map[i][0],map[i][n]);
    			for(int j = 1;j < n;j++){
    				Line2D ll2 = new Line2D.Double(map[0][j],map[n][j]);
    				map[i][j] = intersectPtSS(ll,ll2);
    			}
    		}
    	}
    	double area(ArrayList<Point2D> polygon) {
    		double res = 0.0;
    		int n = polygon.size();
    		for(int i = 0; i < n; i++){
    			Point2D from = polygon.get(i), to = polygon.get((i+1) % n); 
    	        res += cross(from, to);
    	    }
    	    return Math.abs(res) / 2.0;
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			map[0][0] = new Point2D.Double(0,0);
    			map[0][n+1] = new Point2D.Double(0,1);
    			map[n+1][0] = new Point2D.Double(1,0);
    			map[n+1][n+1] = new Point2D.Double(1,1);
    			PointSet(n+1);
    			LineSet(n+1);
//    			check(n+2);
    			double max = 0.0;
    			for(int i = 0;i < n+1;i++){
    				for(int j = 0;j < n+1;j++){
    					ArrayList<Point2D> poligon = new ArrayList<Point2D>();
    					poligon.add(map[i][j]);poligon.add(map[i][j+1]);poligon.add(map[i+1][j+1]);poligon.add(map[i+1][j]);
    					max = Math.max(max,area(poligon));
    				}
    			}
    			System.out.printf("%.6f\n",max);
    		}
    	}
    }
//    class D{
//    	ArrayList<String> word = new ArrayList<String>();
//    	ArrayList<String> wordnumber = new ArrayList<String>();
//    	String alf = "abcdefghijklmnopqrstuvwxyz";
////    	String word_num(String str,int length){
////    		for(int i = 0;i < length;i++){
////    			
////    		}
////    	}
//    	void doIt(){
//    		int n = sc.nextInt();
//    		for(int i = 0;i < n;i++){
//    			word.add(sc.next());
//    			wordnumber.add(word.get(i),word.get(i).length());
//    			System.out.println(word.get(i));
//    		}
//    	}
//    }
}