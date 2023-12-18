
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int a;
		int b;
		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();

		int taxi = b;
		int train = a * n;
		int ans = taxi < train ? taxi : train;

		System.out.println(ans);
		sc.close();
	}

}
