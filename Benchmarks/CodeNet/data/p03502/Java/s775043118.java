import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int num = N.length();
		int H = 0;

		for (int i = 0; i < num; i++) {
			H += N.charAt(i) - '0';
		}

		if (Integer.parseInt(N) % H == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
