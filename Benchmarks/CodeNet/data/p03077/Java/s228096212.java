import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		long n = sc1.nextLong();
		long[] time = new long[5];
		time[0] = sc1.nextLong();
		time[1] = sc1.nextLong();
		time[2] = sc1.nextLong();
		time[3] = sc1.nextLong();
		time[4] = sc1.nextLong();

		long ans = 0;
		int idx = 0;
		for (int i=0; i < 4 ; i++) {
			if (time[idx] > time[i+1]) {
				idx = i+1;
			}
		}

		if (n <= time[idx]) {
			ans = 5;
		}
		else {
			ans += 5 + (n / time[idx]);
		}

		System.out.println(ans);

		sc1.close();

	}

}