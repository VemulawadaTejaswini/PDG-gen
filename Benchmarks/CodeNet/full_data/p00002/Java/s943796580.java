import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		for (int[] n = readInts(); n != null; n = readInts()) {
			int val = n[0] + n[1];
			System.out.println(Integer.toString(val).length());
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