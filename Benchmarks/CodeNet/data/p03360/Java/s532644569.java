import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int max = Math.max(Math.max(a, b), c);
		int sum = max * (k - 1) + a + b + c;
		System.out.println(sum);
	}
}