import java.util.ArrayList;
import java.util.Scanner;

public class NextTrip {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();

		while (true) {
			int border = Integer.parseInt(scan.next());
			if (border == 0) {
				break;
			}
			String ret;
			int sum = 0;
			for (int i = 0; i < 12; i++) {
				int m = Integer.parseInt(scan.next());
				int n = Integer.parseInt(scan.next());
				int sub = m - n;
				sum += sub;
				if (sum >= border) {
					ret = String.valueOf(i + 1);
					break;
				}
			}
			ret = "NA";

			arr.add(ret);
		}
		arr.stream().forEach(System.out::println);
	}

}