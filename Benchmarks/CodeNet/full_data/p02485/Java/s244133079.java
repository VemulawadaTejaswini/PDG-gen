import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String x = br.readLine();
			if ("0".equals(x)) break;
			System.out.println(solve(x));
		}
	}
	
	public static int solve(String x) {
		int sum = 0; 
		for (int i = 0; i < x.length(); i++) sum += x.charAt(i) - '0';
		return sum;
	}
}