import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
       	PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++){
        	Point p0 = new Point(sc.nextDouble(),sc.nextDouble());
        	Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
        	Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
        	Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
        	LineSegment ls1 = new LineSegment(p0,p1);
        	LineSegment ls2 = new LineSegment(p2,p3);
        	if(ls1.isIntersect(ls2)){
        		out.println(1);
        	}
        	else{
        		out.println(0);
        	}
        }
        
        out.flush();
    }

    
}

class Point implements Comparable<Point>{
	double x,y;
	static final double eps = 0.00000001;
	
	public Point(double a, double b){
		this.x = a;
		this.y = b;
	}
	
	//距離の2乗
	public double d2(Point b){
		return (x-b.x)*(x-b.x) + (y-b.y)*(y-b.y);
	}
	
	//通常のユークリッド距離
	public double dist(Point b){
		return Math.sqrt((x-b.x)*(x-b.x) + (y-b.y)*(y-b.y));
	}
	
	//p1へのベクトルからみてp2へのベクトルが反時計回りなら1、時計回りなら2
	//↑が同一直線状にあるとき、→p2が→p1と反対側なら3、→p2が→p1の延長線上なら4、→p2が→p1上にあれば5を返す
	int direction(Point p1, Point p2){
		
		if(p2.x == x && p2.y == y){
			return 5;
		}
		
		//外積の第三成分 = |→p1||→p2|sinθ
		double det = (p1.x -x)*(p2.y-y) - (p2.x -x)*(p1.y - y);
		
		if(det>eps){
			return 1;
		}
		else if(det<-eps){
			return 2;
		}
		else{	//同一直線状
			if((p1.x-x >0 == p2.x-x <0) && p1.x-x != 0){	//反対側
				return 3;
			}
			else if((p1.y-y >0 == p2.y-y <0) && p1.y-y != 0){	//反対側
				return 3;
			}
			else{
				double d10 = d2(p1);	//p1とp0の距離^2
				double d20 = d2(p2);	//p2とp0の距離^2
				if(d10 < d20){	//p2のほうが遠い
					return 4;
				}
				else{
					return 5;
				}
			}
		}
		
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

class Line {
	double a;
	double b;
	double c;
	static final double eps = 0.00000001;
	
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
	public Line(LineSegment ls){
		Point p = ls.p1;
		Point q = ls.p2;
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
		return crossPoint(new Line(-b,a,d));
	}
	
	//点pと線対称な点
	public Point reflection(Point p){
		Point proj = projection(p);
		double x = proj.x + (proj.x - p.x);
		double y = proj.y + (proj.y - p.y);
		return new Point(x,y);
	}
	
	//直線lとの交点
	public Point crossPoint(Line l){
		if(a==0){ //b=1前提
			double x = (l.b*c - l.c)/l.a;
			return new Point(x,-c);
		}
		if(l.a==0){ //l.b=1前提
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
	
	//直線lと同一かどうか
	public boolean isSame(Line l){
		if(a == 0){
			if(l.a != 0){
				return false;
			}
			else{
				if(Math.abs(c - l.c)<eps){
					return true;
				}
				else{
					return false;
				}
			}
		}
		
		if(b == 0){
			if(l.b != 0){
				return false;
			}
			else{
				if(Math.abs(c - l.c)<eps){
					return true;
				}
				else{
					return false;
				}
			}
		}
		
		if(Math.abs(a*l.b - b*l.a)<eps && Math.abs(b*l.c - c*l.b)<eps){	//a1:b1:c1 = a2:b2:c2
			return true;
		}
		else{
			return false;
		}
	}
	
	//直線lと平行かどうか
	boolean isParallel(Line l){
		if(Math.abs(a*l.b - l.a*b) < eps){
			return true;
		}
		else{
			return false;
		}
	}
	
	//直線lと垂直かどうか
	boolean isOrthogonal(Line l){
		if(Math.abs(a*l.a + b*l.b) < eps){
			return true;
		}
		else{
			return false;
		}
	}

	
	public void print(){
		System.out.println(a + "x + " + b + "y + " + c + "= 0" );
	}
	
	public void display(){
		System.out.println(a + "x + " + b + "y + " + c + " = 0");
	}
	
}

class LineSegment {
	Point p1;
	Point p2;
	static final double eps = 0.00000001;
	
	public LineSegment(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	boolean isIntersect(LineSegment ls){
		Line a = new Line(this);
		Line b = new Line(ls);
		
		if(a.isSame(b)){	//重なる
			if(p1.x == p2.x){	//x軸に垂直
				double big = Math.max(p1.y, p2.y);
				double small = Math.min(p1.y, p2.y);
				double lbig = Math.max(ls.p1.y, ls.p2.y);
				double lsmall = Math.min(ls.p1.y, ls.p2.y);
				
				if(lsmall <= big && small <= lbig){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				double big = Math.max(p1.x, p2.x);
				double small = Math.min(p1.x, p2.x);
				double lbig = Math.max(ls.p1.x, ls.p2.x);
				double lsmall = Math.min(ls.p1.x, ls.p2.x);
				
				if(lsmall <= big && small <= lbig){
					return true;
				}
				else{
					return false;
				}
			}
			
		}
		else if(a.isParallel(b)){	//平行
			return false;
		}
		else{
			Point cross = a.crossPoint(b);

			if(isOn(cross) && ls.isOn(cross)){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	//pが線分上にあるか
	boolean isOn(Point p){
		if(p1.x == p2.x){	//x軸に垂直
			double big = Math.max(p1.y, p2.y);
			double small = Math.min(p1.y, p2.y);
			
			if(small <= p.y && p.y <= big){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			double big = Math.max(p1.x, p2.x);
			double small = Math.min(p1.x, p2.x);
			
			if(small <= p.x && p.x <= big){
				return true;
			}
			else{
				return false;
			}
		}
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
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
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
