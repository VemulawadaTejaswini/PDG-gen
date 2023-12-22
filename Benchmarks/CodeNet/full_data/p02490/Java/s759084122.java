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
			while (true) {
				String[] nums = getLines(br);

				int x = Integer.parseInt(nums[0]);
				int y = Integer.parseInt(nums[1]);

				if (x == 0 && y == 0) {
					break;
				}
				printSortedxy(x, y);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void printSortedxy(int x, int y) {
		if (x > y) {
			System.out.println(x + " " + y);
		} else if (x <= y) {
			System.out.println(y + " " + x);
		}
	}

	private static String[] getLines(BufferedReader br) throws IOException {
		String str = br.readLine();
		String[] nums = str.split(" ", 0);
		return nums;
	}

}