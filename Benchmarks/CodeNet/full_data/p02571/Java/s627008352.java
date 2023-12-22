import java.util.*;
import java.awt.Frame;
import java.io.*;

public class Main {
	// static ArrayList<Integer>[] g;

	static pair[] a;
	static int[][] memo;

	static int dp(int l, int r) {
		if (l > r)
			return 0;
		if (memo[l][r] != -1)
			return memo[l][r];
		int ans = dp(l + 1, r);
		ans = Math.max(ans, dp(l, r - 1));
		for (int idx : startAt[l]) {
			if (a[idx].y >= r)
				continue;
			int inc = exist[a[idx].y + 1][r] ? 1 : 0;
			ans = Math.max(ans, 1 + dp(a[idx].x, a[idx].y) + inc + dp(a[idx].y + 1, r));
		}
		for (int idx : endAt[r]) {
			if (a[idx].x <= l)
				continue;
			int inc = exist[l][a[idx].x - 1] ? 1 : 0;
			ans = Math.max(ans, 1 + dp(a[idx].x, a[idx].y) + inc + dp(a[idx].y + 1, r));
		}

		return memo[l][r] = ans;
	}

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		char[] s=br.readLine().toCharArray();
		char[] t=br.readLine().toCharArray();
		int min=Integer.MAX_VALUE;
		for (int i = 0; i+t.length <= s.length; i++) {
			int c=0;
			for (int j = 0; j <t.length ; j++) {
				if(t[j]!=s[i+j])
					c++;
			}
			min=Math.min(min, c);
		}
		pw.println(min);
		pw.flush();
		pw.close();

	}

	static ArrayList<Integer> primes;
	static int[] isComposite;

	static void sieve(int N) // O(N log log N)
	{
		isComposite = new int[N + 1];
		isComposite[0] = isComposite[1] = 1; // 0 indicates a prime number
		primes = new ArrayList<Integer>();

		for (int i = 2; i <= N; ++i) // can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))
			if (isComposite[i] == 0) // can loop in 2 and odd integers for slightly better performance
			{
				primes.add(i);
				if (1l * i * i <= N)
					for (int j = i * i; j <= N; j += i) // j = i * 2 will not affect performance too much, may alter in
														// modified sieve
						isComposite[j] = 1;
			}
	}

	static long pow(long a, long e, int mod) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				res *= a;
				res %= mod;
			}
			a *= a;
			a %= mod;
			e >>= 1;
		}
		return res;
	}

	static int maxSize;
	static boolean[][] exist;
	static ArrayList<Integer>[] startAt, endAt;

	static void compress(pair[] arr) {
		TreeSet<Integer> tr = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			tr.add(arr[i].x);
			tr.add(arr[i].y);
		}
		tr.add(0);
		tr.add((int) 1e9);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int x : tr)
			hm.put(x, hm.size());
		for (int i = 0; i < arr.length; i++) {
			arr[i].x = hm.get(arr[i].x);
			arr[i].y = hm.get(arr[i].y);
		}
		maxSize = hm.size();
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			int x1 = y - x;
			int x2 = o.y - o.x;
			return x1 - x2;
		}

	}

}