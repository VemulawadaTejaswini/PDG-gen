import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		int N = sc.nextInt();
		
		// 1/Aiの計算
		double sum = 0;
		for (int i = 0; i < N; i++) {
			double a = sc.nextDouble();
			sum += 1/a;
		}
		
		System.out.println(1/sum);
		
		sc.close();
	}

}
