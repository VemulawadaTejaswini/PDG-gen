import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] C1 = sc.nextLine().toCharArray();
		char[] C2 = sc.nextLine().toCharArray();
		sc.close();
		boolean isTarget = true;
		for (int i = 0; i < C1.length; i++) {
			if (C1[i] != C2[C2.length - 1 - i]) {
				isTarget = false;
				break;
			}
		}
		if (isTarget) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}