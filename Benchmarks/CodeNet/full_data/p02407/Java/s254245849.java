import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		scan.close();

		for (int i = n - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(list.get(i) + " ");
			} else {
				System.out.print(list.get(i) + "\n");
			}
		}
	}

}