import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Long> keepList = new ArrayList<>();
		List<Long> longList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			keepList.add(sc.nextLong());
		}
		for (int i = 0; i < keepList.size(); i++) {
			for (int j = i + 1; j < keepList.size(); j++) {
				longList.add(keepList.get(i) * keepList.get(j));
			}
		}
		Collections.sort(longList);
		System.out.println(longList.get(k - 1));
	}

}