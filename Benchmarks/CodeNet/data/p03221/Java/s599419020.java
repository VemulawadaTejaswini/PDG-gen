
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();

		Map<Integer, List<Long>> dic = new HashMap<>();
		List<Pair> toi = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			long y = sc.nextLong();
			toi.add(new Pair(x, y));
			List<Long> list = dic.getOrDefault(x, new ArrayList<>());
			list.add(y);
			dic.put(x, list);
		}

		Map<Integer, Long[]> sortDic = new HashMap<>();
		dic.entrySet().stream().forEach(e -> {
			Long[] tmp = e.getValue().toArray(new Long[e.getValue().size()]);
			Arrays.sort(tmp);
			sortDic.put(e.getKey(), tmp);
		});

		for (int i = 0; i < toi.size(); i++) {
			Pair mon = toi.get(i);
			String x = String.valueOf(mon.x);
			String paddingleft = x.format("%6s", x).replace(" ", "0");
			String index = String.valueOf(Arrays.binarySearch(sortDic.get(mon.x), mon.y) + 1);
			String paddingRight = index.format("%6s", index).replace(" ", "0");
			System.out.println(paddingleft + paddingRight);
		}

	}

	static class Pair {
		public int x;
		public long y;

		public Pair(int x, long y) {
			this.x = x;
			this.y = y;
		}
	}

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
}
