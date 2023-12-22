import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int M = sc.nextInt();
			int F = sc.nextInt();
			int R = sc.nextInt();
			if (M == -1 && F == -1 && R == -1) {
				break;
			}

			if (M == -1 || F == -1) {
				System.out.println("F");
			} else if (80 <= (M + F)) {
				System.out.println("A");
			} else if (65 <= (M + F)) {
				System.out.println("B");
			} else if (50 <= (M + F)) {
				System.out.println("C");
			} else if (35 <= (M + F)) {
				if (50 <= R) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
}