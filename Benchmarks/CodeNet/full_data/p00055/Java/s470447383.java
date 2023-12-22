import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			double[] nums = new double[11];
			nums[1] = Double.parseDouble(line);
			for (int i = 2; i < nums.length; i++) {
				if (i % 2 == 0)
					nums[i] = nums[i - 1] * 2;
				else
					nums[i] = nums[i - 1] / 3.0;
			}
			double sum = 0;
			for (double d : nums)
				sum += d;
			System.out.println(sum);
			line = null;
		}

	}

}