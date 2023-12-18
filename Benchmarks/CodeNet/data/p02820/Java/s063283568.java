import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		String[] TSplit = T.split("");
		boolean[] dup = new boolean[N];
		long res = 0;
		for (int i = 0; i < TSplit.length; i++) {
			if (i >= K && TSplit[i].equals(TSplit[i - K]) && !dup[i - K]) {
				dup[i] = true;
			}
			if (i < K || !dup[i]) {
				if ("r".equals(TSplit[i])) {
					res += P;
				} else if ("p".equals(TSplit[i])) {
					res += S;
				} else {
					res += R;
				}
			}
		}
		System.out.print(res);
	}
}