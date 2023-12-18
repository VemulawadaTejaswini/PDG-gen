import java.util.Scanner;

public class A_ConsecutiveIntegers {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		System.out.println(N-K+1);
	}
}