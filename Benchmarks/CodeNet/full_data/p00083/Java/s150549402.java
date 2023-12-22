import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static			BufferedReader	br  = null;
	private	static	final	String[]		ERA = { "pre-meiji", "meiji", "taisho", "showa", "heisei" };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int[]	date = null;

		while ((date = parseDate()) != null) {
			int	nDate = date[1] * 10000 + date[2] * 100 + date[3];

			if (isMeiji(nDate)) {
				date[0] = 1;
				date[1] = date[1] - 1868 + 1;
			}
			else if (isTaisho(nDate)) {
				date[0] = 2;
				date[1] = date[1] - 1912 + 1;
			}
			else if (isShowa(nDate)) {
				date[0] = 3;
				date[1] = date[1] - 1926 + 1;
			}
			else if (isHeisei(nDate)) {
				date[0] = 4;
				date[1] = date[1] - 1989 + 1;
			}

			switch (date[0]) {
			case 0:
				System.out.printf("%s\n", ERA[date[0]]);
				break;
			default:
				System.out.printf("%s %d %d %d\n", ERA[date[0]], date[1], date[2], date[3]);
				break;
			}
		}
	}

	private static boolean isMeiji(int nDate) {
		return (18680908 <= nDate && nDate <= 19120729);
	}
 
	private static boolean isTaisho(int nDate) {
		return (19120730 <= nDate && nDate <= 19261224);
	}
 
	private static boolean isShowa(int nDate) {
		return (19261225 <= nDate && nDate <= 19890107);
	}
 
	private static boolean isHeisei(int nDate) {
		return (19890108 <= nDate);
	}
 
	private static  int[] parseDate() {
		int[]		date = null;
		String[]	split = null;
		String		strIn = null;
 
		if ((strIn = parseStdin()) != null) {
			split = strIn.split(" ");
			date = new int[split.length + 1];
			for (int n = 0; n < split.length; n++) {
				date[n + 1] = Integer.parseInt(split[n]);
			}
		}
		 
		return date;
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