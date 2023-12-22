import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int amountOfDataset = Integer.parseInt(str);

			for (int i = 0; i < amountOfDataset; i++) {
				str = br.readLine();
				String[] nums = str.split(" ", 0);
				double x1 = Double.parseDouble(nums[0]);
				double y1 = Double.parseDouble(nums[1]);
				double x2 = Double.parseDouble(nums[2]);
				double y2 = Double.parseDouble(nums[3]);
				double x3 = Double.parseDouble(nums[4]);
				double y3 = Double.parseDouble(nums[5]);
				double x4 = Double.parseDouble(nums[6]);
				double y4 = Double.parseDouble(nums[7]);

				double slopeAB = (y2 - y1) / (x2 - x1);
				double slopeCD = (y4 - y3) / (x4 - x3);

				if (slopeAB == slopeCD) {
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