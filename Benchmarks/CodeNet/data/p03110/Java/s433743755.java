import java.util.Scanner;

public class B119 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double ans = 0;
		double num = 0;
		String s;
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for(int i = 0; i < N; i++) {
			num = sc.nextDouble();
			s = sc.next();

			if(s.equals("JPY")) {
				ans += num;
			} else {
				ans += num * 380000.0;
			}
		}

		System.out.println(ans);

		sc.close();
	}

}