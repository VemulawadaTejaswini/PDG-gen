import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] str = line.split(" ");
		int L = Integer.parseInt(str[0]);
		int R = Integer.parseInt(str[1]);
		int ans = Integer.MAX_VALUE;

		if (L / 2019 != 0 && R / 2019 != 0 && R / 2019 - L / 2019 >= 2) {
			ans = 0;
		}
		else if (L / 2019 == 0 && R / 2019 != 0 && R / 2019 - L / 2019 >= 2) {
			ans = 0;
		}
		else if (L / 2019 != 0 && R / 2019 == 0 && R / 2019 - L / 2019 >= 2) {
			ans = 0;
		}
		else if (L / 2019 == 0 && R / 2019 == 0 && R / 2019 - L / 2019 >= 1) {
			ans = 0;
		}
		else {
			for (int i = L; i < R; i++) {
				for (int k = i+1; k <= R; k++) {
					int keep = (i % 2019) * (k % 2019);
					keep %= 2019;
					if (keep < ans) {
						ans = keep;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
