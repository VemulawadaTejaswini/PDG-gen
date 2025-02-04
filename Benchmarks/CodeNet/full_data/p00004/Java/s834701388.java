import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		for (int[] in = readInts(); in != null; in = readInts()) {
			int a11 = in[0], a12 = in[1], b1 = in[2];
			int a21 = in[3], a22 = in[4], b2 = in[5];
			double D = a11 * a22 - a12 * a21;
			int xx = +a22 * b1 - a12 * b2;
			int yy = +a11 * b2 - a21 * b1;
			int ansXx1000 = (int) (xx / D) * 1000;
			int ansYx1000 = (int) (yy / D) * 1000;
			String s = String.format("%1$.4g %2$.4g", new double[] {
					ansXx1000 / 1000d, ansYx1000 / 1000d });
			System.out.println(s);
		}

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));

	private static int[] readInts() throws IOException {
		String readLine = br.readLine();
		if (readLine == null) {
			return null;
		}
		String[] s = readLine.split(" ");
		int[] result = new int[s.length];
		for (int i = 0; i < result.length; i++)
			result[i] = Integer.parseInt(s[i], 10);

		return result;
	}
}