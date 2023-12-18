import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hotel = sc.nextInt();

		ArrayList<Integer> mountains = new ArrayList<Integer>();

		for (int i = 0; i < hotel; i++) {
			final int mountain = sc.nextInt();
			mountains.add(mountain);
		}

		int firstHotel = mountains.get(0);
		int largestHotel = mountains.get(0);
		int result = 0;
		for (int j = 1; j < hotel; j++) {
			if (firstHotel <= mountains.get(j) && largestHotel <= mountains.get(j)) {
				largestHotel = mountains.get(j);
				result++;
			}

		}

		System.out.println(result + 1);

	}

}
