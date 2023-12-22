import java.util.*;
import java.io.*;

class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int m = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		int n = Integer.parseInt(line.substring(line.indexOf(" ")+1));

		long ans = 1;
		while (n > 0) {
			if ((n&1) == 1)
				ans = ans * m % MOD;
			m = m * m % MOD;
			n >>= 1;
		}

		System.out.println(ans);

		br.close();
	}
}