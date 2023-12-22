import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long n = sc.nextInt();
		long finalresult = 0;

		for(int i = 1;i <= n;i++) {
			long result = (a * i / b) - (a * (i / b));
			finalresult = Math.max(finalresult, result);
		}
		System.out.println(finalresult);
	}

}
