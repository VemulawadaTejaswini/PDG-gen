import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt();
		int []a=new int [n+1];
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		ArrayList<Integer>ans=new ArrayList();
		boolean ok=true;
		boolean[]put=new boolean[n+1];
		for(int i=n;i>0;i--) {
			if(i*2>n) {
				if(a[i]==1)
					put[i]=true;
				continue;
			}
			int cnt=0;
			for(int j=i+i;j<=n;j+=i)
				if(put[j])
					cnt++;
			cnt%=2;
			int curr=cnt^a[i];
			if(curr==1)
				put[i]=true;
			
		}
		int cnt=0;
		for(boolean b:put)
			if(b)
				cnt++;
		out.println(cnt);
		for(int i=1;i<=n;i++)
			if(put[i])
				out.println(i);
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