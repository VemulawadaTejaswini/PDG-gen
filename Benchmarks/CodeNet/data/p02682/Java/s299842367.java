import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_A = sc.nextInt();
		int input_B = sc.nextInt();
		int input_C = sc.nextInt();
		int input_K = sc.nextInt();
		sc.close();

		int sum = 0;

		if(input_K - input_A >= 0) {
			sum = input_A;
			input_K = input_K - (input_A + input_B);

			if(input_K > 0) {
				sum = sum - input_K;
			}

		}else {
			sum = input_K;
		}

		// 出力
		System.out.println(sum);

	}
}