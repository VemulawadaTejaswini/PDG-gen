import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		boolean[] isAc = new boolean[100001];
		Arrays.fill(isAc, false);
		int ac = 0;
		int wa = 0;

		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if (isAc[p]) continue;
			if (s.equals("WA")) wa++;
			else {
				ac++;
				isAc[p] = true;
			}
		}
		System.out.println(ac+" "+wa);
	}
}