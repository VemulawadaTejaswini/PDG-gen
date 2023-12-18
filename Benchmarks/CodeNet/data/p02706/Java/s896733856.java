import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String[] strValues = readValues(br);

			int iSummerDays = toInt(strValues[0]);
			int iWorkCount = toInt(strValues[1]);

			strValues = readValues(br);

			int iWorkDays = 0;
			for (String strWorkDay : strValues) {
				iWorkDays += toInt(strWorkDay);
			}

			int iPlayDays = iSummerDays - iWorkDays;
			if (iPlayDays < 0) {
				iPlayDays = -1;
			}

			System.out.println(iPlayDays);

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
