import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		String S = in.next();
		int block = 1;
		char prev = S.charAt(0);
		for (int i = 1; i < S.length(); i++) {
			if(prev != S.charAt(i)) {
				block ++;
			}
			prev = S.charAt(i);
		}
		int unhappy = Math.max(1, block - 2*K);
		System.out.println(S.length()-unhappy);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}