import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int point = sc.nextInt();
		int anser_C = sc.nextInt();

		int[] part = new int[N];
		//勝者の番号
		int winner = 0;
		//一時領域
		int stack = 0;
		//参加者に初期ポイントを付与
		for(int i = 0; i < N; i++) {
			part[i] = point;
		}
		//anser_C回ループ
		for(int i = 1; i <= anser_C; i++ ) {
			winner = sc.nextInt();
			//勝者のポイント維持領域
			stack = part[winner-1];

				for(int n = 0; n<N; n++) {
					part[n] -= 1;
				}

			part[winner-1] = stack;
		}
		for(int i = 0; i<N; i++) {
			if(part[i] <= 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}