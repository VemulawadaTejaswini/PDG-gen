import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br  = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		cnt  = parseCnt();
		int[]	ball = null;

		for (int n = 0; n < cnt; n++) {
			if ((ball = parseBall()) != null) {
				if (push(ball) == 0) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
	}

	private static int push(int[] ball) {
		int	nStatus = 0;
		int	a       = 0;
		int	b       = 0;

		for (int n = 0; n < ball.length && nStatus == 0; n++) {
			if (a < ball[n]) {
				a = ball[n];
			}
			else if (b < ball[n]) {
				b = ball[n];
			}
			else {
				nStatus = -1;
			}
		}
		
		return nStatus;
	}

	private static int parseCnt() {
		int		cnt   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			cnt = Integer.parseInt(strIn);
		}
		
		return cnt;
	}

	private static int[] parseBall() {
		int[]	ball  = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	aN = strIn.split(" ");
			ball = new int[10];
			for (int n = 0; n < 10; n++) {
				ball[n] = Integer.parseInt(aN[n]);
			}
		}
		
		return ball;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}