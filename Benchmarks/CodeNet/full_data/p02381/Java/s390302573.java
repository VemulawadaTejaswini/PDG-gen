import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n < 1) break;
			String[] strPoints = br.readLine().split(" ");
			int len = strPoints.length;
			int[] points = new int[len];
			int ave = 0;
			int sum = 0;
			int sumDeviation = 0;
			for (int i = 0; i < len; i++) {
				points[i] = Integer.parseInt(strPoints[i]);
				sum += points[i];
			}
			ave = sum / len;
			for (int i = 0; i < len; i++) {
				sumDeviation += Math.pow(points[i] - ave, 2);
			}
			double sqrt = Math.sqrt(sumDeviation / len);
			System.out.println(String.format("%.8f", sqrt));
		}
	}
}