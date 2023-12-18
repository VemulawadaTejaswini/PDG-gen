import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.Math;


public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		Main instance = new Main();
		sc = instance.new Scanner();
		instance.solve();
	}

	private void solve() {
		try {
			int a11 = sc.nextInt();
			int a12 = sc.nextInt();
			int a13 = sc.nextInt();
			int a21 = sc.nextInt();
			int a22 = sc.nextInt();
			int a23 = sc.nextInt();
			int a31 = sc.nextInt();
			int a32 = sc.nextInt();
			int a33 = sc.nextInt();
			
			int[] a1 = new int[] { a11, a12, a13 };
			int[] a2 = new int[] { a21, a22, a23 };
			int[] a3 = new int[] { a31, a32, a33 };
			int[] a4 = new int[] { a11, a22, a33 };
			int[] a5 = new int[] { a13, a22, a31 };
			int[] a6 = new int[] { a11, a21, a31 };
			int[] a7 = new int[] { a12, a22, a32 };
			int[] a8 = new int[] { a13, a23, a33 };

			int n = sc.nextInt();
			boolean ret = false;
			for (int i = 0; i < n ; i++ ) {
				int z = sc.nextInt();
				if(ret) continue;
				
				
				int aa1 = 0;
				int aa2 = 0;
				int aa3 = 0;
				int aa4 = 0;
				int aa5 = 0;
				int aa6 = 0;
				int aa7 = 0;
				int aa8 = 0;
				for ( int j = 0; j < 3; j++ ) {
					if( a1[j] == z ) {
						a1[j] = 0;
					}
					if( a2[j] == z ) {
						a2[j] = 0;
					}
					if( a3[j] == z ) {
						a3[j] = 0;
					}
					if( a4[j] == z ) {
						a4[j] = 0;
					}
					if( a5[j] == z ) {
						a5[j] = 0;
					}
					if( a6[j] == z ) {
						a6[j] = 0;
					}
					if( a7[j] == z ) {
						a7[j] = 0;
					}
					if( a8[j] == z ) {
						a8[j] = 0;
					}
					aa1 += a1[j];
					aa2 += a2[j];
					aa3 += a3[j];
					aa4 += a4[j];
					aa5 += a5[j];
					aa6 += a6[j];
					aa7 += a7[j];
					aa8 += a8[j];
				}
				if( aa1 == 0 || aa2 == 0 || aa3 == 0 || aa4 == 0 || aa5 == 0 || aa6 == 0 || aa7 == 0 || aa8 == 0) {
					ret = true;
				}
			}
			
			
			System.out.println(ret ? "Yes" : "No");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private class Scanner {
		String[] s;
		int i;
		BufferedReader br;
		String regex = " ";

		public Scanner() {
			s = new String[0];
			i = 0;
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				destruction();
			}
		}

		private void destruction() throws IOException {
			if (br != null)
				br.close();
		}

		public String next() throws IOException {
			if (i < s.length)
				return s[i++];
			String st = br.readLine();
			while (st == "")
				st = br.readLine();
			s = st.split(regex, 0);
			i = 0;
			return s[i++];
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public Long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public Double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
