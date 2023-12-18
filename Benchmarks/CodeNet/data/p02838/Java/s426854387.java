//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Scanner scanner;
	int mod = (int)1e9+7;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		scanner.nextLine();
		String line = scanner.nextLine();
		long[] arr = strToLongArray(line);
		int sz = arr.length;
		long res = 0;
		for (int i=0; i<sz-1; i++) {
			for (int j=i+1; j<sz; j++) {
				res += (arr[i] ^ arr[j]) % mod;
				res %= mod;
			}
		}
		// int N = Integer.parseInt(line.split("\\s+")[0]);
		System.out.println(res);
		return;
	}


	private int[] strToIntArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    int[] res = new int[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Integer.parseInt(vals[i]);
	    }
	    return res;
	}

	private long[] strToLongArray(String str) {
	    String[] vals = str.split("\\s+");
	    int sz = vals.length;
	    long[] res = new long[sz];
	    for (int i=0; i<sz; i++) {
	        res[i] = Long.parseLong(vals[i]);
	    }
	    return res;
	}
}
