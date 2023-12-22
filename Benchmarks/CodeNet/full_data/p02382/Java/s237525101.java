import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		//double ans = 0.0;
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			y[i] = sc.nextInt();
		}

		double sum = 0.0;
		//p=1のとき
		for(int i = 0; i < n; i++) {
			sum += Math.abs(x[i] - y[i]);
		}
		System.out.println(sum);

		sum = 0.0;
		//p=2のとき
		for(int i = 0; i < n; i++) {
			sum += Math.pow(Math.abs(x[i] - y[i]), 2);
		}
		System.out.println(Math.pow(sum, 1.0 / 2.0));

		sum = 0.0;
		//p=3のとき
		for(int i = 0; i < n; i++) {
			sum += Math.pow(Math.abs(x[i] - y[i]), 3);
		}
		System.out.println(Math.pow(sum, 1.0 / 3.0));

		sum = 0.0;
		//p=∞のとき
		for(int i = 0; i < n; i++) {
			sum = Math.max(sum, Math.abs(x[i] - y[i]));
		}
		System.out.println(sum);
	}
}

