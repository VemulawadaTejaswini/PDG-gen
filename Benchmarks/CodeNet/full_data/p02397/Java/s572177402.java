import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3000; i++) {
			String line = sc.nextLine();
			String[] string = line.split(" ");

			int[] is = new int[2];
			is[0] = Integer.parseInt(string[0]);
			is[1] = Integer.parseInt(string[1]);

			if (is[0] <= is[1]) {
				System.out.println(is[0] + " " + is[1]);
			} else {
				System.out.println(is[1] + " " + is[0]);
			}

			if (is[0] == 0 && is[1] == 0) {
				break;
			}
		}

	}

}