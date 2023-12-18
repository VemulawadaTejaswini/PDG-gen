
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

 class Main {

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
		int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
		ArrayList<Integer> aa = new ArrayList<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt <k) {
				aa.add(i);
				cnt++;
			} else
				break;
		}
		cnt = 0;
		for (int i = b; i >= a; --i) {
			if (cnt <k) {
				aa.add(i);
				cnt++;
			} else
				break;
		}
		Collections.sort(aa);
		int pre=aa.get(0);
		System.out.println(pre);
		for(int i=1;i<aa.size();i++) {
			if(pre !=aa.get(i))
				System.out.println(aa.get(i));
			pre=aa.get(i);
			}
	}

}
