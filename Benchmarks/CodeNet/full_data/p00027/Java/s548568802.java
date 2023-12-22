import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br    = null;
	private	static	int[]			month = { 4, 0, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3 };
	private	static	String[]		youbi = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	static {
		br  = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	aDate = null;

		while((aDate = parseDate()) != null) {
			if (aDate[0] == 0 && aDate[1] == 0) {
				break;
			}

			System.out.println(youbi[(month[aDate[0]-1] + aDate[1] - 1) % 7]);
		}
	}

	private static int[] parseDate() {
		int[]	aDate = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	aN = strIn.split(" ");
			aDate    = new int[2];
			aDate[0] = Integer.parseInt(aN[0]);
			aDate[1] = Integer.parseInt(aN[1]);
		}
		
		return aDate;
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