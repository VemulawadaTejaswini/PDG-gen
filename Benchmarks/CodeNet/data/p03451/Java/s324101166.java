import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	static class Scanner{
		BufferedReader br=null;
		StringTokenizer tk=null;
		public Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		public String next() throws IOException{
			while(tk==null || !tk.hasMoreTokens()) {
				String cad = br.readLine();
				if (cad == null)
					return null;
				tk=new StringTokenizer(cad);
			}
			return tk.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException{
			return Integer.valueOf(next());
		}
		public long nextLong() throws NumberFormatException, IOException{
			return Long.valueOf(next());
		}
		public double nextDouble() throws NumberFormatException, IOException{
			return Double.valueOf(next());
		}
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int[] a, b;
		a = new int[N];
		b = new int[N];
		for(int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		for(int j = 0; j < N; j++)
			b[j] = sc.nextInt();
		int[] bsum = new int[N];
		bsum[N - 1] = b[N - 1];
		for(int i = N - 2; i >= 0; i--)
			bsum[i] = b[i] + bsum[i + 1];
		int ans = 0;
		int acum = 0;
		for(int i = 0; i < N; i++) {
			acum += a[i];
			ans = Math.max(ans, acum + bsum[i]);
		}
		System.out.println(ans);
	}
}
