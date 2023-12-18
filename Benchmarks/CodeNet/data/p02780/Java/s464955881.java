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
		// scanner.nextLine();
		String line = scanner.nextLine();

		int K = Integer.parseInt(line.split("\\s+")[1]);

		line = scanner.nextLine();

		int[] dices = strToIntArray(line);

		int[] max_k_arr = findmaxK(dices, K);

		double res = 0.0;
		for (int u: max_k_arr) {
			res += getEV(u);
		}

		System.out.println(res);
		return;
	}

	private double getEV(int n) {
		double res = (1.0 / n) * ( ( (1+n)*n ) / 2.0);
		return res;
	}

	private int[] findmaxK(int[] arr, int k) {
		int sz = arr.length;
		int l = 0, r = k-1;
		int cur_sum = 0;
		for (int i=l; i<=r; i++) cur_sum += arr[i];

		int res_r = 0;
		int res_l = 0;
		int cur_max = 0;
		for (;r < sz ;) {
			if (cur_sum > cur_max) {
				res_l = l;
				res_r = r;
				cur_max = cur_sum;
			}
			cur_sum -= arr[l++];
			r ++;
			if (r < sz) cur_sum += arr[r];
		}

		int[] res = new int[k];
		int idx = 0;
		for (int i=res_l; i<=res_r; i++) {
			res[idx++] = arr[i];
		}
		return res;
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

// 1/n * (1+..+n)
// 1/n * ((1+n)*n/2)
