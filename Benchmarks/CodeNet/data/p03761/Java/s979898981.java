import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] S = new String[n];
		int x = 0;
		
		for(int i = 0; i < n; i++) {
			S[i] = sc.next();
			if(i > 0 && S[i].length() < S[i - 1].length()) {
				x = i;
			}
		}
		
		String temp = S[0];
		S[0] = S[x];
		S[x] = temp;
		String ans = "";
		
		for(int i = 0; i < S[0].length(); i++) {
			int count = 0;
			for(int j = 1; j < n; j++) {
				int y = S[j].indexOf(S[0].substring(i, i + 1));
				if(y >= 0) {
					S[j] = S[j].substring(0, y) + S[j].substring(y + 1, S[j].length());
					count++;
				}

			}
			if(count == n - 1) {
				ans += S[0].substring(i, i + 1);
			}
		}

		String[] ans1 = ans.split("");
		Arrays.sort(ans1);
		for(String i : ans1) {
			System.out.print(i);
		}
	}
}
