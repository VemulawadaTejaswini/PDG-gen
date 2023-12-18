import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		long k = Integer.parseInt(first[1]);
		long[] sums = new long[n + 1];
		long[] checks = new long[n + 1];
		for (int i = 1; i <= n; i++) {
		    sums[i] = sums[i - 1] + Integer.parseInt(br.readLine());
		    checks[i] = sums[i] - k * i;
		}
		ArrayList<Long> list = new ArrayList<>();
		list.add(Long.MIN_VALUE);
		list.add(Long.MAX_VALUE);
		long total = 0;
		for (int i = n; i >= 0; i--) {
		    int left = 0;
		    int right = list.size();
		    while (right - left > 1) {
		        int m = (left + right) / 2;
		        if (list.get(m) >= checks[i]) {
		            right = m;
		        } else {
		            left = m;
		        }
		    }
		    total += list.size() - right - 1;
		    list.add(right, checks[i]);
		}
	    System.out.println(total);
    }
}

