import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		long n = sc.nextLong();
		int x = sc.nextInt(), m = sc.nextInt();
		
		int j = x, c = 1;
		long sum = j;
		int cur = 1;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(j, cur++);
		while(true) {
			j = (int)((1l * j * j) % m);
			if(map.containsKey(j))
				break;
			map.put(j, cur++);
			c++;
			sum = 1l * sum + j;
		}
		
		int diff = map.get(j) - 1;
		c -= diff;
		long ans = 0;
		int z = x;
		while(diff-->0) {
			if(n == 0)
				break;
			n--;
			ans = 1l * ans + z;
			z = (int)((1l * z * z) % m);
		}
		
		sum -= ans;
		
		int q = (int)(1l * n / c);
		int rem = (int)(n % c);
		
		long temp = 1l * q * sum;
		ans = 1l * ans + temp;
		if(rem > 0) {
			ans = 1l * ans + j;
			for(int i = 0; i < rem - 1; i++) {
				j = (int)((1l * j * j) % m);
				ans = 1l * ans + j;
			}
		}
		
		pw.println(ans);
		pw.flush();
	}

	public static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] array = new Integer[n];
			for (int i = 0; i < n; i++)
				array[i] = new Integer(nextInt());
			return array;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		public static int[] shuffle(int[] a) {
			int n = a.length;
			Random rand = new Random();
			for (int i = 0; i < n; i++) {
				int tmpIdx = rand.nextInt(n);
				int tmp = a[i];
				a[i] = a[tmpIdx];
				a[tmpIdx] = tmp;
			}
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
