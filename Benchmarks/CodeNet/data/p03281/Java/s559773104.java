

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n=sc.nextInt();
		boolean[] aa = new boolean[201];
		for(int i=0;i<201;i++){
			aa[i]=printDivisors(i);
//			System.out.println(aa[i]+" "+i);
			}
		int cnt=0;
		for(int i=1;i<=n;i+=2)if(aa[i])cnt++;
		System.out.println(cnt);
	}
	static boolean printDivisors(int n)
    {
		int cnt=0;
        for (int i=1;i<=n;i++)
            if (n%i==0)
                cnt++;
        return cnt==8;
    }

}
