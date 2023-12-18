import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();

		long ans = A;
		for(long i=A+1;i<=B;i++) {
			ans = ans^i;
		}
		System.out.println(ans);
	}
}