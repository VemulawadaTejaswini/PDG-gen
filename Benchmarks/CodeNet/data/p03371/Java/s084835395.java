import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int betu = (a * x) + (b * y);
		int sepa = c * Math.max(a, b);
		int midd;
		if (x > y) {
			midd = (c * b) + a * (x - y);
		} else if (x < y) {
			midd = (c * a) + b * (y - x);
		} else {
			midd = sepa;
		}
		System.out.println(Math.min(Math.min(betu, sepa), midd));
	}
}