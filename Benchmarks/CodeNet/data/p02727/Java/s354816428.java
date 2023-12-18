import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int redEat=fs.nextInt(), greenEat=fs.nextInt();
		int redHave=fs.nextInt();
		int greenHave=fs.nextInt();
		int blankHave=fs.nextInt();
		int[] red=fs.readArray(redHave), green=fs.readArray(greenHave), blank=fs.readArray(blankHave);
		Arrays.sort(red); Arrays.sort(green); Arrays.sort(blank);
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		long ans=0;
		for (int i=0; i<redEat; i++) {
			ans+=red[redHave-1-i];
			pq.add(red[redHave-1-i]);
		}
		for (int i=0; i<greenEat; i++) {
			ans+=green[greenHave-1-i];
			pq.add(green[greenHave-1-i]);
		}
		for (int i:blank) {
			if (i>pq.peek()) {
				ans-=pq.remove();
				ans+=i;
				pq.add(i);
			}
		}
		System.out.println(ans);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");

		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) {
				a[i]=nextInt();
			}
			return a;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

	}

}

