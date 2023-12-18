import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		String s = sc.next();
		int countJpP = 0, countOvP = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'c')
				System.out.println("No ");
			else if (s.charAt(i) == 'a') {
				if (countJpP + countOvP < a + b) {
					countJpP++;
					System.out.println("Yes ");
				} else {
					System.out.println("No ");
				}
			} else {
				if (countOvP + 1 <= b && countOvP + countJpP < a + b) {
					System.out.println("Yes ");
					countOvP++;
				} else
					System.out.println("No");
			}

		}
		sc.close();
	}
}
