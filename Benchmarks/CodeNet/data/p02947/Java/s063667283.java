import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		char[][] strings = new char[n][10];
		TreeMap<Long, Long> pairs = new TreeMap<>();
		
		for(int i = 0; i < n; i++) {
			strings[i] = br.readLine().toCharArray();
			Arrays.sort(strings[i]);
			int counter = 0;
			long sum = 0;
			for(int j = 9; j >= 0; j--) {
				sum += ((strings[i][j] - 97) * (long)Math.pow(26, counter));
				counter++;
			}
			
			if(pairs.containsKey(sum))
				pairs.put(sum, pairs.get(sum) + 1);
			else
				pairs.put(sum, 1l);
		}
		
		long comb = 0;
		while(!pairs.isEmpty()) {
			Entry e = pairs.pollFirstEntry();
			long x = (Long)e.getValue();
			if(x == 1)
				continue;
			comb += (long)c(x, 2);
		}
		
		pw.println(comb);
		pw.flush();
		pw.close();
	}
	
	// up to 9.2 * (10 ^ 18) = (2 ^ 63) - 1
	public static long pow(long a, int n) {
		long res = 1;
		while(n != 0) {
			if((n & 1) == 1)
				res *= a;
			a *= a;
			n >>= 1;			
		}
		return res;
	}
	
	public static double c(long x, long y) {
		return (fac(x) / (fac(y) * fac(x - y)));
	}

	public static double fac(long x) {
		if(x <= 1)
			return 1;
		return x * fac(x - 1);
	}

}
