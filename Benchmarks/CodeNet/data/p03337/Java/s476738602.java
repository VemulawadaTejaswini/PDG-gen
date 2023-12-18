import java.util.Scanner;

public class Main {

	public static void main(String[] arsg) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int add = A+B;
		int sub = A-B;
		int mul = A*B;

		int res = Math.max(Math.max(add, sub), mul);

		System.out.println(res);
	}
}
