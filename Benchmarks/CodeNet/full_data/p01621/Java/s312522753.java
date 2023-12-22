
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "All"};
	String[] ecTime = {"Day", "Night", "All"};
	int[] ecTimeSpan = {0, 6*60, 18*60, 24*60};
	int WEEK = 7 * 24 * 60;
	int DAY = 24 * 60;
	int MIN = 60;
	boolean[] is;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int s = sc.nextInt(), n = sc.nextInt(), t = sc.nextInt();
			String wd = sc.next(), time = sc.next();
			int p = sc.nextInt(), m = sc.nextInt();
			if( s == 0 && n == 0) break;

			int ecD = 0;
			for(;ecD<7;ecD++) if(week[ecD].equals(wd))break;
			int ecT = 0;
			for(;ecT<3;ecT++) if(ecTime[ecT].equals(time)) break;

			boolean[] all = new boolean[2 * WEEK];
			for(int i=0;i<2*WEEK;i++) {
				int min = i%DAY, day = i/DAY;
				if(ecD == day || ecD == 7) {
					if(ecT == 0 && ecTimeSpan[1] <= min && min < ecTimeSpan[2]) all[i] = true;
					if(ecT == 1 && ( ( ecTimeSpan[0] <= min && min < ecTimeSpan[1]) ||
									 ( ecTimeSpan[2] <= min && min < ecTimeSpan[3]))) all[i] = true;
					if(ecT == 2 ) all[i] = true;
				}
			}
			int max = 0;
			for(int day = 0;day<7;day++) for(int min=0;min<60*24;min++) {
				int cnt = 0;
				for(int st = 0;st<m;st++) {
					int start = (day * DAY + min + st * t) % WEEK;
					int end = start + s;
					if(all[start] && all[end]) cnt++;
				}
				max = max(max, cnt);
			}

			double prob = 1.0 - 1.0 / p;
			double ret = 1.0;
			for(int i=0;i<max * n;i++) ret *= prob;
			System.out.printf("%.10f\n",1-ret);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}