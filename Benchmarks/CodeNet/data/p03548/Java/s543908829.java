import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		x -= z;
		y += z;

		int count = 0;
		while (true) {
			if (x < y * count) {
				break;
			} else {
				count++;
			}
		}

		System.out.println(--count);

		sc.close();
	}
}