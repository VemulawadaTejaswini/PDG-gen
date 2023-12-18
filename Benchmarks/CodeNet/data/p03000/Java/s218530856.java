import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int X = sc.nextInt();

			sc.nextLine();

			List<Integer> L = new ArrayList<>();

			int sum = 0;
			int answer = 0;
			for (int i = 0; i < N; i++) {
				sum += sc.nextInt();
				if (sum <= X) {
					answer = i;
					break;
				}
			}

			System.out.println(answer + 1);

		}
}
