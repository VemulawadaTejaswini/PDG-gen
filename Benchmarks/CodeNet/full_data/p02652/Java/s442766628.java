import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				// より最大が見つかったら
				int ans1 = calcAns(s.substring(i, j));
				if (ans < ans1) {
					ans = ans1;
				}
			}
		}
		System.out.println(ans);
	}

	private static int calcAns(String s) {
		int count0 = 0;
		int count1 = 0;
		int countHatena = 0;
		for (char x : s.toCharArray()) {
			if ('0' == x)
				count0++;
			else if ('1' == x)
				count1++;
			else
				countHatena++;
		}
		int ans = 0;
		if (countHatena == 0) {
			ans = Math.abs(count1 - count0);
		} else if (count0 < count1) {
			if (countHatena >= count1 - count0) {
				count0 += (count1 - count0);
				countHatena = (count1 - count0) / 2;
				if (countHatena % 2 != 0) {
					ans = 1;
				}
			} else {
				count0 += countHatena;
				ans = Math.abs(count1 - count0);
			}
		} else if (count0 > count1) {
			if (countHatena >= count0 - count1) {
				count1 += (count0 - count1);
				countHatena = (count0 - count1) / 2;
				if (countHatena % 2 != 0) {
					ans = 1;
				}
			} else {
				count1 += countHatena;
				ans = Math.abs(count0 - count1);
			}
		} else {
			if (countHatena == 0 || countHatena % 2 != 0) {
				ans = 1;
			}
		}
		if (ans == 1)
			System.out.println(s);
		return ans;
	}
}