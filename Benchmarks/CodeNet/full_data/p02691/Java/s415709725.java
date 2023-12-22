import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cnt = 0;
		Integer N = Integer.parseInt(scanner.next());
		List<Integer> AList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Integer A = Integer.parseInt(scanner.next());
			AList.add(A);
			for (int j = 0; j < i; j++) {
				if (i - j == A + AList.get(j)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
