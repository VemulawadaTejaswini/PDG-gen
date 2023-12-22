import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 整数の数
		long N = scan.nextLong();

		long ans = 1;

		for(int i = 0; i < N; i++) {
			if(scan.nextLong() == 0) {
				System.out.println(0);
				return;
			}
			ans *= scan.nextLong();
		}

		if(ans > 100000000000000l) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}

	}

}