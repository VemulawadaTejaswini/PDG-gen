import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		long[] array = new long[N];

		for(int i = 0; i < N; i++) {
			array[i] = scan.nextLong();
		}
		scan.close();

		long num = 0;
		long sum = 0;
		long mod = 1000000007;

		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				num = (array[i] * array[j]) % mod;
				sum = (sum + num) % mod;
			}
		}
		System.out.println(sum);

	}

}