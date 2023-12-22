import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			long a, b, gcm;
			a = Long.parseLong(line.substring(0, line.indexOf(" ")));
			b = Long.parseLong(line.substring(line.indexOf(" ") + 1));
			gcm = getGCD(a, b);
			System.out.println(gcm + " " + getLCM(a, b, gcm));
		}
	}

	public static long getGCD(long a, long b) {

		long mod;
		long gt = a >= b ? a : b;
		long lt = a <= b ? a : b;

		do {
			mod = gt % lt;
			gt = lt;
			lt = mod;
		} while (mod != 0);

		return gt;
	}

	public static long getLCM(long a, long b, long gcm) {
		return a * b / gcm;
	}
}