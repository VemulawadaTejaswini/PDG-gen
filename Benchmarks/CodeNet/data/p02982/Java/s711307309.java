import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt(),d=sc.nextInt();
		int [][]a=new int [n][d];
		for(int i=0;i<n;i++)
			for(int j=0;j<d;j++)
				a[i][j]=sc.nextInt();
		int ans=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<i;j++) {
				int diff=0;
				for(int k=0;k<d;k++) {
					int dx=a[i][k]-a[j][k];
					diff+=dx*dx;
				}
				int tmp=(int) Math.sqrt(diff);
				if(tmp*tmp==diff)
					ans++;
			}
		out.println(ans);
		out.close();

	}
	
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}