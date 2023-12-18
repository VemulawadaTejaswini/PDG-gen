import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			int a = sc.nextInt();
			int b = sc.nextInt();
			long ret = 0;
			// 離れ方が偶数の場合
			if((b - a) % 2 == 0) {
				ret = (b - a) / 2;
			} else {
				// aの端までの回数
				long aMax = a - 1;
				// bの端までの回数
				long bMax = n - b;
				if(aMax < bMax) {
					ret = b - 1;
				} else {
					ret = n - a;
				}
			}
			System.out.println(ret);
		}

	}

}
