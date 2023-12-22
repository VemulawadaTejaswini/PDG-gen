import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);

			if (n == 0 && m == 0)
				break;

			ArrayList<ArrayList<Schedule>> list = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				list.add(new ArrayList<Schedule>());
			}

			String s = br.readLine();
			int r = Integer.parseInt(s);
			int last[] = new int[n];

			for (int i = 0; i < r; i++) {
				str = br.readLine().split(" ");
				int T = Integer.parseInt(str[0]);
				int N = Integer.parseInt(str[1]) - 1;
				int M = Integer.parseInt(str[2]) - 1;
				int S = Integer.parseInt(str[3]);
				if (S == 1)
					last[N] = T;
				else
					list.get(M).add(new Schedule(last[N], T));
			}
			for (int i = 0; i < m; i++) {
				Collections.sort(list.get(i));
			}

			s = br.readLine();
			int q = Integer.parseInt(s);

			for (int i = 0; i < q; i++) {
				str = br.readLine().split(" ");
				int start = Integer.parseInt(str[0]);
				int end = Integer.parseInt(str[1]);
				int user = Integer.parseInt(str[2]) - 1;

				int ans = 0, la = start;
				for (Schedule sche : list.get(user)) {
					la = Math.max(la, sche.start);
					ans += Math.max(Math.min(sche.end, end) - la, 0);
					la = Math.max(la, sche.end);
				}
				System.out.println(ans);
			}
		}
	}
}

class Schedule implements Comparable<Schedule> {

	int start, end;

	public Schedule(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Schedule s) {
			return this.start - s.start;
	}
}
