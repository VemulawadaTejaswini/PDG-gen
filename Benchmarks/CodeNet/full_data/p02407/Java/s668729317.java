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
			// int e = Integer.valueOf(se[0]);
			doMain(inCnt, se);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, String[] se) {
		System.out.print(se[se.length - 1]);
		for (int i = se.length - 2; i >= 0; i--) {
			System.out.print(" " + se[i]);
		}
		System.out.println("");

	}
}