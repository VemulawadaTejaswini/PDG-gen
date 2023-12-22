import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer tk = new StringTokenizer(in.readLine());
			while (tk.hasMoreTokens()) {
					int a = Integer.parseInt(tk.nextToken());
					int b = Integer.parseInt(tk.nextToken());
					System.out.println(gcd(a, b) + " " + lcm(a, b));
					tk = new StringTokenizer(in.readLine());
			}
	}
	public static int gcd(int a, int b) {
		if (a >= b) {
			for (int d = a; d > 0; d --) { 
				if ((b % d) == 0 && (a % d) == 0) 
					return d;
			}
		}
		else {
			for (int d = b; d > 0; d --) {
				if ((b % d) == 0 && (a % d) == 0) 
					return d;
			}
		}
		return 0;
	}
	
	public static int lcm(int a, int b) {
		int mult = 1;
		if (a >= b) {
			while(true) {
				if (((a*mult) % b) == 0) 
					return a*mult;
				mult++;
			}
		}
		else {
			while(true) {
				if (((a*mult) % b) == 0) 
					return b*mult;
				mult++;
			}
		}
	}
}