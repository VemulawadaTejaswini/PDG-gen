import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int A = sc.nextInt();

		ArrayList<Integer> lList = new ArrayList<>();

		for (int index = 1; index <= N; index++) {
			lList.add(sc.nextInt());
		}

		for (int i : lList) {
			if (i % 2 == 0) {
				if (i % 3 == 0 || i % 5 == 00) {
				} else {
					System.out.println("DENIED");
					return;
				}
			}
		}
		System.out.println("APPROVED ");
	}
}
