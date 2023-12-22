import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			numList.add(sc.nextInt());
		}

		Collections.sort(numList);
		
		int count = 0;

		for (int i = 0; i < numList.size() - 2; i++) {
			for (int j = i + 1; j < numList.size() - 1; j++) {
				for (int k = j + 1; k < numList.size(); k++) {
					int x1 = numList.get(i);
					int x2 = numList.get(j);
					int x3 = numList.get(k);

					if (x1 != x2 && x2 != x3 && x1 + x2 > x3) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}

}