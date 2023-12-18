
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		int i = 0;
//		int t = in.nextInt();
//		for (; i < t; i++)
		solver.solve(i, in, out);

		out.close();

	}

	static class Task {
		static ArrayList<ArrayList<Integer>> adj;
		static ArrayList<Boolean> visited;
		static int a=0,b=0,c=0;
		static String a1,b1;
		static ArrayList<String> al;
		void printArr(int a[], int n) {
			String s="";
			for (int i = 0; i < n; i++)
				s+=new Integer(a[i]).toString();
			al.add(s);
		}

		// Generating permutation using Heap Algorithm
		void heapPermutation(int a[], int size, int n) {
			// if size becomes 1 then prints the obtained
			// permutation
			if (size == 1)
				printArr(a, n);

			for (int i = 0; i < size; i++) {
				heapPermutation(a, size - 1, n);

				// if size is odd, swap first and last
				// element
				if (size % 2 == 1) {
					int temp = a[0];
					a[0] = a[size - 1];
					a[size - 1] = temp;
				}

				// If size is even, swap ith and last
				// element
				else {
					int temp = a[i];
					a[i] = a[size - 1];
					a[size - 1] = temp;
				}
			}
		}

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int n = in.nextInt();
			String s1="",s2="";
			for (int i = 0; i < n; i++) {
				s1+=new Integer(in.nextInt()).toString();
			}
for (int i = 0; i < n; i++) {
	s2+=new Integer(in.nextInt()).toString();
			}
			
			al = new ArrayList<String>();
			int a[]=new int[n];
			for (int i = 1; i < n+1; i++) {
				a[i-1]=i;
			}
			heapPermutation(a, n, n);
			al.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
				
			});
//			System.out.println(al);
			for (int i = 0; i < al.size(); i++) {
				if(al.get(i).equals(s1))
					this.a=i+1;
				if(al.get(i).equals(s2))
					b=i+1;
			}
			if(b>this.a)
			System.out.println(b-this.a);
			else
				System.out.println(this.a-b);
		}

		static int factorial(int n) {
			if (n == 0)
				return 1;

			return n * factorial(n - 1);
		}

		public static void dfs(int v) {
			visited.set(v - 1, true);
			for (Integer i : adj.get(v - 1)) {
				if (!visited.get(i - 1))
					dfs(i - 1);
			}
		}

		static long modInverse(long a, int m) {
			long g = gcd(a, m);
			if (g != 1) {
				System.out.println("Inverse doesn't exist");
				return 0;
			} else {
				// If a and m are relatively prime, then modulo inverse
				// is a^(m-2) mode m
				return power(a, m - 2, m);
			}
		}

		// To compute x^y under modulo m
		static long power(long x, long y, long m) {
			if (y == 0)
				return 1;

			long p = power(x, y / 2, m) % m;
			p = (p * p) % m;

			if (y % 2 == 0)
				return p;
			else
				return (x * p) % m;
		}

		// Function to return gcd of a and b
		static long gcd(long a, long b) {
			if (a == 0)
				return b;
			return gcd(b % a, a);
		}

		static int highestPowerOf2(int n) {
			return (n & (~(n - 1)));
		}

	}
	// template code

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

}

class Point {
	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double d(Point p2) {

		return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
	}

	public Point mp(Point p2) {
		return new Point((p2.x + this.x) / 2, (p2.y + this.y) / 2);
	}
}

class TCS implements Comparable<TCS>, Comparator<TCS> {
	long i1, i2;
	int flag;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i1:" + i1 + "  i2:" + i2;
	}

	TCS(long i1, long i2) {
		this.i1 = i1;
		this.i2 = i2;
	}

	@Override
	public int compareTo(TCS o) {
		// TODO Auto-generated method stub
		return compare(this, o);
	}

	@Override
	public int compare(TCS o1, TCS o2) {
		// TODO Auto-generated method stub
		return (int) ((o1.i1 == o2.i1) ? o1.i2 - o2.i2 : o1.i1 - o2.i1);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}

class Pair implements Comparator<Pair>, Comparable<Pair> {
	int key, value;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "key:" + key + " value: " + value;
	}

	public Pair(int i, int j) {
		key = i;
		value = j;

	}

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return this.key - o.key;
	}

}
