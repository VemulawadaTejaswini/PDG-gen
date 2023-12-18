import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] strArgs) throws Exception {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			String[] strValues = readValues(br);
			int waribikiCount = toInt(strValues[2]);

			String[] strReizoukoPrices = readValues(br);
			String[] strRangePrices = readValues(br);

			int iReizoukoMin = Integer.MAX_VALUE;
			int iRangeMin = Integer.MAX_VALUE;
			for (String strReizouko : strReizoukoPrices) {
				iReizoukoMin = Math.min(iReizoukoMin, toInt(strReizouko));
			}
			for (String strRange : strRangePrices) {
				iRangeMin = Math.min(iRangeMin, toInt(strRange));
			}

			int iMinPrices = Integer.MAX_VALUE;
			for (int i = 0; i < waribikiCount; i++) {
				String[] strWaribikiPairs = readValues(br);

				iMinPrices = Math.min(iMinPrices, toInt(strReizoukoPrices[toInt(strWaribikiPairs[0]) - 1])
												+ toInt(strRangePrices[toInt(strWaribikiPairs[1]) - 1])
												- toInt(strWaribikiPairs[2]));
			}

			iMinPrices = Math.min(iMinPrices, iReizoukoMin + iRangeMin);

			System.out.println(iMinPrices);

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
