import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	private	static	BufferedReader	br = null;
	private	static	int[]			dc = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		long[][]	dates  = null;
		while ((dates = parseDates()) != null) {
			System.out.println(countDay(dates[1]) - countDay(dates[0]));
		}
	}

	private static long countDay(long[] date) {
		long	day = 365 * date[0] + date[2];
		boolean	uru = date[0] % 400 == 0 || date[0] % 4 == 0 && date[0] % 100 != 0;

		day += ((date[0]-1) / 4 - (date[0]-1) / 100 + (date[0]-1) / 400);

		for (int i = 0; i < date[1]-1; i++) {
			day += dc[i];
			day += (i == 1 && uru) ? 1 : 0;
		}

		return day;
	}

	private static long[][] parseDates() {
		long[][]	dates = null;
		String		stdin = parseStdin();

		if (stdin != null) {
			if (!stdin.contains("-")) {
				String[]	lines = stdin.split(" ");

				dates       = new long[2][3];
				dates[0][0] = Long.parseLong(lines[0]);
				dates[0][1] = Long.parseLong(lines[1]);
				dates[0][2] = Long.parseLong(lines[2]);
				dates[1][0] = Long.parseLong(lines[3]);
				dates[1][1] = Long.parseLong(lines[4]);
				dates[1][2] = Long.parseLong(lines[5]);
			}
		}

		return dates;
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}