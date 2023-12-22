import java.util.Scanner;

public class ITP15D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.parseInt(line);
		int i = 1;
		while (i <= n) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else if (i % 10 == 3) {
				System.out.print(" " + i);
			}
			i++;
		}

	}

}