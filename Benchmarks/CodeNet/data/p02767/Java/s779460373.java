import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			intList.add(sc.nextInt());
		}

		for (int index = 1; index <= 100; index++) {
			for (int j = 0; j < intList.size(); j++) {
				int hp = (intList.get(j) - index) * (intList.get(j) - index);
				sum = sum + hp;
			}
			if (sum < min) {
				min = sum;
			}
			sum = 0;
		}

		System.out.println(min);
	}

}