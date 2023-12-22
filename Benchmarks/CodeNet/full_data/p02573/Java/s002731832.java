import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_D
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int N = sc.nextInt();
		int M = sc.nextInt();

		int FriendList[][] = new int[N+1][N+1];

		for(int i=1; i<N+1; i++) {
			Arrays.fill(FriendList[i], 0);
		}

		for(int i=0; i<M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			FriendList[A][B] = 1;
			FriendList[B][A] = 1;

			for(int j=1; j<N+1; j++) {
				int isFriend = Math.max(FriendList[A][j], FriendList[B][j]);
				FriendList[A][j] = isFriend;
				FriendList[B][j] = isFriend;
			}
		}

		for(int i=1; i<N+1; i++) {
			int cnt = 0;
			for(int j=1; j<N+1; j++) {
				cnt += FriendList[i][j];
			}
			if(ans < cnt) {
				ans = cnt;
			}
		}

		System.out.println(ans);

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
