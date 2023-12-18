import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		if (one == two) {
			System.out.println(one + two);
		} else if (one > two) {
			System.out.println(one * 2 - 1);
		} else {
			System.out.println(two * 2 - 1);
		}
		sc.close();
	}
}