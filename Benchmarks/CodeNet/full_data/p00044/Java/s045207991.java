import java.io.*;
import java.math.*;
import java.util.*;

class Main {

	public static boolean[] sieve (int n) {

		boolean[] isPrime = new boolean[n];
		int lim = (int)Math.sqrt(n);
		Arrays.fill(isPrime, true);
		for (int i = 4; i < isPrime.length; i += 2)
			isPrime[i] = false;
		for (int i = 3; i <= lim; i += 2) {
			for (int j = 3; i * j < isPrime.length; j += 2) {
				isPrime[i * j] = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> ans = new ArrayList<String>();

		while (true) {

			String s = br.readLine();
			if (s == null) break;
			int n = Integer.parseInt(s);
			boolean[] isPrime = sieve(n);
			int res = 0;
			for (int i = isPrime.length - 1; i >= 2; i--) {
				if (isPrime[i]) {
					res = i;
					break;
				}
			}
			ans.add(String.valueOf(res) + " " + BigInteger.valueOf(n).nextProbablePrime().toString());
		}

		for (String p : ans) {
			System.out.println(p);
		}
	}

}