import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int cntA = 0;
		int cntB = 0;

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (i/2==0) {
				if (c!='0') {
					cntA++;
				} else {
					cntB++;
				}
			} else {
				if (c!='1') {
					cntA++;
				} else {
					cntB++;
				}
			}
		}
		System.out.println(Math.min(cntA, cntB));
	}
}
