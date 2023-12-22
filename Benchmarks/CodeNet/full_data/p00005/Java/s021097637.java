import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String read = null;
		ArrayList<String> output = new ArrayList<String>();

		while ((read = reader.readLine()) != null) {
			String[] parts = read.split(" ");
			int[] nums = new int[2];
			int c = 0;
			for (String part:parts) {
				nums[c] = Integer.parseInt(part);
				c++;
			}

			Arrays.sort(nums);

			int divide = nums[0];
			int max = 0;
			while (true) {
				if (nums[0] % divide == 0 && nums[1] % divide == 0) {
					max = divide;
					break;
				}
				divide--;
			}

			int a = 1;
			int b = 1;
			int min = 0;

			if (nums[0] < nums[1]) {
				int lnum = nums[0];
				int rnum = nums[1];
				nums[0] = lnum;
				nums[1] = rnum;
			}

			HashMap<Integer, Integer> l = new HashMap<Integer, Integer>();
			int count = 0;
			int countB = 0;
			l1 : while (true) {
				while (count < 10000) {
					if (nums[0] * a > 2000000000) {
						break l1;
					}
					l.put(nums[0] * a, a);
					a++;
					count++;
				}
				count = 0;
				while (countB < 10000) {
					if (l.containsKey(nums[1] * b)) {
						min = nums[1] * b;
						break l1;
					}
					b++;
					countB++;
				}
				countB = 0;
			}

			System.out.println(max + " " + min);

		}

		for (String str:output) {
			System.out.println(str);
		}

	}

}