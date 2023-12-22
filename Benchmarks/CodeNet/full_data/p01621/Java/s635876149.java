import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int s;
	int n;
	int t;
	String weekday;
	String time;
	Map<String, Integer> wmap = new HashMap<String, Integer>();

	int p;
	int m;
	final int WEEK = 60 * 24 * 7;
	final int DAY = 60 * 24;

	void run() {

		wmap.put("Sun", 0);
		wmap.put("Mon", 1);
		wmap.put("Tue", 2);
		wmap.put("Wed", 3);
		wmap.put("Thu", 4);
		wmap.put("Fri", 5);
		wmap.put("Sat", 6);
		wmap.put("All", 7);
		// 0 < s <= 500
		// 0 < n <= 100
		// s < t <= 1000
		// weekday ∈ {All, Sun, Mon, Tue, Wed, Thu, Fri, Sat}
		// All は、全ての曜日を意味する
		// time ∈ {All, Day, Night}
		// All は [0:00~24:00), Day は [6:00~18:00), Night は [18:00~6:00)
		// の時間帯を意味する。
		// 1 <= p <= 99999
		// 1 <= m <= 100

		// s n t weekday time p m
		while (true) {
			s = sc.nextInt();
			n = sc.nextInt();
			t = sc.nextInt();
			weekday = sc.next();
			time = sc.next();
			p = sc.nextInt();
			m = sc.nextInt();
			if (s == 0)
				break;
			int max = 0;
			for (int sw = 0; sw < 7; sw++) {
				for (int st = 0; st < DAY; st++) {
					int w = sw;
					int ctime = st;
					int cnt = 0;
					for (int k = 0; k < m; k++) {
						// System.out.println(ctime + " " + w + " " + k);
						if (check(ctime, w)) {
							cnt++;
						}
						ctime += t;
						w += ctime / DAY;
						w %= 7;
						ctime %= DAY;
					}
					max = Math.max(max, cnt);
				}
			}
			double ans = 1.0 - Math.pow(1.0 - 1.0 / p, 1.0 * n * max);
			System.out.printf("%.10f\n", ans);
		}
	}

	boolean check(int ctime, int week) {
		// 開始時の曜日
		boolean AllWeek = weekday.equals("All");
		if (wmap.get(weekday) != week && !AllWeek)
			return false;

		// 孵化時の曜日
		week += (ctime + s) / DAY;
		week %= 7;
		if (wmap.get(weekday) != week && !AllWeek)
			return false;

		int start = 0;
		int end = 0;
		if (time.equals("All")) {
			if (AllWeek)
				return true;
			start = 0;
			end = 24 * 60;
		}
		// Dayのときは[6:00~18:00)
		if (time.equals("Day")) {
			start = 6 * 60;
			end = 18 * 60;
		}
		// Nightのときは[18:00~6:00)
		if (time.equals("Night")) {
			start = 18 * 60;
			end = 30 * 60;
			if (start <= ctime && ctime + s < end || ctime >= 0
					&& ctime + s < 60 * 6)
				return true;
			else return false;
		}
		if (start <= ctime && ctime + s < end)
			return true;
		return false;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}