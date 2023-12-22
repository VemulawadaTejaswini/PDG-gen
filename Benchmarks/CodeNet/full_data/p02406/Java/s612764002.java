import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i = 1;

		while (i <= n) {
			if (i % 10 == 3 || i % 3 == 0) {
				System.out.print(" " + i);
			} else {
				String s_i = Integer.toString(i);
				if (s_i.contains("3")) {
					System.out.print(" " + i);
				}
			}
			i++;
		}
		System.out.println();
	}
}
