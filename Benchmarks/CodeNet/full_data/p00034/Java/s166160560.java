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
		int[]	data = null;

		while ((data = parseData()) != null) {
			calc(data);
		}
	}

	private static void calc(int[] data) {
		int		n  = 0;
		double	dt = (double)data[9] / (double)(data[10] + data[11]);
		double	dl = (double)data[10] * dt;

		for (; n < 10; n++) {
			if (dl == (double)data[n] || dl < (double)data[n]) {
				break;
			}
		}

		System.out.println(n+1);
	}

	private static int[] parseData() {
		int[]	data  = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	aN = strIn.split(",");
			data = new int[12];
			for (int n = 0; n < data.length; n++) {
				data[n] = Integer.parseInt(aN[n]);
				if (1 <= n && n <= 9) {
					data[n] += data[n-1];
				}
			}
		}
		
		return data;
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