import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Main {
	static BufferedReader jvin = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter jvout = new PrintWriter(System.out);

	static int maxN = (int)1E5+5;
	int n;
	int[] a;

	public static void main(String[] args) throws IOException {
		Main instance = new Main();
		instance.passStaticVar();
	}

	public void passStaticVar() throws IOException {
		n = Integer.parseInt(jvin.readLine());
		a = new int[n+1];
		for (int i = 1; i <= n; ++i) 
			a[i] = Integer.parseInt(jvin.readLine());
		
		boolean[] marked = new boolean[n+1];
		for (int i = 1; i <= n; ++i)
			marked[i] = false;
		int result = 0, i = 1;
		for ( ; !marked[i] && i != 2; i = a[i]) {
			marked[i] = true;
			++result;
		}
		if (i == 2) jvout.println(result);
		else jvout.println("-1");
		jvout.flush();
	}
}
