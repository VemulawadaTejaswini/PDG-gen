import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				int e = sc.nextInt();
				int j = sc.nextInt();
				if (m == 100 || e == 100 || j == 100) {
					System.out.println("A");
				} else if (90 <= (e + m) / 2) {
					System.out.println("A");
				} else if (80 <= (m + e + j) / 3) {
					System.out.println("A");
				} else if (70 <= (m + e + j) / 3) {
					System.out.println("B");
				} else if (50 <= (m + e + j) / 3 && (80 <= m || 80 <= e)) {
					System.out.println("B");
				} else {
					System.out.println("C");
				}
			}
		}
	}
}