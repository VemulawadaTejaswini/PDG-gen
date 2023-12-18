import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		int n;
		int a, b;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		if(n == 1) {
			System.out.println("Hello World");
		} else {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
