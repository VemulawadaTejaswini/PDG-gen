import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int a0 = nextInt();
			int L = nextInt();
			if (L == 0) {
				break;
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(a0);

			loop: while (true) {
				String aString = String.valueOf(a0);
				while (aString.length() < L) {
					aString = "0" + aString;
				}

				int[] nums = new int[L];
				for (int i = 0; i < nums.length; i++) {
					nums[i] = Integer.parseInt(aString.substring(i, i + 1));
				}
				Arrays.sort(nums);
				int big = 0;
				int small = 0;
				for (int i = 0; i < L; i++) {
					big += nums[i] * Math.pow(10, i);
					small += nums[i] * Math.pow(10, L - i - 1);
				}
				int result = big - small;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) == result) {
						System.out.println(i + " " + result + " "
								+ (list.size() - i));
						break loop;
					}
				}
				list.add(result);
				a0 = result;
			}
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}