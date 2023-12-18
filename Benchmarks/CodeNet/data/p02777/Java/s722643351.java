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

		// int N = Integer.parseInt(line.split("\\s+")[0]);
		// int M = Integer.parseInt(line.split("\\s+")[1]);
		String str_a = line.split("\\s+")[0];
		String str_b = line.split("\\s+")[1];

		line = scanner.nextLine();
		int a = Integer.parseInt(line.split("\\s+")[0]);
		int b = Integer.parseInt(line.split("\\s+")[1]);

		line = scanner.nextLine();
		String throw_str = line;

		if (throw_str.equals(str_a)) {
			a --;
		} else {
			b --;
		}

		System.out.println(a + " " + b);
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
