import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final String[] timeClass = { "AAA", "AA", "A",
			"B", "C", "D", "E", "NA" };
	static final double[][] timeTable = {
			{ 35.5, 71.0 }, // AAA
			{ 37.5, 77.0 }, // AA
			{ 40.0, 83.0 }, // A
			{ 43.0, 89.0 }, // B
			{ 50.0, 105.0 }, // C
			{ 55.0, 116.0 }, // D
			{ 70.0, 148.0 } // E
	};

	public static void main(String[] args)
			throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String buf = null;
		while ((buf = br.readLine()) != null) {
			String[] time = buf.split(" ");
			System.out.println(judgeClass(
					Double.parseDouble(time[0]),
					Double.parseDouble(time[1])));
		}
	}

	public static String judgeClass(double timeOf500m,
			double timeOf1000m) {
		// 500m比較
		for (int timeClassOf500m = 0; timeClassOf500m < timeTable.length; timeClassOf500m++) {
			// 500mテーブル未満のとき
			if (timeOf500m < timeTable[timeClassOf500m][0])
				// 1000mテーブル比較
				for (int timeClassOf1000m = timeClassOf500m; timeClassOf1000m < timeTable.length; timeClassOf1000m++) {
					if (timeOf1000m < timeTable[timeClassOf1000m][1]) {
						return timeClass[timeClassOf1000m];
					}
				}
		}
		return timeClass[timeClass.length - 1];
	}
}