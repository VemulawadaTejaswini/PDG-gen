import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] str = scn.nextLine().toCharArray();
		int N = str.length;
		int ans0 = 0, ans1 = 0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				if (str[i] == '0') {
					ans0++;
				} else {
					ans1++;
				}
			} else {
				if (str[i] == '1') {
					ans0++;
				} else {
					ans1++;
				}
			}
		}
		System.out.println(Math.min(ans0, ans1));
	}

}
