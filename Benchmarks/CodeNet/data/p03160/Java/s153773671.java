import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
	private static void solve(FastScanner fr) {
		int n = fr.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = fr.nextInt();			

		if(n<2) {
			sout(0);
			return;
		}
		if(n==2) {
			sout((int)Math.abs(arr[1] - arr[0]));
			return;
		}
		
		int pp = 0;
		int p = Math.abs(arr[1] - arr[0]);
		for(int i = 2; i < n; i++) {
			int cur = Math.min(pp + Math.abs(arr[i] - arr[i-2]), p + Math.abs(arr[i] - arr[i-1]));
			// sout(i + " " + cur);
			pp = p;
			p = cur;
		}

		sout(p);
	}
    public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = 1;
		// int n = fs.nextInt();
		while (n-- > 0)	{
			solve(fs);
        }
    }

    private static void sout()          { System.out.println();  }
    private static void sout(String s)  { System.out.println(s); }
    private static void sout(int s)     { System.out.println(s); }
    private static void sout(long s)    { System.out.println(s); }
    private static void sout(double s)  { System.out.println(s); }
    
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { st=new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); }
			return st.nextToken();
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
