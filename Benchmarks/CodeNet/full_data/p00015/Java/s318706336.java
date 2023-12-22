import java.io.*;
import java.math.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String in = r.readLine();
			if(in == null) break;
			long n = Long.valueOf(in);
			long count = 0;
			BigInteger sum = BigInteger.ZERO;
			while(count < n) {
				sum = sum.add(new BigInteger(r.readLine()));
				count++;
			}
			System.out.println(sum);
		}
	}
}