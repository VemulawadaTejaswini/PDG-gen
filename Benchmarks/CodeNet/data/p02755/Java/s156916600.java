import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextInt();
		double b = sc.nextInt();

		// 0.1倍の方がはるかに大きいとき
		if (Math.ceil(a * 1.25) < b) {
			System.out.println(-1);
			return;
		}

		double tmp = Math.ceil(b/ 0.1);
		int x = (int)(tmp * 0.08);

		if(x < a) {
			System.out.println((int)(a/0.08));
		}else {
			System.out.println((int)tmp);
		}
	}
}
