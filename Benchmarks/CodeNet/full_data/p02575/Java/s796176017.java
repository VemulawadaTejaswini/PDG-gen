import java.util.*;
import java.awt.Frame;
import java.io.*;

public class Main {
	// static ArrayList<Integer>[] g;

	static pair[] a;
	static int[][] memo;

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		pair[] p = new pair[h];
		for (int i = 0; i < p.length; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			p[i] = new pair(x, y);
		}
		int sum = 0;
		int col = 0;
		if (p[0].x == 0)
			col = p[0].y + 1;
		for (int i = 0; i < h; i++) {
			if (col == w)
				pw.println(-1);
			else {
				while (col < w && col >= p[i].x && col <= p[i].y) {
					col++;
					sum++;
				}
				if (col == w)
					pw.println(-1);
				else {
					sum++;
					pw.println(sum);
				}
			}
		}
		

		pw.flush();
		pw.close();

	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
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

	static HashSet<Integer> primeFactors(int N) // O(sqrt(N) / ln sqrt(N))
	{
		HashSet<Integer> factors = new HashSet(); // take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);

		while (p * p <= N) {
			while (N % p == 0) {
				factors.add(p);
				N /= p;
			}
			p = primes.get(++idx);
		}

		if (N != 1) // last prime factor may be > sqrt(N)
			factors.add(N); // for integers whose largest prime factor has a power of 1
		return factors;
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