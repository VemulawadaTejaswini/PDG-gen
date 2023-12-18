import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		long n = sc1.nextLong();
		int[] time = new int[5];
		time[0] = sc1.nextInt();
		time[1] = sc1.nextInt();
		time[2] = sc1.nextInt();
		time[3] = sc1.nextInt();
		time[4] = sc1.nextInt();

		long ans = 0;
		long[] test = new long[6];
		test[0] = n;
		for (int i = 1 ; i < 5 ; i++ ) {
			test[i] = 0;
		}

		int idx = 0;
		for (int i=0; i < 4 ; i++) {
			if (time[idx] > time[i+1]) {
				idx = i+1;
			}
		}

		ans += 5 + (n / time[idx]);

		System.out.println(ans);

		sc1.close();

	}

}