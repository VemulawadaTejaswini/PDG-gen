import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Integer[] xi = new Integer[5];
		for (int i = 0; i < 5; i++) {
			xi[i] = scan.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (xi[i] == 0) {
				System.out.println(i + 1);
			}

		}

		scan.close();

	}

}
