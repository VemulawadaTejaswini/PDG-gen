import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextInt();

		List<Long> snackNumList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			snackNumList.add(sc.nextLong());
		}

		long sum = 0;
		int counter = 0;

		for (int i = 0; i < snackNumList.size(); i++) {
			for (int j = i; j < snackNumList.size(); j++) {
				sum += snackNumList.get(j);
				if (sum % M == 0) {
					counter++;
				}
			}
			sum = 0;
		}
		System.out.println(counter);
		sc.close();
	}
}
