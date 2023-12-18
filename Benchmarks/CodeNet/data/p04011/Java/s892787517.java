import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//値の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		//合計金額
		int sum = 0;
		//条件分岐
		if(N <= K) {
			for(int i = 1; i <= N; i++) {
				sum += X;
			}
		}else {
			for(int i = 1; i <= K; i++) {
				sum += X;
			}
			for(int i = K+1; i <= N; i++) {
				sum += Y;
			}
		}
		System.out.println(sum);
	}

}
