import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
		if (Math.min(n, m) == 1) {
			System.out.println(q);
			return;
		}
		ArrayList<Integer>[]adj=new ArrayList[n];
		Integer[] row = new Integer[n], col = new Integer[m], indices = new Integer[m];
		for (int i = 0; i < m; i++) {
			indices[i] = i;
			col[i]=0;
		}
		for(int i=0;i<n;i++) {
			row[i]=0;
			adj[i]=new ArrayList();
		}
//		HashSet<Long>set=new HashSet();
		while (q-- > 0) {
			int i=sc.nextInt()-1,j=sc.nextInt()-1;
			row[i]++;
			col[j]++;
//			set.add(i*1L*m+j);
			adj[i].add(j);
		}
		
		Arrays.sort(indices, Comparator.comparingInt(i -> -col[i]));
		int options=0;
		int bestCol=col[indices[0]];
		for(int i=0;i<m;i++)
			if(col[indices[i]]==bestCol)
				options++;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int val=row[i]+bestCol;
			int cnt=0;
			for(int j:adj[i])
				if(col[j]==bestCol)
					cnt++;
			if(cnt==options)
				val--;
			ans=Math.max(ans, val);
		}
		System.out.println(ans);
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

		int[] nxtArr(int n) throws IOException {
			int[] ans = new int[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextInt();
			return ans;
		}

	}

	static void sort(int[] a) {
		shuffle(a);
		Arrays.sort(a);
	}

	static void shuffle(int[] a) {
		int n = a.length;
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			int tmpIdx = rand.nextInt(n);
			int tmp = a[i];
			a[i] = a[tmpIdx];
			a[tmpIdx] = tmp;
		}
	}

}