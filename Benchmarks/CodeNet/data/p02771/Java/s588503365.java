//--- pA ---//
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
	public Solution() {
		scanner = new Scanner(System.in);

		// scanner.nextLine();
		while (scanner.hasNext()) {
			run_case();
		}
	}
	private void run_case() {
		// scanner.nextLine();
		String line = scanner.nextLine();

		int a = Integer.parseInt(line.split("\\s+")[0]);
		int b = Integer.parseInt(line.split("\\s+")[1]);
		int c = Integer.parseInt(line.split("\\s+")[2]);

		int cnt = 0;
		if (a == b) cnt ++;
		if (a == c) cnt ++;
		if (b == c) cnt ++;

		if (cnt == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

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
