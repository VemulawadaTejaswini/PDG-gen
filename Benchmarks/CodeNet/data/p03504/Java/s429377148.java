import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] array = br.readLine().split(" ");
			int N = Integer.parseInt(array[0]);
			int C = Integer.parseInt(array[1]);
			// int[] s = new int[N];
			// int[] t = new int[N];
			// int[] c = new int[N];

			TimeTableController ttc = new TimeTableController();
			TimeRange tr[] = new TimeRange[N];
			for (int i = 0; i < N; i++) {
				String[] stc = br.readLine().split(" ");
				//
				// s[i] = Integer.parseInt(stc[0]);
				// t[i] = Integer.parseInt(stc[1]);
				// c[i] = Integer.parseInt(stc[2]);
				// ttc.put(Integer.parseInt(stc[0]), Integer.parseInt(stc[1]));
				tr[i] = new TimeRange(Integer.parseInt(stc[0]), Integer.parseInt(stc[1]));
			}

			Arrays.sort(tr);

			for (int i = N - 1; i >= 0; i--) {
				ttc.put(tr[i]);
			}
			System.out.println(ttc.getCount());
		}
	}

	private static class TimeRange implements Comparable<TimeRange> {
		private int start;
		private int end;

		public TimeRange(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public int getSize() {
			return end - start;
		}

		@Override
		public int compareTo(TimeRange obj) {
			return this.getSize() - obj.getSize();
		}
	}

	private static class TimeTableController {
		private class TimeTable {
			boolean[] table = new boolean[2 * 1_00001];

			private boolean canPut(int start, int end) {
				for (int i = start * 2 - 1; i <= end * 2 - 1; i++) {
					if (table[i])
						return false;
				}
				return true;
			}

			public boolean put(int start, int end) {
				if (canPut(start, end)) {
					for (int i = start * 2 - 1; i <= end * 2 - 1; i++) {
						table[i] = true;
					}
					return true;
				} else {
					return false;
				}
			}
		}

		private List<TimeTable> list = new ArrayList<>();

		public TimeTableController() {
			this.list.add(new TimeTable());
		}

		public void put(TimeRange timeRange) {
			put(timeRange.start, timeRange.end);
		}

		public int getCount() {
			return this.list.size();
		}

		public void put(int start, int end) {
			boolean flag = true;
			for (TimeTable tt : list) {
				if (tt.put(start, end)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				TimeTable tt = new TimeTable();
				tt.put(start, end);
				list.add(tt);
			}
		}
	}
}
