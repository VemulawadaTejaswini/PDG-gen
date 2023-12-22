import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		String[] in = input.split(" ");
		if (n > 0 && n <= 10000) {
			int[] list = new int[n];
			int minimum = 0;
			int maximum = 0;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int ai = Integer.parseInt(in[i]);
				if (ai >= -1000000 && ai <= 1000000) {
					list[i] = ai;
					if (i == 0) {
						minimum = list[i];
						maximum = list[i];
					}

					sum += list[i];

					if (maximum < list[i]) {
						maximum = list[i];
					}

					if (minimum > list[i]) {
						minimum = list[i];
					}
				} else {
					minimum = 0;
					maximum = 0;
					sum = 0;
					break;
				}
			}
			System.out.print(minimum + " ");
			System.out.print(maximum + " ");
			System.out.println(sum);
		}
	}
}