import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] in = br.readLine().split(" ");
			if ("?".equals(in[1])) break;
			System.out.println(solve(Integer.parseInt(in[0]), in[1], Integer.parseInt(in[2])));
		}
	}
	
	public static int solve(int a, String op, int b) {
		if ("+".equals(op)) return a + b;
		if ("-".equals(op)) return a - b;
		if ("*".equals(op)) return a * b;
		if ("/".equals(op)) return a / b;
		return 0;
	}
}