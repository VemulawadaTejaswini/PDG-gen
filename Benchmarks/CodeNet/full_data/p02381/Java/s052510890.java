import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int count = Integer.parseInt(br.readLine());

			if (count == 0) {
				break;
			}

			String[] str = br.readLine().split(" ");
			double[] nums = new double[count];
			double sum = 0;
			for (int i = 0; i < count; i++) {
				nums[i] = Double.parseDouble(str[i]);
				sum += nums[i];
			}
			double avg = sum / count;
			double s = 0;

			for (int i = 0; i < count; i++) {
				s += Math.pow((nums[i] - avg),2);
			}
			System.out.println(Math.sqrt(s / count));
		}
	}
}