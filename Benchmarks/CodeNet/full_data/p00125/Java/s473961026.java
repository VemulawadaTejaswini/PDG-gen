import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	static final int[] month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			int y1 = parseInt(st.nextToken()) - 1;
			int m1 = parseInt(st.nextToken()) - 1;
			int d1 = parseInt(st.nextToken());
			int y2 = parseInt(st.nextToken()) - 1;
			int m2 = parseInt(st.nextToken()) - 1;
			int d2 = parseInt(st.nextToken());
			if ((y1 + 1 | m1 + 1 | d1 | y2 + 1 | m2 + 1 | d2) < 0) {
				break;
			}

			int days1, days2;
			//
			days1 = y1 * 365 + (y1 / 4 - y1 / 100 + y1 / 400);
			days1 += month[m1] + d1;
			if (isLeap(y1 + 1) && m1 + 1 > 2) {
				days1++;
			}
			//
			days2 = y2 * 365 + (y2 / 4 - y2 / 100 + y2 / 400);
			days2 += month[m2] + d2;
			if (isLeap(y2 + 1) && m2 + 1 > 2) {
				days2++;
			}
			System.out.println(days2 - days1);
		}
	}

	static boolean isLeap(int year) {
		return year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? true : false) : true) : false;
	}
}