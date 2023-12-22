import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int A = 0;
		int B = 0;
		long num = 0;

		for (int i = -100; i < 100; i++) {
			for (int j = -100; j < 100; j++) {
				num = i*i*i*i*i - j*j*j*j*j;

				if (num == X) {
					A = i;
					B = j;
					break;
				}
			}
			if (num == X) break;
		}

		System.out.println(A + " " + B);
	}

}