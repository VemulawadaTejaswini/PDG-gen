import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
//		int[] H = new int[N];
		int idx;
		int highest = 0;
		boolean result = true;
		int H;

		for (idx = 0; idx < N; idx++) {
//			H[idx] = Integer.parseInt(sc.next());
			H = Integer.parseInt(sc.next());

			if (H < highest - 1) {
				result = false;
				break;
			}

			if (H > highest) {
				highest = H;
			}
		}

		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
