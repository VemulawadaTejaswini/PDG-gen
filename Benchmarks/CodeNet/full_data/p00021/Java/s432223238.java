import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			if (line.contains(" ")) {
				double[] c = new double[8];
				StringTokenizer st = new StringTokenizer(line);
				for (int i = 0; i < 8; i++) {
					c[i] = Double.parseDouble(st.nextToken());
				}
				if (c[0] == c[2] && c[5] == c[7]) {
					// 直交
					System.out.println("NO");
				} else if (c[1] == c[3] && c[4] == c[6]) {
					// 直交
					System.out.println("NO");
				} else if ((c[0] - c[2]) * (c[1] - c[3]) == (c[4] - c[6])
						* (c[5] - c[7])) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}

			}
		}
	}
}