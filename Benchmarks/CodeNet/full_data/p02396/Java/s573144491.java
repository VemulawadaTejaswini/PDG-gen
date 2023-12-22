import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int inCnt = 0;
		while ((s = stdIn.readLine()) != null) {
			int in = Integer.valueOf(s);
			if (in == 0)
				break;
			doMain(++inCnt, in);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, int in) {
		System.out.println("Case " + inCnt + ": " + in);

	}
}