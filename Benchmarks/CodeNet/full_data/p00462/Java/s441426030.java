import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		while(true) {
			int d = io.nextInt();
			if (d == 0) {
				break;
			}
			int n = io.nextInt();
			int m = io.nextInt();
			int[] a = new int[n+1];
			for(int i=1;i<n;i++) {
				a[i] = io.nextInt();
			}
			a[n] = d;
			Arrays.sort(a);
			int ans = 0;
			for(int i=0;i<m;i++) {
				int x = io.nextInt();
				int ind = Arrays.binarySearch(a, x);
				if (ind < 0) {
					ind = (ind + 2) * -1;
				}
				ans += Math.min(Math.abs(x-a[ind]),Math.abs(x-a[ind+1]));
			}
			io.println(ans);
		}
		io.flush();
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
	public String nextLine() { if (hasNextLine()) {index = bf.length; return bfl; }else return null; }
	public int nextInt() { return Integer.parseInt(next()); }
	public long nextLong() { return Long.parseLong(next()); }
	public double nextDouble() { return Double.parseDouble(next()); };
	public char nextChar() { return next().charAt(0); }
	public void println(long x) { out.append(x); out.append("\n"); }
	public void println(double x) { out.append(x); out.append("\n"); }
	public void println(String s) { out.append(s); out.append("\n"); }
	public void println() { out.append("\n"); }
	public void print(long x) { out.append(x); }
	public void print(double x) { out.append(x); }
	public void print(String s) { out.append(s); }
	public void print(char c) {out.append(c);}
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