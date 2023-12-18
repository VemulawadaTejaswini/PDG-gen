import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int L = 0;
		int R = N;


		for (int i=0; i<M; i++) {
			int tmpL = sc.nextInt();
			int tmpR = sc.nextInt();

			L = Math.max(L, tmpL);
			R = Math.min(R, tmpR);

		}

		int ans = R-L+1;
		if (ans>0) System.out.println(ans);
		else System.out.println(0);

	}


}