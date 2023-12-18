import java.util.Scanner;

// https://atcoder.jp/contests/abc142/tasks/abc142_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();


		int syo = N/2;

		if(N%2==0) {
			System.out.println((double)syo/N);
		}else {
			System.out.println((double)(syo+1)/N);
		}

	}

}
