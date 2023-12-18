import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		while (x > 0) {
			if (x >= 500) {
				count += 1000 * (x / 500);
			}
			if (x % 500 >= 5) {
				count += 5 * ((x % 500) / 5);
			}
		}
		System.out.println(count);
	}

}
