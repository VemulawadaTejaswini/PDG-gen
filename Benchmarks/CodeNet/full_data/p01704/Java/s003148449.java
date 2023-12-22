import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		while(true) {
			int n = io.nextInt();
			if (n == 0) {
				break;
			}
			int pw = io.nextInt();
			Tuple[] t = new Tuple[n+1]; //a + bx
			double a = 0;
			double b = pw;
			for(int i=0;i<n;i++) {
				double vw = io.nextInt();
				double pf = io.nextInt();
				double vf = io.nextInt();
				double th = io.nextInt();
				t[i] = new Tuple(th/vw, pf*th/vf, -pf*vw/vf);
				if (t[i].a > 0) {
					a += t[i].a;
					b += t[i].b;
					t[i].a *= -1;
					t[i].b *= -1;
				}
			}
			t[n] = new Tuple(0,0,0);
			Arrays.sort(t);
			int i = 0;
			while(t[i].x < 0) {
				i++;
			}
			double ans = a;
			for(;i<n;i++) {
				 ans = Math.min(ans,a+b*t[i].x);
				 a += t[i].a;
				 b += t[i].b;
			}
			io.println(ans);
		}
		io.flush();


	}

}
class Tuple implements Comparable<Tuple>{
	double x,a,b;
	public Tuple(double x,double a,double b) {
		this.x = x;
		this.a = a;
		this.b = b;
	}
	public int compareTo(Tuple o) {
		return Double.compare(this.x, o.x);
	}
	public String toString() {
		return "(" + x + "," + a + "," + b + ")";
	}
}

class IO {
	BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder out = new StringBuilder();
	int index = 0;
	String bfl = null;
	String[] bf = new String[0];
	private boolean read() {
		try {
			bfl = bi.readLine();
			if (bfl == null) {
				return false;
			}
			bf = bfl.split("\\s");
			index = 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean hasNext() { return index < bf.length ? true : read(); }
	public boolean hasNextLine() { return read(); }
	public String next() { return hasNext() ? bf[index++] : null; }
	public String nextLine() { return hasNextLine() ? bfl : null; }
	public int nextInt() { return Integer.parseInt(next()); }
	public long nextLong() { return Long.parseLong(next()); }
	public double nextDouble() { return Double.parseDouble(next()); };
	public void println(long x) { out.append(x); out.append("\n"); }
	public void println(double x) { out.append(x); out.append("\n"); }
	public void println(String s) { out.append(s); out.append("\n"); }
	public void print(long x) { out.append(x); }
	public void print(double x) { out.append(x); }
	public void print(String s) { out.append(s); }
	public void flush() {System.out.print(out); out = new StringBuilder(); }
	public int[] arrayInt(int n) {
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = nextInt();
		}
		return a;
	}
	public long[] arrayLong(int n) {
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = nextLong();
		}
		return a;
	}
	public double[] arrayDouble(int n) {
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i] = nextDouble();
		}
		return a;
	}
}