import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String[] strValues = readValues(br);

			int iEmpCount = toInt(strValues[0]);

			strValues = readValues(br);
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (String strBossEmpNo : strValues) {
				Integer iCount = map.get(strBossEmpNo);
				if (iCount == null) {
					iCount = 0;
				}
				map.put(strBossEmpNo, ++iCount);
			}

			for (int i = 0; i < iEmpCount; i++) {
				Integer iCount = map.get(String.valueOf(i + 1));
				if (iCount == null) { iCount = 0; }
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
