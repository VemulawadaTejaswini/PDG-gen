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
			while (str != null) {

				String[] nums = str.split(" ", 0);

				int x = Integer.parseInt(nums[0]);
				int y = Integer.parseInt(nums[1]);

				int keta = Integer.toString(x+y).length();

				System.out.println(keta);
				str = br.readLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}