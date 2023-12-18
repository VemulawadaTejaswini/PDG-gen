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
		scanner.nextLine();
		String line = scanner.nextLine();

		// int N = Integer.parseInt(line);
		// int a = Integer.parseInt(line.split("\\s+")[0]);
		// int b = Integer.parseInt(line.split("\\s+")[1]);
		// long x = Long.parseLong(line.split("\\s+")[2]);

		int[] arr = strToIntArray(line);
		Set<Integer> vis = new HashSet<>();
		for (int u : arr) {
			if (vis.contains(u)) {
				System.out.println("NO");
				return;
			}
			vis.add(u);
		}

		System.out.println("YES");
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
}
