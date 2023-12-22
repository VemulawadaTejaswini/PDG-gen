import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			if (0 == sc.nextInt()) {
				System.out.println(i + 1);
			}
		}
	}
}