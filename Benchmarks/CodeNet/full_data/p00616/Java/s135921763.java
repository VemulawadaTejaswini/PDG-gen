import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		short n, h;
		short[][] holes;
		int intersect;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			n = Short.parseShort(line.substring(0, line.indexOf(' ')));
			h = Short.parseShort(line.substring(line.indexOf(' ') + 1));
			if (n == 0 && h == 0) {
				break;
			}
			holes = new short[h][3];

			StringTokenizer st;
			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				String plane = st.nextToken();
				if (plane.equals("xy")) {
					holes[i][0] = Short.parseShort(st.nextToken());
					holes[i][1] = Short.parseShort(st.nextToken());
				} else if (plane.equals("xz")) {
					holes[i][0] = Short.parseShort(st.nextToken());
					holes[i][2] = Short.parseShort(st.nextToken());
				} else {
					holes[i][1] = Short.parseShort(st.nextToken());
					holes[i][2] = Short.parseShort(st.nextToken());
				}
			}
			// 交点の総数
			intersect = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < h; j++) {
					if (i != j) {
						byte b = 1;
						for (int k = 0; k < 3; k++) {
							if (holes[i][k] == 0 || holes[j][k] == 0
									|| holes[i][k] == holes[j][k]) {
								b &= 1;
							} else {
								b = 0;
							}
						}
						intersect += b;
					}
				}
			}
			// 穴の開いていない立方体の数
			intersect = intersect > 0 ? intersect / 2 - 1 : 0;
			System.out.println(Math.pow(n, 3) - n * h + intersect);
		}
	}
}