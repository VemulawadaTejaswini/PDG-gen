import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	private static boolean check(long[] a, double val, double k) {
		for (int i = 0; i < a.length; i++) {
			k -= (int)Math.ceil(a[i] / val) - 1;
		}
		return k >= 0;
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);
		input = reader.readLine().split(" ");
		long[] a = new long[n];
		double start = 0.1, end = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(input[i]);
			end = Math.max(end, a[i]);
		}
		double ans = end;
		while (Math.round(start) != Math.round(end) && start <= end) {
			double mid = (start + end) / 2;
			if (check(a, mid, k)) {
				ans = mid;
				end = mid - 0.00000001;
			} else {
				start = mid + 0.00000001;
			}
		}
		out.print(Math.round(ans));
		out.flush();
		out.close();
    }

}
