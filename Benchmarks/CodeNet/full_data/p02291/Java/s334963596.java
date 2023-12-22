import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class Main implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
        Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
        Line l = new Line(p1,p2);
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++){
        	Point p = new Point(sc.nextDouble(),sc.nextDouble());
        	Point ans = l.reflection(p);
        	System.out.println(ans.x + " " + ans.y);
        }
    }

}

class Line {
	double a;
	double b;
	double c;
	
	//2点p,qを通る直線
	public Line(Point p, Point q){
		if(p.y == q.y){
			this.a = 0;
			this.b = 1;
			this.c = -(p.y);
		}
		else if(p.x == q.x){
			this.a = 1;
			this.b = 0;
			this.c = -(p.x);
		}
		else{
			this.a = p.y - q.y;
			this.b = q.x - p.x;
			this.c = - a*p.x - b*p.y;
		}
	}
	//ax+by+c=0
	public Line(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//y=ax+c
	public Line(double a, double c){
		this.a = a;
		this.b = -1;
		this.c = c;
	}
	
	//点pからの垂線の足
	public Point projection(Point p){
		//-bx+ay+d=0がこの直線と垂直でpを通る直線とし、dを求める
		double d = b*p.x - a*p.y;
		return intersection(new Line(-b,a,d));
	}
	
	//点pと線対称な点
	public Point reflection(Point p){
		Point proj = projection(p);
		double x = proj.x + (proj.x - p.x);
		double y = proj.y + (proj.y - p.y);
		return new Point(x,y);
	}
	
	//交点
	public Point intersection(Line l){
		if(a==0){
			double x = (l.b*c - l.c)/l.a;
			return new Point(x,-c);
		}
		if(l.a==0){
			double x = (b*l.c - c)/a;
			return new Point(x, -l.c);
		}
		
		//xの係数をlと等しくする
		//気持ちは double A = l.a;
		double mlt = l.a/a;
		double B = b * mlt;
		double C = c * mlt;
		double y = (l.c-C)/(B-l.b);
		double x = (-b*y-c)/a;
		return new Point(x,y);
	}
	
	public void display(){
		System.out.println(a + "x + " + b + "y + " + c + " = 0");
	}
	
}

class Point implements Comparable<Point>{
	double x,y;
	
	public Point(double a, double b){
		this.x = a;
		this.y = b;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Point o){
		if(x!=o.x){
			return Double.compare(x,o.x);
		}
		return Double.compare(y, o.y);
	}
		
}


class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
