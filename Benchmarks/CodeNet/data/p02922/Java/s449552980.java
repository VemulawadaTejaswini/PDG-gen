import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		StringBuilder finalAns = new StringBuilder();
//		int a1 = 2, b1 = 1;
//		while (true) {
//			if (b1 == 20) {
//				a1++;
//				b1 = a1;
//			} else {
//				b1++;
//			}
		int a = sc.nextInt(), b = sc.nextInt();
		double x = Math.floor(Math.log(b) / Math.log(a));
		double ans = Math.pow(a, x);
		x += Math.ceil((b - ans) / (a - 1));
		System.out.println((int) x);
//		if (a == 20 && b >= 20)
//			break;
//		}
		sc.close();
	}
}
