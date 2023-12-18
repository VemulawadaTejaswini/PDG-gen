import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] dam = new int[n];
		int[] mnt = new int[n];
		int all = 0;
		int temp = 0;

		for ( int i = 0; i < n; i++ ) {
			dam[i] = in.nextInt();
			all += dam[i];
			if ( i % 2 == 0 ) temp += dam[i] * 2;
		}

		// 2*(ダ0 + ダ2 + …) = all + 山0
		mnt[0] = temp - all;

		// 山0が決まれば後は順番に決まる
		for ( int i = 1; i < n; i++ ) {
			mnt[i] = dam[i - 1] * 2 - mnt[i - 1];
		}

		for ( int i : mnt ) System.out.print(i + " ");
		in.close();
	}
}
