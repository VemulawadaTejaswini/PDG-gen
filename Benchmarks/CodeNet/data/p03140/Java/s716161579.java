import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static String A = sc.next();
	static String B = sc.next();
	static String C = sc.next();
	public static void main(String[] args) {
//		System.out.println(N);
//		System.out.println(A);
//		System.out.println(B);
//		System.out.println(C);
		int ans = 2*N;
		for (int i = 0; i < N; i++) {
			if (A.charAt(i) == B.charAt(i) &&
					A.charAt(i) == C.charAt(i)) {
				ans -= 2;
			} else if (A.charAt(i) == B.charAt(i) ||
					A.charAt(i) == C.charAt(i) ||
				B.charAt(i) == C.charAt(i)) {
				ans -= 1;
			}
//			System.out.println(ans);
		}
		System.out.println(ans);
	}
}
