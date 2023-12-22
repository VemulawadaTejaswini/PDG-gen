import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[1000000];

		boolean[] nums = new boolean[1000000];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = true;
		}

		nums[0] = false;
		nums[1] = false;

		int p = 0;

		for (int i = 2; i < 1000000; i++) {
			num[p++] = i;
			if (nums[i]) {
				for (int k = i * 2; k < 1000000; k += i) {
					nums[k] = false;
				}
			}
		}

		String s = "";
		while ((s = br.readLine()) != null) {

			int n = Integer.parseInt(s);


			int count = 0;
			for (int k = 0; k < n; k++) {
				if (nums[k]) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}