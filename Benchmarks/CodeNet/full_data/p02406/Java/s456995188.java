import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int inCnt = 0;
		while ((s = stdIn.readLine()) != null) {
			inCnt++;
			String[] se = s.split(" ");
			int e = Integer.valueOf(se[0]);
			doMain(inCnt, e);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, int e) {
		for (int i = 1; i <= e; i++) {
			if (i % 3 == 0)
				System.out.print(" " + i);
			else
				for (int j = i; j != 0; j /= 10)
					if (j % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
		}
		System.out.println("");

	}
}