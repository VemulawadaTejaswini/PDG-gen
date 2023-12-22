import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Mod!Mod!
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n = parseInt(br.readLine());
		int[] nums = new int[10];

		StringTokenizer st = new StringTokenizer(br.readLine());

		while (st.hasMoreTokens()) nums[parseInt(st.nextToken())]++;

		int r0 = nums[3] + nums[6] + nums[9];
		int r1 = nums[1] + nums[4] + nums[7];
		int r2 = nums[2] + nums[5] + nums[8];

		int ans = 1;

		if (r1 > 0 || r2 > 0) {
			int s, l;
			s = (r1 < r2) ? r1 : r2;
			l = (r1 < r2) ? r2 : r1;
			l--;
			s = (s < l) ? s : l;
			l = (s < l) ? l : s;
			ans += s * 2;
			l -= s;
			if (l > 0) ans += 2;
			ans += r0;
		}

		System.out.println(ans);
	}
}