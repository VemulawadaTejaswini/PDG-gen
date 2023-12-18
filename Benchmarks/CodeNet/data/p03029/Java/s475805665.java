import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();
		sc.close();
		int b = a * 3;
		double c = b + p;

		double d = Math.floor(c / 2);
		System.out.println(d);
	}
}
