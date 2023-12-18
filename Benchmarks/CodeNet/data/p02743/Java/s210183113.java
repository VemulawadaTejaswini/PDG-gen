import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		int num = c - a - b;
		//c < a + bならば絶対にNo
		if (num < 0)  { 
			System.out.print("No");
		} else {

			if(num * num > 4 * a * b) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
		}
	}
}
