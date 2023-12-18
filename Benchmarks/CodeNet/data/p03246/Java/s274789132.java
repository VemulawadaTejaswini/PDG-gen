import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//配列vの奇数行・偶数行を2つの配列a,bに分ける。(O(N))

		//a,bそれぞれについて、値が出現した回数を配列s,tでカウントする。(O(2 * 10^5))
		int[] s = new int[100_005];
		int[] t = new int[100_005];

		for (int i = 0; i < n / 2; i++) {
			s[sc.nextInt()]++;
			t[sc.nextInt()]++;
		}

		//ans = n - (sの最大値) - (tの最大値) (O(2 * 10^5))
		int ms = 0;
	    int mt = 0;
	    int sms = 1;
		int smt = 1;

	    int ma = 0;
	    int mb = 0;
		for (int i = 0 ; i < 100_005; i++) {
			if (s[i] >= ms) {
				sms = ms;
				ms = s[i];

				ma = i;
			}
			if (t[i] >= mt) {
				smt = mt;
				mt = t[i];

				mb = i;
			}
		}

		//ms,mtをとるiの値が一致するとき、sとtのセカンドmaxをms,mtとして、
		//最小化のansを求める。
		int ans = 0;
		if (ma != mb) {
			ans = n - ms - mt;
		} else {
			ans = Math.min(n - ms - smt, n - sms - mt);
		}

		System.out.println(ans);

	}

}
