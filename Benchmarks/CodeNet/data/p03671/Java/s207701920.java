import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int sum1 = a + b;
		int sum2 = a + c;
		int sum3 = b + c;

		int[] sums = {sum1, sum2, sum3};
		int intMin = sums[0];

		for(int i = 0; i < sums.length; i++) {
			if (intMin > sums[i]) {
				intMin = sums[i];
			}
		}

		System.out.println(intMin);
	}

}