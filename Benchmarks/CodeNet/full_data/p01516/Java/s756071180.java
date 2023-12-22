import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

class Solve{
	final Scanner in = new Scanner(System.in);
	
	static final double INF = 1e9;
	boolean solve(){
		int n = in.nextInt();
		int m = in.nextInt()-1;
		int l = in.nextInt()-1;
		if(n == 0) return false;
		double[][] dist = new double[n][n];
		Star[] st = new Star[n];
		for(int i=0; i<n; i++){
			st[i] = new Star(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j==i) continue;
				dist[i][j] = INF;
			}
		}
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				dist[i][j] = dist[j][i] = st[i].dist(st[j]);
			}
		}
		for(int k=0; k<n; k++)
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
		System.out.println(dist[m][l]);
		return true;
	}
//	
//	String dump(double[][] d, int n){
//		
//	}
	
}

class Star{
	Pos[] p;
	static final double EPS = 1e-10;
	static final double INF = 1e9;
	Star(int x, int y, int a, int r){
		p = new Pos[5];
		for(int i=0; i<5; i++){
			double px = x + Math.cos(Math.toRadians(a+90+144*i))*r;
			double py = y + Math.sin(Math.toRadians(a+90+144*i))*r;
			p[i] = new Pos(px, py);
		}
	}
	
	double dist(Star s){
		double res = INF;
		for(int i=0; i<5; i++){
			Pos p1 = p[i];
			Pos p2 = p[(i+1)%5];
			res = Math.min(res, s.dist(p1, p2));
		}
		return res;
	}
	
	double dist(Pos p1, Pos p2){
		double res = INF;
		for(int i=0; i<5; i++){
			res = Math.min(res, vecdist(p1, p2, p[i]));
			if(cross(p1, p2, p[i], p[(i+1)%5])) return 0;
		}
		return res;
	}
	
	boolean cross(Pos a1, Pos a2, Pos b1, Pos b2){
		if(cross(a1.x - a2.x, a1.y-a2.y, b1.x-b2.x, b1.y-b2.y) == 0
				&& cross(a1.x-a2.x, a1.y-a2.y, a1.x-b2.x, a1.y-b2.y) == 0){
			if(Math.abs(a1.dist2(b1)+a2.dist2(b1) - a1.dist2(a1)) < EPS
					|| Math.abs(a1.dist2(b2)+a2.dist2(b2) - a1.dist2(a2)) < EPS){
				return true;
			}else return false;
		}
		return triarea(a1, a2, b1)*triarea(a1, a2, b2) <= 0
				&& triarea(b1, b2, a1)*triarea(b1, b2, a2) <= 0;
	}
	
	double vecdist(Pos a, Pos b, Pos c){
		if(dot(b.x - a.x, b.y-a.y, c.x - a.x, c.y-a.y) <= EPS)
			return Math.sqrt(a.dist2(c));
		if(dot(a.x-b.x, a.y-b.y, c.x-b.x, c.y-b.y) <= EPS){
			return Math.sqrt(b.dist2(c));
		}
		return Math.abs(triarea(a, b, c)/Math.sqrt(a.dist2(b)));
	}
	
	double dot (double x, double y, double x1, double y1){
		return x*x1 + y*y1;
	}
	
	double triarea(Pos a, Pos b, Pos c){
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - a.x;
		double dy2 = c.y - a.y;
		return dx1*dy2 - dx2*dy1;
	}
	
	double cross(double x1, double y1, double x2, double y2){
		return x1*y2 - x2*y1;
	}
}

class Pos{
	double x, y;
	Pos(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double dist2(Pos p){
		return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y);
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
		Solve solve = new Solve();
		while(solve.solve());
	}
}