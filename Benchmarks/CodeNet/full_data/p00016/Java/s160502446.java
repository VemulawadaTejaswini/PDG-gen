import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		// 初期位置
		double x = 0;
		double y = 0;
		// 進行方向
		double r = Math.toRadians(90);

		while (!(line = br.readLine()).equals("0,0")) {

			double distance = Double.parseDouble(line.split(",")[0]);
			double turn = Double.parseDouble(line.split(",")[1]);

			// 進む
			x += Math.cos(r) * distance;
			y += Math.sin(r) * distance;

			// 進行方向を変える
			if (turn < 0) {
				r += Math.toRadians(turn * -1);
			} else {
				r -= Math.toRadians(turn);
			}
		}
		System.out.println((int) x);
		System.out.println((int) y);
	}
}