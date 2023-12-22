import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int h = f.nextInt(), w = f.nextInt(), m = f.nextInt();
		int[] row = new int[h], col = new int[w];
		ArrayList<int[]> list = new ArrayList<>();
		while(m-- > 0) {
			int i = f.nextInt() - 1, j = f.nextInt() - 1;
			row[i]++;
			col[j]++;
			list.add(new int[] {i, j});
		}

		int maxI = 0, maxJ = 0;
		HashSet<Integer> setCol = new HashSet<>(), setRow = new HashSet<>();
		for(int i=0;i<h;i++) {
			maxI = Math.max(maxI, row[i]);
		}
		for(int j=0;j<w;j++) {
			maxJ = Math.max(maxJ, col[j]);
		}

		for(int i=0;i<h;i++) {
			if(row[i] == maxI) {
				setRow.add(i);
			}
		}
		for(int j=0;j<w;j++) {
			if(col[j] == maxJ) {
				setCol.add(j);
			}
		}

		int cnt = 0;
		for(int[] i : list) {
			boolean first = setRow.contains(i[0]), second = setCol.contains(i[1]);
			if(first && second) {
				cnt++;
			}
		}

		out.println(maxI+maxJ+(cnt != ((long)setCol.size())*setRow.size()?0:-1));
		out.close();
	}


	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";

			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}