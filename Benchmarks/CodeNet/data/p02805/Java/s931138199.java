import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    static int mod = 1_000_000_007;
    // int mod = 998244353;
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        double[][] board = new double[n][2];
        for(int i = 0; i < n; i++){
            board[i][0] = ni();
            board[i][1] = ni();
        }
        Point[] p = new Point[n];
        for(int i = 0; i < n; i++){
            p[i] = new Point(board[i][0], board[i][1]);
        }
        double ret = smallestEnclosingCircle(n,p);
        out.println(ret);

    }

    public static double EPS = 1e-9;

    public static class Point {
		double x, y;
		
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double norm() {
			return this.x * this.x + this.y * this.y;
		}
		public double abs() {
			return Math.sqrt(this.norm());
		}
		public double cross(Point another) {
			return this.x * another.y - another.x * this.y;
		}
		
		public Point add(Point another) {
			return new Point(this.x + another.x, this.y + another.y);
		}
		public Point subtract(Point another) {
			return new Point(this.x - another.x, this.y - another.y);
		}
		public Point mul(double d) {
			return new Point(this.x * d, this.y * d);
		}
		public Point div(double d) {
			return new Point(this.x / d, this.y / d);
		}
	}
	
	public static class Circle {
		Point p;
		double r;
		
		public Circle (Point p, double r) {
			this.p = p;
			this.r = r;
		}
	}
	
	public static Circle c3(Point a, Point b, Point c) {
		final double A = b.subtract(c).norm();
		final double B = c.subtract(a).norm();
		final double C = a.subtract(b).norm();
		
		final double S = Math.abs(b.subtract(a).cross(c.subtract(a)));
		
		final Point pa = a.mul(A * (B + C - A));
		final Point pb = b.mul(B * (C + A - B));
		final Point pc = c.mul(C * (A + B - C));
		
		final Point p = pa.add(pb).add(pc).div(4 * S * S);
		return new Circle(p, a.subtract(p).abs());
	}
	
	public static Circle c2(Point a, Point b) {
		final Point c = a.add(b).div(2);
		return new Circle(c, a.subtract(c).abs());
	}
	
	public static boolean in_circle(Point p, Circle c) {
		return p.subtract(c.p).norm() <= (c.r * c.r + EPS); 
	}
	
	public static double smallestEnclosingCircle(final int N, Point[] ps) {
		Circle c = c2(ps[0], ps[1]);
		for(int i = 2; i < N; i++) {
			if(in_circle(ps[i], c)) { continue; }
			
			c = c2(ps[0], ps[i]);
			for(int j = 1; j < i; j++) {
				if(in_circle(ps[j], c)) { continue; }
				
				c = c2(ps[j], ps[i]);
				//System.out.println(c.p.x + " " + c.p.y);
 
				for(int k = 0; k < j; k++) {
					if(in_circle(ps[k], c)) { continue; }
					
					c = c3(ps[i], ps[j], ps[k]);
					//System.out.println(c.p.x + " " + c.p.y);
				}
			}
		}
		
		return c.r;
	}

    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private long nl()
    {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        
        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
 
}
