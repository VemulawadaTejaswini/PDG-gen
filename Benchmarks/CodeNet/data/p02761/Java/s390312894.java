//--- pC ---//
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
	int inf = (int)1e9;

	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		int[] tarr = strToIntArray(scanner.nextLine());
		int N = tarr[0], M = tarr[1];
		int[] res = new int[N];
		for (int i=0; i<M; i++) {
			tarr = strToIntArray(scanner.nextLine());

			if (res[tarr[0] - 1] != 0 && res[tarr[0] - 1] != tarr[1]) {
				System.out.println("-1");
				return;
			}
			if (N!=1 && tarr[0]==1 && tarr[1]==0) {
				System.out.println("-1");
				return;
			}

			res[tarr[0] - 1] = tarr[1];
		}

		if (N != 1 && res[0] == 0) res[0] = 1;
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<N; i++) {
			sb.append(res[i]);
		}
		System.out.println(sb.toString());

		return;
	}

	private double getAver(int[] arr) {
		double sum = 0.0;
		for (int u: arr) sum += u;

		return Math.round(sum / arr.length);
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
}
