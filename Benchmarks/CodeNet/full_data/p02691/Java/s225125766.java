import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer N = Integer.parseInt(scanner.next());
		List<Integer> AList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			AList.add(Integer.parseInt(scanner.next()));
		}

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				Integer a1 = AList.get(i);
				Integer a2 = AList.get(j);
				if (j - i == a1 + a2) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}