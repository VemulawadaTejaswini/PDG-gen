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
		int[] arr = strToIntArray(scanner.nextLine());

		double aver = getAver(arr);
		int meet_pos = (int)aver;

		int res = 0;
		for (int i=0; i<arr.length; i++) {
			int t = Math.abs(meet_pos - arr[i]);
			res += t * t;
		}
		System.out.println(res);
		
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
