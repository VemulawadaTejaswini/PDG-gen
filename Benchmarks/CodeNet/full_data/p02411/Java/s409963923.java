import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, f, r;
		while (true) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1)
				break;
			if (m == 0 || f == 0) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65 && 80 > m + f) {
				System.out.println("B");
			} else if (m + f >= 50 && 65 > m + f) {
				System.out.println("C");
			} else if (m + f >= 30 && 50 > m + f && r >= 50) {
				System.out.println("C");
			} else if (m + f >= 30 && 50 > m + f && 50 > r) {
				System.out.println("D");
			} else if (30 > m + f) {
				System.out.println("F");
			}
		}
	}
}
