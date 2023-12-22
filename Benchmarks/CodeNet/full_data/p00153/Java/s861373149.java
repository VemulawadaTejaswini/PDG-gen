import java.util.*;
import java.io.*;

public class Main {
	
	public int space(Point a, Point b, Point c){
		return (a.x-c.x)*(b.y-c.y) - (a.y-c.y)*(b.x-c.x);
	}
	public double dist(Point a, Point b){
		return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
	}
	public double dist(Point a, Point b, Point c){
		return Math.abs(space(a, b, c) / dist(a, b));
	}
	public boolean inOrOut(Triangle tr, Point p){
		double key = Math.signum(space(tr.a, tr.b, p)) + Math.signum(space(tr.b, tr.c, p)) + Math.signum(space(tr.c, tr.a, p));
		return (Math.abs(key) == 3);
	}
	public boolean crossOrNot(Point a, Point b, Circle c){
		if( dist(a, b, c.p) > c.r ){
			return true;
		}
		if( Math.min(dist(a, c.p), dist(b, c.p)) <= c.r ){
			return false;
		}
		double l = Math.max(dist(a, c.p), dist(b, c.p));
		double d = dist(a, b, c.p);
		if( Math.sqrt(l*l - d*d) > dist(a, b) ){
			return true;
		}
		return false;
	}		
	public void relation(Triangle tr, Circle c){
		if( dist(tr.a, c.p) <= c.r && dist(tr.b, c.p) <= c.r && dist(tr.c, c.p) <= c.r ){
			writer.println("b");
		} else if( inOrOut(tr, c.p) && (dist(tr.a, tr.b, c.p) >= c.r && dist(tr.b, tr.c, c.p) >= c.r && dist(tr.c, tr.a, c.p) >= c.r) ){
			writer.println("a");
		} else if( crossOrNot(tr.a, tr.b, c) && crossOrNot(tr.b, tr.c, c) && crossOrNot(tr.c, tr.a, c) ){
			writer.println("d");
		} else {
			writer.println("c");
		}
		return;
	}
			
	public void solve() throws IOException{
		int n, m;
		while( (n = nextInt()) != 0 | (m = nextInt()) != 0 ){
			int p = nextInt(), q = nextInt(), r = nextInt(), s = nextInt();
			Triangle tr = new Triangle(n, m, p, q, r, s);
			int x = nextInt(), y = nextInt(), z = nextInt();
			Circle c = new Circle(x, y, z);
			relation(tr, c);
		}
	}			
	public static void main (String args[]) throws IOException{
		new Main().run();
	}
	
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	public void run() throws IOException{
		try{
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public int nextInt() throws IOException{
		return Integer.parseInt(nextToken());
	}		
	public String nextToken() throws IOException{
		while( tokenizer == null || !tokenizer.hasMoreTokens() ){
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
}

class Triangle{
	Point a;
	Point b;
	Point c;
	Triangle(int p, int q, int r, int s, int t, int u){
		a = new Point(p, q);
		b = new Point(r, s);
		c = new Point(t, u);
	}
}
class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Circle{
	Point p;
	int r;
	Circle(int x, int y, int r){
		p = new Point(x, y);
		this.r = r;
	}
}