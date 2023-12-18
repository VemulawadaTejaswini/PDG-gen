import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		long K = Long.parseLong(line[1]);
		int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		List<Integer> s = new ArrayList<Integer>();

		for (long k = 0; k < K; k++) {
			for (int n = 0; n < N; n++) {
				int x = A[n];

				if (s.contains(x)) {
					while (s.contains(x) && !s.isEmpty()) {
						s.remove(s.size() - 1);
					}
				} else {
					s.add(x);
				}
			}
		}

		int i = 0;
		for (; i < s.size() - 1; i++) {
			System.out.print(s.get(i) + " ");
		}
		System.out.print(s.get(i));
	}

}