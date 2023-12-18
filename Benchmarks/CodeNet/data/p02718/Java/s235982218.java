import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N, M = 0;
		N = scan.nextInt();
		M = scan.nextInt();
		
		List<Integer> A = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int tmp = scan.nextInt();
			A.add(tmp);
			sum += tmp;
		}
		int b = (int)(sum * (1.0 / 4 * M));
		A.sort(Collections.reverseOrder());
		for (int i = 0; i < M; i++) {
			int tmp = A.get(i);
			if (tmp < b) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
