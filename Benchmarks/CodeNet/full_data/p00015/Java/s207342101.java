import java.io.*;
import java.math.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String in = r.readLine();
			if(in == null) break;
			BigInteger n = new BigInteger(in);
			BigInteger count;
			BigInteger sum;
			count = sum = BigInteger.ZERO;
			while(count.compareTo(n) == -1) {
				sum = sum.add(new BigInteger(r.readLine()));
				count = count.add(BigInteger.ONE);
			}
			System.out.println(sum);
		}
	}
}