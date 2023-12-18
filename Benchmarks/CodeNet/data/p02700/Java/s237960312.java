import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int sum1=a+b;
		int sum2=c+d;
		if((sum1==sum2)&&Math.max(a, b)>Math.max(c, d))System.out.println("Yes");
		else if((sum1==sum2)&&Math.max(a, b)<Math.max(c, d))System.out.println("No");
		else if(sum1>sum2)System.out.println("Yes");
		else System.out.println("No");
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
		public int[] nextArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}

	}
}