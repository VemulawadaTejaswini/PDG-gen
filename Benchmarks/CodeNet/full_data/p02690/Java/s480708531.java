import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int a = 0, b = 0;
		for (int i = -64; i <= 64; i++) {
			for (int j = -64; j <= 64; j++) {
				if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
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
