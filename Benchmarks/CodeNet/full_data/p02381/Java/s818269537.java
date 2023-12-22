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
			int[] nums = new int[count];
			int sum = 0;
			for (int i = 0; i < count; i++) {
				nums[i] = Integer.parseInt(str[i]);
				sum += nums[i];
			}
			double avg = sum / count;
			double s = 0;

			for (int i = 0; i < count; i++) {
				s += (nums[i] - avg) * (nums[i] - avg);
			}
			System.out.println(Math.sqrt(s / count));
		}
	}
}