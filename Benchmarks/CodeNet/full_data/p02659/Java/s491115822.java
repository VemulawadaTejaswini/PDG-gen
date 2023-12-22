
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		double B = scan.nextDouble();
		B = B*100.0;
		long ans = A*(long)B;
		ans = ans / 100L;
		System.out.println(ans);
	}

}
