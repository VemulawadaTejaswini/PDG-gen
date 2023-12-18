import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				al.add(Integer.parseInt(sc.next()));
			} else {
				al.add(0, Integer.parseInt(sc.next()));
			}
		}

		if (n % 2 == 1) {
			for (int i = 0; i < n; i++) {
				System.out.print(al.get(i).toString());
				if (i != n - 1) {
					System.out.print(" ");
				}
			}
		} else {
			for (int i = n - 1; i >= 0; i--) {
				System.out.print(al.get(i).toString());
				if (i != 0) {
					System.out.print(" ");
				}
			}
		}
		sc.close();

	}

}