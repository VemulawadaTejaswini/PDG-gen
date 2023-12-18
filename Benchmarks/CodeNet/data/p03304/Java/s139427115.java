import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		double ans = 0;
		if(d == 0) {
			ans+=1;
		}else {


		for(int i = 1; i<= n; i++) {

			if(i-d >= 1) ans += (double)1/n;
			if(i+d <= n) ans += (double)1/n;
		}
		}
		ans *= m-1;
		ans /= n;
		System.out.println(ans);
	}

}
