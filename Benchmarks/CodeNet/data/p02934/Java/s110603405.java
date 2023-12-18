import java.util.Scanner;

// https://atcoder.jp/contests/abc138/tasks/abc138_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arrayA = new int[N];
		for(int i=0;i<arrayA.length;i++) {
			arrayA[i] = sc.nextInt();
		}
		sc.close();


		double seki = 1.0;
		for(int a:arrayA) {
			seki = seki * a;
		}

		double wa = 0.0;
		for(int i=0;i<arrayA.length;i++) {
			wa = seki/arrayA[i] + wa;
		}

		System.out.println(seki/wa);

	}
}
