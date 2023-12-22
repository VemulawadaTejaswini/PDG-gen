import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String[] in = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		solve(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
	}
	
	public static void solve(int a, int b) {
		System.out.printf("%d %d %.5f", a/b, a%b, (double)a/b);
	}
}