import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num = 0;
		while((num = parseNum())!= 0) {
			fact(num);
		}
	}

	private static void fact(int n) {
		int		t = 0;
		int[]	a = new int[2];

		for(int i = 2; i <= n; i++) {
			for(t = i; t % 2 == 0; t /= 2) {
				a[0]++;
			}

			for(t = i; t % 5 == 0; t /= 5) {
				a[1]++;
			}
		}

		System.out.println(Math.min(a[0], a[1]));
	}

	private static int parseNum() {
		int		num    = 0;
		String	strNum = parseStdin();

		if (strNum != null) {
			num = Integer.parseInt(strNum);
		}

		return num;
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