import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		double B = scan.nextDouble();
		double ans = A*B;
		System.out.println((long)Math.floor(ans));
	}

}
