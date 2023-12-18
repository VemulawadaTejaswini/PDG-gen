import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int in = sc.nextInt();
			if (in % 2 == 0) {
				list.add(in);
			}
		}
		for (Integer integer : list) {
			if (integer % 3 != 0 && integer % 5 != 0) {
				System.out.println("DENIED");
				return;
			}
		}
		System.out.println("APPROVED");

	}
}
