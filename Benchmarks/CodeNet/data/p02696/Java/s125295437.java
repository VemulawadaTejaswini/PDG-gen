import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		long finalresult = 0;
			for(long i = 1;i <= n;i++) {
				long result = (a * i / b) - (a * (i / b));
				finalresult = Math.max(finalresult, result);
			}
			System.out.println(finalresult);
	}

}
