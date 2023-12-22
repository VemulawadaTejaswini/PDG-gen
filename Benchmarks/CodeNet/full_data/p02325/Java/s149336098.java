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

        int n = sc.nextInt();
        
        Point[] l = new Point[n];
        
        for(int i=0;i<n;i++){
        	l[i] = new Point(sc.nextDouble(),sc.nextDouble());
        }
        
        out.println(bitonicTSP(l));
        
        out.flush();
    }
    
	static double bitonicTSP(Point[] l){
		//Arrays.sort(l);	//x座標の昇順、ソート済みならいらない
		
		int n = l.length;
		double[][] dp = new double[n][n];	//i→0→jの最短経路の距離 j>=i
		
		for(int j=1;j<n;j++){
			dp[0][j] = dp[0][j-1] + l[j].dist(l[j-1]);	//0からjまでの距離
		}
		
		for(int i=1;i<n;i++){
			for(int j=i;j<n;j++){
				if(i==j){
					dp[i][j] = dp[i-1][j] + l[i-1].dist(l[j]);
				}
				else if(i==j-1){
					double min = Double.POSITIVE_INFINITY;
					for(int k=0;k<j;k++){
						min = Math.min(min, dp[k][j-1] + l[k].dist(l[j]));
					}
					dp[i][j] = min;
				}
				else{
					dp[i][j] = dp[i][j-1] + l[j].dist(l[j-1]);
				}
			}
		}
		
		return dp[n-1][n-1];
	}
    
}

class Point implements Comparable<Point>{
	double x,y;
	
	public Point(double a, double b){
		this.x = a;
		this.y = b;
	}
	
	//通常のユークリッド距離
	public double dist(Point b){
		return Math.sqrt((x-b.x)*(x-b.x) + (y-b.y)*(y-b.y));
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
