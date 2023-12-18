import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		ArrayList<Double> nums = new ArrayList<Double>();

		for (int i = 0; i < n; i++) {
			nums.add(Double.parseDouble(sc.next()));
		}

		Collections.sort(nums);

		double result = nums.get(0);

		for (int i = 0; i < nums.size(); i++) {
			result = (result + nums.get(i)) / 2;
		}

		System.out.println(result);

	}
}
