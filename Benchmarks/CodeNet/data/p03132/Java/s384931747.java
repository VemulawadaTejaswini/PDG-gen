import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int [] a = new int[n];
		for (int i = 0; i < a.length; ++i) {
			a[i] = sc.nextInt();
		}
		long ans = (long)1e18;
		long tot = 0L;
		for (int i = 0; i < a.length; ++i) {
			if(a[i] == 0)
				continue;
			int j = i;
			long cur = 0L;
			int totOdd = 0;
			while(j < a.length && a[j] != 0){
				tot += a[j];
				cur += a[j];
				if((a[j] & 1) != 0)
					++totOdd;
				++j;
			}
			int odd = 0;
			int minV = (int)1e9;
			for (; i < j; ++i) {
				int tmp = 2*odd - i;
				if(tmp < minV){
					minV = tmp;
				}
				if((a[i] & 1) != 0)
					++odd;
				ans = Math.min(ans, -cur + totOdd + i + 1 - 2*odd + minV);
			}
			--i;
		}
		out.println(tot + ans);
		out.close();
	}
	
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
	}

}
