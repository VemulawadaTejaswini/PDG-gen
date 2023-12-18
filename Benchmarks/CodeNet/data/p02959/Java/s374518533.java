import java.util.Scanner;

// https://atcoder.jp/contests/abc135/tasks/abc135_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arrayA = new int[N+1];
		for(int i = 0;i<N+1;i++) {
			arrayA[i] = sc.nextInt();
		}

		int[] arrayB = new int[N];
		for(int i = 0;i<N;i++) {
			arrayB[i] = sc.nextInt();
		}
		sc.close();

		int ans = 0;
		for(int i=0;i<N;i++) {
			ans = ans + Math.min(arrayA[i], arrayB[i]) + Math.min(arrayA[i+1],arrayB[i] - Math.min(arrayA[i], arrayB[i]));
		}

		System.out.println(ans);


	}

}
