import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);

	public void solve() {
		int N = in.nextInt();
		int cnt = 1;
		int before = -1;
		int trend = 0;
		for (int i = 0; i < N; i++) {
			int now = in.nextInt();
			switch (trend) {
			case -1:
				if (now > before) {
					cnt++;
					before = now;
					trend = 0;
				} else {
					before = now;
				}
				break;
			case 1:
				if (now < before) {
					cnt++;
					before = now;
					trend = 0;
				} else {
					before = now;
				}
				break;
			case 0:
				if (before == -1) {
					before = now;
				} else {
					if (before > now) {
						before = now;
						trend = -1;
					} else if (before < now) {
						before = now;
						trend = 1;
					}
				}
				break;
			}
			//out("before=%d, now=%d, trend=%d, cnt=%d\n", before, now, trend,cnt);
		}
		out("%d\n", cnt);
	}

	public void out(String format, Object... s) {
		System.out.printf(format, s);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
