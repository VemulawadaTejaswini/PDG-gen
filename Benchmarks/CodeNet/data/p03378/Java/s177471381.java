import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());

		int cost0 = 0, costN = 0, Ai;

		for (int i = 0; i < M; i++) {
			Ai = Integer.parseInt(sc.next());
			if (Ai < X) {
				cost0++;
			} else {
				costN++;
			}
		}

		if (cost0 < costN) {
			System.out.println(cost0);
		} else {
			System.out.println(costN);
		}

	}

}