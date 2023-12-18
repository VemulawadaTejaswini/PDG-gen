
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int min = 100;

		for(int i = 1;i<=(N/2);i++) {
			int sum;
			sum = getDigitSum(N-i)+getDigitSum(i);
			if(min>sum) {
				min=sum;
			}
		}

		System.out.println(min);

	}

	private static int getDigitSum(int x) {
		int s =0;
		for(int i = 0;x != 0;i++) {
			s += x%10;
			x /=10;
		}
		return s;
	}

}
