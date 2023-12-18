import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int cnt = 0;
		for(int i = 0; i < N; ++i) {
			for(int a = 0; a < A; a++) {
				cnt++;
				if(i+a == N - 1) break;
			}
			i = i - 1 + A + B;
		}
		System.out.println(cnt);
	}

}
