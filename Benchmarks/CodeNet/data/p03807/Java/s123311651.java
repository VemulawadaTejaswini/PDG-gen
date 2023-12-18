import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> oddArray = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			if (t % 2 != 0) {
				oddArray.add(t);
			}
		}
		if (oddArray.size() % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
