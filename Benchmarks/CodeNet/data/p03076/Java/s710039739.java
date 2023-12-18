import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		double ret = 0;

		//料理a
		ret = ret + a;
		ret = (int) (Math.ceil(ret/10) * 10);

		//料理b
		ret = ret + b;
		ret = (int) (Math.ceil(ret/10) * 10);

		//料理c
		ret = ret + c;
		ret = (int) (Math.ceil(ret/10) * 10);

		//料理d
		ret = ret + d;
		ret = (int) (Math.ceil(ret/10) * 10);

		//料理e
		ret = ret + e;

		System.out.println((int)ret);

		sc.close();
	}
}
