import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 課題B
 * @author ken2
 */
public class Main {

	/** 天気：晴れ */
	private static final String WATHER_SUNNY = "Sunny";
	/** 天気：曇り */
	private static final String WATHER_CLOUDY = "Cloudy";
	/** 天気：飴 */
	private static final String WATHER_RAINY = "Rainy";

	/**
	 * メイン処理
	 * @param args 起動引数
	 */
	public static void main(String[] args) {

		// 標準入力から今日の天気を取得
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String weather = null;
		try {
			weather = br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 標準出力へ天気を出力
		if (weather.equals(WATHER_SUNNY)) {
			System.out.println(WATHER_CLOUDY); // Sunny→Cloudy
		}
		if (weather.equals(WATHER_CLOUDY)) {
			System.out.println(WATHER_RAINY); // Cloudy→Rainy
		}
		if (weather.equals(WATHER_RAINY)) {
			System.out.println(WATHER_SUNNY); // Rainy→Sunny
		}
	}
}
