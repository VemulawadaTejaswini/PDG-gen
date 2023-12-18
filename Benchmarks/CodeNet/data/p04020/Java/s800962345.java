import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(f.readLine().trim());
		long[] vals = new long[n];
		for(int i = 0; i < n; i++) 
			vals[i] = Integer.parseInt(f.readLine().trim());
		if(n == 1) {
			System.out.println(vals[0]/2);
			return;
		}
		long ans = 0;
		long[] added = new long[n];
		for(int i = 0; i < n; i++) {
			long add = -1;
			add = Math.max(vals[i]/2, i+1 < n ? Math.min(vals[i], vals[i+1]) : 0);
			if(add == vals[i]/2) {
				ans+=add;
			} else {
				vals[i+1] -= add;
				ans += add;
			}
		}
		System.out.println(ans);
	}
}