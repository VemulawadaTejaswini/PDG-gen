import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static Point[][] vec;
	public static int n;
//	public static Point[][] vec;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			n = in.nextInt();
			if(n == 0) return;
			Circle[] chain = new Circle[n];
			Point bc = null;
			vec = new Point[2][n+1];
			// init
			for(int i=0; i<n; i++){
				chain[i] = new Circle(in.nextInt(), in.nextInt(), in.nextInt());
				if(i==0){
					bc = chain[i].p;
					vec[0][0] = bc;
					vec[1][0] = bc;
					continue;
				}
				Point[] p = chain[i].crossPoint(chain[i-1]);
				Point c = chain[i].p.center(chain[i-1].p);
				int s1 = ccw(c, bc, p[0]) < 0 ? 0 : 1;
				int s2 = s1 == 0 ? 1 : 0;
				vec[s1][i] = p[0];
				vec[s2][i] = p[1];
				bc = c;
			}
			vec[0][n] = chain[n-1].p;
			vec[1][n] = chain[n-1].p;
			ArrayList<Point> res = new ArrayList<Point>();
			double[][] dp = new double[2][n+1];
			for(int i=0; i<2; i++){
				for(int j=0; j<=n; j++){
					dp[i][j] = 1e9;
				}
			}
			int[][] sign = new int[2][n+1];
			dp[0][0] = Math.sqrt(vec[0][0].dist2(vec[0][1]));
			dp[1][0] = Math.sqrt(vec[1][0].dist2(vec[1][1]));
			// end init
			for(int i=1; i<=n; i++){
				for(int j=0; j<2; j++){
					for(int k=0; k<2; k++){
						double d = dp[k][i-1] + Math.sqrt(vec[k][i-1].dist2(vec[j][i]));
						if(dp[j][i] > d){
							dp[j][i] = d;
							sign[j][i] = k;
						}
					}
				}
			}
			Stack<Point> stack = new Stack<Point>();
			stack.push(vec[0][n]);
			int s = sign[0][n];
			for(int i=n-1; i>=0; i--){
				stack.push(vec[s][i]);
				s = sign[s][i];
			}
			while(!stack.isEmpty()){
				res.add(stack.pop());
			}
			
//			res.add(vec[0][0]);
//			res.addAll(1, root(0, 0, 0, n));
//			res.add(vec[0][n]);
			for(int i=0; i<100; i++) opt(res);
			System.out.println(length(res));
		}
	}
	
	static void opt(ArrayList<Point> p){
		Queue<Point> rem = new LinkedList<Point>();
		int[] sign = new int[p.size()];
		int idx = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<2; j++){
				if(vec[j][i] == p.get(idx)){
					sign[idx++] = j==0?-1:1;
					break;
				}
			}
		}
		Point bp = p.get(0);
		for(int i=1; i<p.size()-1; i++){
			if(sign[i] != sign[i+1] && i<p.size()-2
					|| ccw(bp, p.get(i), p.get(i+1))*sign[i] < 0){
				bp = p.get(i);
				continue;
			}
			rem.add(p.get(i));
		}
		for(Point r: rem){
			p.remove(r);
		}
	}
	
	static double length(ArrayList<Point> p){
		double res = 0;
		for(int i=1; i<p.size(); i++){
			res += Math.sqrt(p.get(i).dist2(p.get(i-1)));
		}
		return res;
	}
	
	// v1??????v2???????????????????????§????????±?????????????±???????
	// ???????????°????????????
	static ArrayList<Point> root(int s1, int v1, int s2, int v2){
		Point p2 = vec[s2][v2];
		ArrayList<Point> res = new ArrayList<Point>();
		if(v2-v1 < 2) return res;
		for(int i=v1; i<v2-1; i++){
			if(ccw(vec[0][i], vec[0][i+1], p2) > 0){
				res.addAll(root(s1, v1, 0, i+1));
				res.add(vec[0][i+1]);
				res.addAll(root(0, i+1, s2, v2));
				break;
			}
			if(ccw(vec[1][i], vec[1][i+1], p2) < 0){
				res.addAll(root(s1, v1, 1, i+1));
				res.add(vec[1][i+1]);
				res.addAll(root(1, i+1, s2, v2));
				break;
			}
		}
		return res;
	}

	// p1-p2??¨p3-p4??????????????????????????????
	static boolean cross(Point p1, Point p2, Point p3, Point p4){
		if(p1 == p3) return false;
		return ccw(p1, p2, p3) * ccw(p1, p2, p4) <= 0
				&& ccw(p3, p4, p1) * ccw(p3, p4, p2) <= 0;
	}
	
	// a,b,c??????????¨????????????¨?????£?????¢???
	static double ccw(Point a, Point b, Point c){
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - a.x;
		double dy2 = c.y - a.y;
		return dx1*dy2 - dx2*dy1;
	}
	
}

class Circle{
	final static double EPS = 1e-8;
	
	Point p;
	double r;
	public Circle(double x, double y, double r){
		p = new Point(x, y);
		this.r = r;
	}
	
	public Point[] crossPoint(Circle c){
		if(!cross(c)) return null;
		double x1 = c.p.x - p.x;
		double y1 = c.p.y - p.y;
		double a = (x1*x1+y1*y1+r*r-c.r*c.r)/2.0;
		Point[] res = {
				new Point(culc(x1, y1, r, a, true)+p.x, culc(y1, x1, r, a, false)+p.y),
				new Point(culc(x1, y1, r, a, false)+p.x, culc(y1, x1, r, a, true)+p.y),
		};
		return res;
	}
	
	private static double culc(double x, double y, double r, double a, boolean sign){
		return (a*x + (sign?1:-1)*y*Math.sqrt((x*x+y*y)*r*r-a*a)+EPS)/(x*x+y*y);
	}
	
	public boolean cross(Circle c){
		return p.dist2(c.p) <= (r+c.r)*(r+c.r) + EPS;
	}
}

class Point{
	double x, y;
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double dist2(Point p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
	}
	
	public Point center(Point p){
		return new Point((x+p.x)/2, (y+p.y)/2);
	}
}