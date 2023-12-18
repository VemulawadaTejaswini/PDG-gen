import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double ans = Math.ceil((double)(b - 1) / (a - 1));
		System.out.println((int)ans);
	}
}