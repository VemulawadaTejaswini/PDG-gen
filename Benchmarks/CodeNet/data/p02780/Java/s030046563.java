
import java.io.*;
import java.util.*;

public class Main {
	
	public static double expectedValue(double pI) {
		double summa = pI;
		for(int i = 1; i < pI; i++) {
			summa+=i;
		}
		double expectedvalue = summa/pI;
		return expectedvalue;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		//Inputs and arranging the set
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] dice = new double[n];
		for(int i = 0; i<n; i++) {
			dice[i] = sc.nextInt();
		}
		Arrays.sort(dice);

		//choosing the k dice
		double[] chosenDice = new double[k];
		int d = 0;
		for(int i = n-1; i > n-1-k; i--) {
			chosenDice[d] = dice[i];
			d++;
		}
		pw.println(Arrays.toString(chosenDice));
		
		//finding the expected value sums
		int sum = 0;
		for(int i = 0; i < chosenDice.length; i++) {
			sum += expectedValue(chosenDice[i]);
		}
		pw.println(sum);
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}
