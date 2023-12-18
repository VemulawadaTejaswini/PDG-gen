import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = 0;
		for (int i = 1; i < b-a; i++) {
			c += i;
		}
		System.out.println(c-a);
	}
}
