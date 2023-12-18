import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	static List<List<Integer>> ptnList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		char[] sa = s.toCharArray();

		List<String> pinList = new ArrayList<>();

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {

					char[] p = {sa[i] , sa[j] , sa[k]};
					String pin = String.valueOf(p);
					pinList.add(pin);

				}
			}
		}

		List<String> distinctList = pinList.stream().distinct().collect(Collectors.toList());

		System.out.println(distinctList.size());

	}

}
