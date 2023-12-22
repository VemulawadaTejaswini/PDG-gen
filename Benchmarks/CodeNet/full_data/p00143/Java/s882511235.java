import java.util.*;
import java.io.*;

public class Main {
	
	public double sign(Point a, Point b, Point c){
	//	writer.println((a.x-c.x)*(b.y-c.y) - (a.y-c.y)*(b.x-c.x));
		return Math.signum((a.x-c.x)*(b.y-c.y) - (a.y-c.y)*(b.x-c.x));
	}
	public String judge(Triangle tr, Point p, Point q){
		double x = Math.abs(sign(tr.a, tr.b, p) + sign(tr.b, tr.c, p) + sign(tr.c, tr.a, p));
		double y = Math.abs(sign(tr.a, tr.b, q) + sign(tr.b, tr.c, q) + sign(tr.c, tr.a, q));
		return (x != y) ? "OK" : "NG";
	}		
	public  void solve() throws IOException{
		int n = nextInt();
		for(int i = 0; i < n; i++){
			int p = nextInt(), q = nextInt(), r = nextInt(), s = nextInt(), t = nextInt(), u = nextInt();
			Triangle tr = new Triangle(p, q, r, s, t, u);
			int a = nextInt(), b = nextInt();
			Point alt = new Point(a, b);
			int c = nextInt(), d = nextInt();
			Point vega = new Point(c, d);
			writer.println(judge(tr, alt, vega));
		}
		writer.flush();			
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

class Point {
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Triangle {
	Point a;
	Point b;
	Point c;
	public Triangle(int p, int q, int r, int s, int t, int u){
		a = new Point(p, q);
		b = new Point(r, s);
		c = new Point(t, u);
	}
}