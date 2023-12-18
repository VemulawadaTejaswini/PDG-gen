import java.util.Scanner;

public class Main {
	static String S;

	public static void main(String[] args) {
		readInput();

		solve();
	}

	static void solve() {
		char[] c_array = S.toCharArray();
		
		long ans = 0;
		int[] sum = new int['z'- 'a' + 1];
		
		for(int idx = 0; idx < c_array.length; idx++) {
			sum[c_array[idx] - 'a']++;
		}
		
		int max = 1 << 26;
		for(int bit = 1; bit < max; bit++) {
			long tmp_ans = 1;
			
			for(int idx = 0; idx < 26; idx++) {
				if((bit & (1 << idx)) > 0) {
					tmp_ans = (tmp_ans * sum[idx]) % 1000000009;
				}
			}
			
			ans = (ans + tmp_ans) % 1000000009;
		}
		
		System.out.println(ans);
	}
	

	static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextLine();
			S = sc.nextLine();
		}
	}
}
