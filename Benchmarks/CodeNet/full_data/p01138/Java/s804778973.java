import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;

			ArrayList<Schedule> sche = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				String str[] = br.readLine().split(" ");
				String d[] = str[0].split(":");
				String a[] = str[1].split(":");
				sche.add(new Schedule(Integer.parseInt(d[0]), Integer.parseInt(d[1]), Integer.parseInt(d[2]),
						Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2])));
			}
			Collections.sort(sche);

			int max = 0;

			for (int i = 0; i < n; i++) {
				int last = sche.get(i).e;
				int count = 1;
				for (int j = i + 1; j < n; j++) {
					if (last <= sche.get(j).e && last > sche.get(j).s) {
						count++;
					}
					max = Math.max(max, count);
				}
			}
			System.out.println(max);
		}
	}
}

class Schedule implements Comparable<Schedule> {
	int s;
	int e;

	public Schedule(int sh, int sm, int ss, int eh, int em, int es) {
		this.s = sh * 3600 + sm * 60 + ss;
		this.e = eh * 3600 + em * 60 + es;
	}

	@Override
	public int compareTo(Schedule s) {
		if (this.e != s.e)
			return this.e - s.e;
		return this.s - s.s;
	}
}
