import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String[] strValues = readValues(br);


			System.out.println(toInt(strValues[0]) * 2 * Math.PI);

		} finally {
			br.close();
		}
	}

	private static String[] readValues(BufferedReader br) throws IOException {
		return br.readLine().split("\\s");
	}

	private static int toInt(String str) {
		return Integer.parseInt(str);
	}
}
