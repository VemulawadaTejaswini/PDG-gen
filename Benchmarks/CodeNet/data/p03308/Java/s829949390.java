import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> array_number = new ArrayList<>();
		for (int i =0; i < N; i++) {
			int input_number = sc.nextInt();
			array_number.add(input_number);
		}

		Collections.sort(array_number);

		System.out.println(array_number.get(N-1)-array_number.get(0));
	}

}
