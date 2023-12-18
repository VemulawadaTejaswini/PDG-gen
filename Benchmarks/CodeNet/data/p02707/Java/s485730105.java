import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String[] strValues = readValues(br);

			int iEmpCount = toInt(strValues[0]);

			strValues = readValues(br);
			List<String> lstValues = Arrays.asList(strValues);
			lstValues = new LinkedList<String>(lstValues);

			for (int i = 0; i < iEmpCount; i++) {
				int iCount = 0;

				while (lstValues.remove(String.valueOf(i + 1))) {
					iCount++;
				}

				System.out.println(iCount);
			}

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
