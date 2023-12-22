import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int inCnt = 0;
		while ((s = stdIn.readLine()) != null) {
			inCnt++;
			if (inCnt % 2 == 1)
				continue;
			String[] se = s.split(" ");
			doMain(inCnt, se);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, String[] se) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		long total = 0;
		for (int i = 0; i < se.length; i++) {
			int e = Integer.valueOf(se[i]);
			if (max < e)
				max = e;
			if (min > e)
				min = e;
			total += e;
		}
		System.out.printf("%d %d %d\n", min, max, total);

	}
}