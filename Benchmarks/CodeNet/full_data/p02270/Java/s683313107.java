import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Scanner sc = new Scanner(new InputStreamReader(System.in));

	public static void main (String[] args) throws java.lang.Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] w = new int[n];
		for (int i=0; i<n; i++) {
			w[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(solve(n, k, w));
	}

	public static long solve(int n, int k, int[] w) {
		long min = 0;
		long max = 100000*10000;
		long mid;
		while (max - min > 1) {
			mid = (max + min) / 2;
			int count = containersAvailable(n, k, w, mid);
			if (count >= n) max = mid;
			else min = mid;
		}

		return max;
	}

	public static int containersAvailable(int n, int k, int[] w, long p) {
		long remainWeight = p;
		int truckNum = 0;
		int i;

		for (i=0; i<n; i++) {
			if (remainWeight < w[i]) {
				remainWeight = p;
				truckNum++;
				if (truckNum == k || remainWeight < w[i]) return i-1;
			}

			remainWeight -= w[i];
		}

		return n;
	}
}