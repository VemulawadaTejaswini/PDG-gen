import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> input = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			input.add(sc.nextInt());
		}
		input.sort((i, j) -> i - j);
		if (input.get(0) == input.get(input.size() - 1)) {
			System.out.println(0);
			System.exit(0);
		}
		for (int i = 0; i < input.size(); i++) {
			int iInt = input.get(i);
			for (int j = 0; j < i; j++) {
				if (iInt % input.get(j) == 0) {
					input.remove(i);
					i--;
					break;
				}
			}
		}
		System.out.println(input.size());
	}
}