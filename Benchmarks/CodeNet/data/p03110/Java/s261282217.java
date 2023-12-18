
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double ans = 0;
		for(int i = 0; i < N; i++) {
			double money = sc.nextDouble();
			String kind = sc.next();
			if(kind.equals("JPY")) {
				ans += money;
			} else {
				ans += money * 380000;
			}
		}
		System.out.println(ans);
	}

}
