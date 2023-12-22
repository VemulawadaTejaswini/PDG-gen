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
		for(int i=1;i<=input_K;i++) {
			if(i<=input_A) {
				sum++;
			}else if(i<input_A+input_B) {
				sum--;
			}
		}

		// 出力
		System.out.println(sum);

	}
}
