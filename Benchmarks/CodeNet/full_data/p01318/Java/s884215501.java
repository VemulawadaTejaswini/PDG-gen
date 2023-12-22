import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
	IOException {Solve solve = new Solve();solve.solve();}
}
class Solve{
	void dump(int[]a){for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");System.out.println();}
	void dump(int[]a,int n){for(int i=0;i<a.length;i++)System.out.printf("%"+n+"d",a[i]);System.out.println();}
	void dump(long[]a){for(int i=0;i<a.length;i++)System.out.print(a[i]+" ");System.out.println();}
	void dump(char[]a){for(int i=0;i<a.length;i++)System.out.print(a[i]);System.out.println();}
	String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	void solve() throws NumberFormatException, IOException{
		final ContestScanner in = new ContestScanner();
		Writer out = new Writer();
		int n;
		final double EPS = 1e-9;
		while((n=in.nextInt())!=0){
			int[] x = new int[n];
			int[] y = new int[n];
			int[] r = new int[n];
			int[] m = new int[n];
			Circle[] szc = new Circle[n];
			Circle[] mgc = new Circle[n];
			for(int i=0; i<n; i++){
				x[i] = in.nextInt(); y[i] = in.nextInt();
				r[i] = in.nextInt(); m[i] = in.nextInt()+r[i];
				szc[i] = new Circle(x[i], y[i], r[i]);
				mgc[i] = new Circle(x[i], y[i], m[i]);
			}
			if(n==1){
				System.out.println(1);
				continue;
			}
			List<SLine> line = new ArrayList<>();
			for(int i=0; i<n; i++){
				for(int j=i+1; j<n; j++){
					line.addAll(Circle.tangent(szc[i], szc[j]));
					line.addAll(Circle.tangent(szc[i], mgc[j]));
					line.addAll(Circle.tangent(mgc[i], szc[j]));
					line.addAll(Circle.tangent(mgc[i], mgc[j]));
				}
			}
			int max = 0;
			for(SLine l: line){
				int count = 0;
				for(int i=0; i<n; i++){
					final double dist = l.dist(szc[i].p);
					if(dist>r[i]-EPS && dist<m[i]+EPS) count++;
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}
}

class Circle{
	final static double EPS = 1e-8;
	Pos p;
	double r;
	public Circle(double x, double y, double r){
		p = new Pos(x, y);
		this.r = r;
	}
	Circle copy(){
		return new Circle(p.x, p.y, r);
	}
	public Pos[] crossPos(Circle c){
		if(!cross(c)) return null;
		double x1 = c.p.x - p.x;
		double y1 = c.p.y - p.y;
		double a = (x1*x1+y1*y1+r*r-c.r*c.r)/2.0;
		Pos[] res = {
				new Pos(culc(x1, y1, r, a, true)+p.x, culc(y1, x1, r, a, false)+p.y),
				new Pos(culc(x1, y1, r, a, false)+p.x, culc(y1, x1, r, a, true)+p.y),
		};
		return res;
	}
	private static double culc(double x, double y, double r, double a, boolean sign){
		return (a*x + (sign?1:-1)*y*Math.sqrt((x*x+y*y)*r*r-a*a)+EPS)/(x*x+y*y);
	}
	public boolean cross(Circle c){
		return p.dist2(c.p) <= (r+c.r)*(r+c.r) + EPS;
	}
	public static List<SLine> tangent(Circle c1, Circle c2){
		Circle co1 = new Circle(0, 0, c1.r);
		Circle co2 = new Circle(c2.p.x-c1.p.x, c2.p.y-c1.p.y, c2.r);
		final double[] rd = {c1.r+c2.r, c1.r-c2.r};
		List<SLine> res = new ArrayList<>();
		final int[] signX = {1, -1};
		final int[] signY = {-1, 1};
		for(int i=0; i<2; i++){
			final double norm2 = co1.p.dist2(co2.p);
			final double D = norm2-sq(rd[i]);
			if(D<0) continue;
			for(int j=0; j<2; j++)
				res.add(tangent(co1,
						new Pos(c1.r*(co2.p.x*rd[i]+signX[j]*co2.p.y*Math.sqrt(D))/norm2,
								c1.r*(co2.p.y*rd[i]+signY[j]*co2.p.x*Math.sqrt(D))/norm2
								)).move(c1.p.x, c1.p.y)
						);
		}
		return res;
	}
	public static SLine tangent(Circle c1, Pos p){
		return new SLine(p.x-c1.p.x, p.y-c1.p.y
				, -(c1.p.x*(p.x-c1.p.x)+c1.p.y*(p.y-c1.p.y)+c1.r*c1.r));
	}
	public static double sq(double a){
		return a*a;
	}
}

class SLine{
	// ??´???
	double a, b, c;
	SLine(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		if(a==0 && b==0) throw new ArithmeticException();
	}
	double dist(Pos p){
		return Math.abs(a*p.x+b*p.y+c)/Math.sqrt(a*a+b*b);
	}
	SLine move(double dx, double dy){
		// dx, dy?????????????§????
		c += -dx*a-dy*b;
		return this;
	}
	@Override
	public String toString() {
		return a+"x + "+b+"y + "+c+" = 0\t( y = "+(-a/b)+"x + "+(-c/b);
	}
}

class Pos implements Comparable<Pos>{
	static final double EPS = 1e-10;
	double x, y;
	public Pos(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Pos copy(){
		return new Pos(x, y);
	}
	public Pos resizeVec(double size){
		double sq = Math.sqrt(x*x+y*y);
		return new Pos(x*size/sq, y*size/sq);
	}
	public double dist2(Pos p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
	}
	@Override
	public int compareTo(Pos o) {
		if(Math.abs(x-o.x) >= EPS) return Double.compare(x, o.x);
		if(Math.abs(y-o.y) >= EPS) return Double.compare(y, o.y);
		return 0;
	}
}

class MultiSet<T> extends HashMap<T, Integer>{
	@Override
	public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key)
	{final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
}
class Timer{
	long time;
	public void set(){time=System.currentTimeMillis();}
	public long stop(){return time=System.currentTimeMillis()-time;}
	public void print()
	{System.out.println("Time: "+(System.currentTimeMillis()-time)+"ms");}
	@Override public String toString(){return"Time: "+time+"ms";}
}
class Writer extends PrintWriter{
	public Writer(String filename)throws IOException
	{super(new BufferedWriter(new FileWriter(filename)));}
	public Writer()throws IOException{super(System.out);}
}
class ContestScanner {
	private InputStreamReader in;private int c=-2;
	public ContestScanner()throws IOException 
	{in=new InputStreamReader(System.in);}
	public ContestScanner(String filename)throws IOException
	{in=new InputStreamReader(new FileInputStream(filename));}
	public String nextToken()throws IOException {
		StringBuilder sb=new StringBuilder();
		while((c=in.read())!=-1&&Character.isWhitespace(c));
		while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public String readLine()throws IOException{
		StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
		while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public long nextLong()throws IOException,NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt()throws NumberFormatException,IOException
	{return(int)nextLong();}
	public double nextDouble()throws NumberFormatException,IOException 
	{return Double.parseDouble(nextToken());}
}