import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sum = 0.0;

		// 入力を受け取る
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			sum += 1.0 / scan.nextDouble();
		}

		System.out.println(1.0 / sum);

	}
}
