import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int N = Integer.parseInt(scan.nextLine());
		List<Integer> list = new ArrayList<Integer>(N);
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(scan.next()));
		}
		scan.close();

		Integer[] ordered = list.stream().sorted().toArray(Integer[]::new);

		if (ordered[N / 2] == ordered[(N / 2) - 1]) {
			System.out.println(0);
		} else {
			System.out.println(ordered[N / 2] - ordered[(N / 2) - 1]);
		}
	}

}