import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		double x0, x1, x2, xq, xr;
		double y0, y1, y2, yq, yr;
		double t;

		while ((line = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line, ",");
			x0 = x1 = Double.parseDouble(st.nextToken());
			y0 = y1 = Double.parseDouble(st.nextToken());
			x2 = Double.parseDouble(st.nextToken());
			y2 = Double.parseDouble(st.nextToken());
			xq = Double.parseDouble(st.nextToken());
			yq = Double.parseDouble(st.nextToken());

			if (x1 == 0 && x2 == 0) {
				// 線分が y軸の場合
				xr = -1 * xq;
				yr = yq;
			} else if (y1 == 0 && y2 == 0) {
				// 線分が x軸の場合
				xr = xq;
				yr = -1 * yq;
			} else {

				// P1 を原点に移動
				x1 -= x0;
				y1 -= y0;
				x2 -= x0;
				y2 -= y0;
				xq -= x0;
				yq -= y0;

				// 回転してx軸と平行に
				t = Math.atan2(y2, x2);
				t *= -1;

				// Q を -t回転
				double xq0 = xq, yq0 = yq;
				xq = xq0 * Math.cos(t) - yq0 * Math.sin(t);
				yq = xq0 * Math.sin(t) + yq0 * Math.cos(t);

				// R の座標を取得
				xr = xq;
				yr = -1 * yq;

				// R を t回転
				double xr0 = xr, yr0 = yr;
				xr = xr0 * Math.cos(-t) - yr0 * Math.sin(-t);
				yr = xr0 * Math.sin(-t) + yr0 * Math.cos(-t);

				// 原点から元の位置に戻す
				xr += x0;
				yr += y0;
			}
			System.out.println(xr + " " + yr);
		}
	}
}