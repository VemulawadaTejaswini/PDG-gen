import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] a) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		try {
			while ((line = br.readLine()) != null) {
				String[] vals = line.split(" ");
				double[] nums = new double[vals.length];
				for (int i = 0; i < vals.length; i++) {
					nums[i] = Double.parseDouble(vals[i]);
				}

				double x = (nums[2] * nums[4] - nums[1] * nums[5]) / (nums[0] * nums[4] - nums[1] * nums[3]);
				double y = (nums[2] * nums[3] - nums[0] * nums[5]) / (nums[1] * nums[3] - nums[0] * nums[4]);

				System.out.println(String.format("%.3f %.3f", x, y));
			}
		} catch (Exception e) {
		}
	}
}