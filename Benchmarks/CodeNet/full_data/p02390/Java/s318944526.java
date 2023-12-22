import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			System.out.println(calcTime(line));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String calcTime(String line) {
		int seconds = Integer.parseInt(line);
		int h = 0;
		int m = 0;
		int s = 0;

		s = seconds % 60;
		m = seconds / 60;
		h = m / 60;
		m = m % 60;

		return String.valueOf(h) + ':' + m + ':' + s;
	}
}
