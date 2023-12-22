import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = r.readLine();
			if(s == null) break;
			int i = s.indexOf(" ");
			long a = Long.valueOf(s.substring(0, i));
			long b = Long.valueOf(s.substring(i+1));
			System.out.println(gcd(a, b) + " " + lcm(a, b));
		}
	}
	private static long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
	private static long lcm(long a, long b) {
		return b * a / gcd(a, b);
	}
}