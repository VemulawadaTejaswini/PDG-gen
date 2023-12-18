import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int[] alphabetCnt = new int[26];
		for (int i = 0; i < 26; i++) {
			alphabetCnt[i] = 0;
		}

		for (int i = 0; i < s.length(); i++) {
			int alphabetIdx = (int) s.charAt(i) - 97;
			alphabetCnt[alphabetIdx] ++;
		}

		int cntOdd = 0;
		for (int i = 0; i < 26; i++) {
			if(alphabetCnt[i] % 2 == 1) {
				cntOdd++;
			}
		}

		int ans = cntOdd;
		if (ans == 0) {
			ans++;
		}
		System.out.print(ans);
	}

}
