import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; i <= b; j++) {
				if (i == j) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
