import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		long a = 0;
		long b = 0;
		for (int i = -64; i <= 64; i++) {
			for (int j = -64; j <= 64; j++) {
				if ((long)Math.pow(i, 5) - (long)Math.pow(j, 5) == x) {
					a = i;
					b = j;
					break;
				}
			}
		}

		System.out.println(a + " " + b);

		sc.close();
	}

}
