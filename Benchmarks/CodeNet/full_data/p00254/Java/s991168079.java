/**
 * All Numbers Lead to 6174
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0000")) {

			int N = parseInt(line), L, S;
			int k;
			int c = 0;

			outer:
			while (N != 6174) {

				//N
				byte[] nums = new byte[10];
				k = 1000;
				for (int i = 0; i < 4; i++) {
					int n = N / k;
					if (++nums[n] == 4) {
						c = -1;
						break outer;
					}
					N -= n * k;
					k /= 10;
				}

				//S
				byte[] numsS = Arrays.copyOf(nums, nums.length);
				k = 1000;
				S = 0;
				for (int i = 0; i < 10; i++) {
					while (numsS[i] > 0) {
						S += i * k;
						numsS[i]--;
						k /= 10;
					}
				}

				//L
				byte[] numsL = Arrays.copyOf(nums, nums.length);
				k = 1000;
				L = 0;
				for (int i = 9; i >= 0; i--) {
					while (numsL[i] > 0) {
						L += i * k;
						numsL[i]--;
						k /= 10;
					}
				}

				N = L - S;
				c++;
			}

			//ans.
			System.out.println(c > -1 ? c : "NA");
		}
	}
}