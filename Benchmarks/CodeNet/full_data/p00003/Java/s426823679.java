import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int numberOfReceivedDataset = Integer.parseInt(str);

			for (int i = 1; i <= numberOfReceivedDataset; i++) {
				str = br.readLine();
				String[] nums = str.split(" ", 0);

				int x = Integer.parseInt(nums[0]);
				int y = Integer.parseInt(nums[1]);
				int z = Integer.parseInt(nums[2]);

				int xToSecondPower = x * x;
				int yToSecondPower = y * y;
				int zToSecondPower = z * z;

				if (xToSecondPower + yToSecondPower == zToSecondPower) {
					System.out.println("YES");
				} else if (zToSecondPower + yToSecondPower == xToSecondPower) {
					System.out.println("YES");
				} else if (zToSecondPower + xToSecondPower == yToSecondPower) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}