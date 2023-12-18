
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextInt();


		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		}else {
			long ans = A * B;
			ans = Math.min(ans,B * C);
			ans = Math.min(ans,A * C);

			System.out.println(ans);
		}

	}

}
