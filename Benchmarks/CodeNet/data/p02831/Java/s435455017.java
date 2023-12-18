import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		int gcd = GCD(A,B);
		int lcm = LCM(A,B,gcd);
		System.out.println(lcm);

	}

public static int GCD(int a, int b) {
	for(int i = a; i > 0; i--) {
		if(a%i == 0 && b%i == 0) {
			return i;
		}
	}
	return 1;
}

public static int LCM(int a, int b, int gcd) {
	return a*b/gcd;
}
}
