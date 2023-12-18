import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		// ユークリッドの互除法
		long tmp = 0;
		if (A < B) {
			tmp = A;
			A = B;
			B = tmp;
		} // Aが常に大きい

		long r = -1;
		while (r != 0) {
			r = A % B;
			if (r == 0)
				break;
			else {
				A = B;
				B = r;
			}
		} // このときのBが２入力値の最大公約数

		long C = 1;
		Set<Long> memo = new HashSet<Long>();
		while (B >= C&&C<=Math.pow(10,6)) {
			if (C == 1) {
				memo.add(C);
				C++;
			} else {
				if (B % C == 0) {
					while(B % C == 0) {
						B = B / C;
					}
					memo.add(C);
				}
					C++;
			}
		}
		System.out.println(Math.max(memo.size(),2));
	}
}
