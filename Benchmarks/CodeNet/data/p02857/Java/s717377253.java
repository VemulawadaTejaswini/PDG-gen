import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static String INPUT = "";
	
	static int n;
	
	static boolean q(int... a)
	{
		assert a.length == n;
		out.print("?");
		for(int v : a){
			out.print(" " + (v+1));
		}
		out.println();
		out.flush();
		return in.next().equals("Red");
	}
	
	static void solve()
	{
		n = ni();
		boolean[] res = new boolean[2*n];
		for(int i = 0;i < n;i++){
			int[] a = new int[n];
			for(int j = 0;j < n;j++){
				a[j] = i+j;
			}
			res[i] = q(a);
			res[i+n] = !res[i];
		}
		int[] color = new int[2*n];
		for(int i = 0;i < 2*n;i++){
			if(!res[i] && res[(i+1)%(2*n)]){
				// f -> t
				// i = blue, i+n = red
				color[i] = -1; 
				color[(i+n)%(2*n)] = 1;
				for(int k = 1;k < n;k++){
					int[] a = new int[n];
					for(int j = 0;j < n;j++){
						a[j] = (i+j) % (2*n);
						if(j == k){
							a[j] = (i+n) % (2*n);
						}
					}
					if(q(a)){
						color[(i+k) % (2*n)] = -1;
					}else{
						color[(i+k) % (2*n)] = 1;
					}
				}
				for(int k = 1;k < n;k++){
					int[] a = new int[n];
					for(int j = 0;j < n;j++){
						a[j] = (i+n+j) % (2*n);
						if(j == k){
							a[j] = i;
						}
					}
					if(q(a)){
						color[(i+n+k) % (2*n)] = -1;
					}else{
						color[(i+n+k) % (2*n)] = 1;
					}
				}
			}
		}
		out.print("! ");
		for(int i = 0;i < 2*n;i++){
			out.print(color[i] == 1 ? 'R' : 'B');
		}
		out.println();
		out.flush();
	}
	
	public static void main(String[] args) throws Exception
	{
		in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
	}
	
	static int ni() { return Integer.parseInt(in.next()); }
	static long nl() { return Long.parseLong(in.next()); }
	static double nd() { return Double.parseDouble(in.next()); }
	static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
