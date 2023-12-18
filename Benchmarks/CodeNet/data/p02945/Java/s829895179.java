import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int c = (a + b);
		int d = (a - b);
		int e = (a * b);

		System.out.println(Math.max(Math.max(c, d), e));
	}
}