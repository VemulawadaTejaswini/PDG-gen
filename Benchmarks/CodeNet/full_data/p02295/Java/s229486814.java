import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	//static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
        	Point p0 = new Point(sc.nextDouble(),sc.nextDouble());
        	Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
        	Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
        	Point p3 = new Point(sc.nextDouble(),sc.nextDouble());
        	Line l1 = new Line(p0,p1);
        	Line l2 = new Line(p2,p3);
        	Point c = l1.crossPoint(l2);
        	System.out.println(c.x + " " + c.y);
        }
    }

    
}

class Line {
	static final double allowableError = 0.00000001;
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
	
	//直線lと平行かどうか
	boolean isParallel(Line l){
		if(Math.abs(a*l.b - l.a*b) < allowableError){
			return true;
		}
		else{
			return false;
		}
	}
	
	//直線lと垂直かどうか
	boolean isOrthogonal(Line l){
		if(Math.abs(a*l.a + b*l.b) < allowableError){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void display(){
		System.out.println(a + "x + " + b + "y + " + c + " = 0");
	}
	
}

class Polygon {
	static final double allowableError = 0.00000001;
	ArrayList<Point> pl; //反時計周り
	
	public Polygon(ArrayList<Point> pol){
		this.pl = pol;
	}
	
	//面積を導出
	double area(){
		//|det|/2は作る三角形の面積に一致
		double ans = 0;
		
		for(int i=0;i<pl.size();i++){
			ans += det(pl.get(i), pl.get(next(i)));
		}
		
		return ans/2;
	}
	
	//pが多角形に含まれるなら2、pが辺上にあるなら1、pが外側にあるなら0を返す
	int contain(Point p){
		//pからx軸と平行・正方向の半直線を引き、奇数回交差すれば内部にある
		boolean isIn = false;
		for(int i=0;i<pl.size();i++){
			int upid = i;
			int downid = next(i);
			if(pl.get(i).y < pl.get(next(i)).y){
				upid = next(i);
				downid = i;
			}
			
			//ベクトルを便宜的に
			Point pup = new Point(pl.get(upid).x - p.x, pl.get(upid).y - p.y);	//p→p_i
			Point pdown = new Point(pl.get(downid).x - p.x, pl.get(downid).y - p.y); //p→p_next(i)
			
			double det = det(pup, pdown);
			if(pup.y > 0 && 0 >= pdown.y){	//2重カウントしないために不等号を>と>=にする
				if(det < 0){
					isIn = !isIn;
				}
			}
			
			//辺上判定
			if(Math.abs(det) < allowableError){	//p→p_iとp→p_next(i)が一直線上
				if(pup.x * pdown.x + pup.y * pdown.y <= 0){	//pからみて同方向でない
					return 1;
				}
			}
		}
		
		if(isIn){
			return 2;
		}
		else{
			return 0;
		}
	}
	
	//凸多角形か判定
	boolean isConvex(){
		//反時計回りに回り続けるなら凸
		for(int i=0;i<pl.size();i++){
			if(direction(pl.get(next(i)),pl.get(i),pl.get(next(next(i)))) == 1){
				return false;
			}
		}
		return true;
	}
	
	//反時計回りに1つ進んだ頂点のindex
	int next(int id){
		int size = pl.size();
		if(id<=size-2){
			return id+1;
		}
		else{
			return 0;
		}
	}
	//ベクトルのdet
	static double det(double x1, double y1, double x2, double y2){
		return x1*y2 - x2*y1;
	}
	static double det(Point p, Point q){
		return p.x*q.y - p.y*q.x;
	}
	
	//p0を起点に、p1へのベクトルからみてp2へのベクトルが反時計回りなら1、時計回りなら2
	//↑が同一直線状にあるとき、→p2が→p1と反対側なら3、→p2が→p1の延長線上なら4、→p2が→p1上にあれば5を返す
	static int direction(Point p0, Point p1, Point p2) {
		if(p0.x == p1.x) {
			if(p2.x == p0.x) {
				if((p0.y <= p2.y && p2.y <= p1.y) || (p1.y <= p2.y && p2.y <= p0.y)) {
					return 5;
				}else if (d2(p0,p2) < d2(p1,p2)) {
					return 3;
				}else {
					return 4;
				}
			}else if ((p0.y < p1.y && p2.x < p0.x) || (p0.y > p1.y && p2.x > p0.x)) {
				return 1;
			}else {
				return 2;
			}

		}else{
			//y=ax+b上にp0,p1が存在
			double a = (p1.y - p0.y) / (p1.x - p0.x);
			double b = p1.y - a * p1.x;
			if(Math.abs(p2.y - (a * p2.x + b)) < allowableError) {
				if((p0.x <= p2.x && p2.x <= p1.x) || (p1.x <= p2.x && p2.x <= p0.x)) {
					return 5;
				}else if (d2(p0,p2) < d2(p1,p2)) {
					return 3;
				}else {
					return 4;
				}
			}else if ((p0.x < p1.x && p2.y - (a * p2.x + b) > 0) || (p0.x > p1.x && p2.y - (a * p2.x + b) < 0)) {
				return 1;
			}else {
				return 2;
			}
		}
	}
	//ユークリッド距離の2乗
	static double d2(Point p1, Point p2){
		return (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
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
