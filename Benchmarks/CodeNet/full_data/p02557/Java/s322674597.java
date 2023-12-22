import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

	

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();

		int n = sc.nextInt();
		int a[]=sc.readArray(n);
		int b[]=sc.readArray(n);
		int f[]=new int[200005];
		int max=Integer.MIN_VALUE;
		int id=-1;
		for(int i:a) {
			f[i]++;
			if(max<f[i]) {
				max=f[i];
				id=i;
			}
		}
		int f1[]=new int[200005];
		for(int i:b) f1[i]++;
		
		if(max<=n-f1[id]) {
			System.out.println("Yes");
			for(int i=n-1;i>=0;i--) System.out.print(b[i]+" ");
			System.out.println();
			
		}
		else 
			System.out.println("No");
		
		
		
		

	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
