import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {
		Scanner scanner = new Scanner (System.in);

		int maximum = 1;
		int number = scanner.nextInt();
		int[] list = new int [number];

		for (int index=0; index<number; index++) {
			list[index]=scanner.nextInt();
		}
		for (int index=0; index+1<number; index++) {
			int first = list[index];
			int second = list[index+1];
			int temp = find(first, second);

			if (index!=0) {
				temp = find (maximum,temp);

				if (temp<maximum) {
					maximum=temp;
				}

			} else {
				maximum=temp;
			}

		}

		System.out.println(maximum);
	}

	private int  find(int first, int second) {

		if (first<second) {
			find (second, first);
		}

		if (second==0) {
			return first;
		} else {
			first = find(second, (first%second));
		}

		return first;
	}
}
