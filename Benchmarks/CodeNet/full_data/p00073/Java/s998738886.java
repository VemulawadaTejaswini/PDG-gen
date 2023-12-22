import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		w = 0;
		int		h = 0;
		double	s = 0.0;

		while (true) {
			w = parseNum();
			h = parseNum();
			if (w == 0 && h == 0) {
				break;
			}
			s = (double)(w * w) + 2 * (double)w * Math.sqrt((double)w * w / 4.0 + (double)h * h);
			System.out.printf("%.6f\n", s);
		}
	}

	private static int parseNum() {
		int		num   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			num = Integer.parseInt(strIn); 
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