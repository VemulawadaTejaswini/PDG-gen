import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		int count = 0;

		for (int i = 0; i < 4; i++) {
			if (a.charAt(i) == '+')
				count++;
			else
				count--;
		}

		System.out.println(count);

	}
}