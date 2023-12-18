import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		String S = sc.next();
		String T = sc.next();
		
		int a = 0;
		
		do {
			a = 0;
			for(long i = 2; i <= N; i++) {
				if(N % i == 0 && M % i == 0) {
					N /= i;
					M /= i;
					a = 1;
					break;
				}
			}
		} while(a == 1);
		
		long min = Math.min(S.length(), T.length());
		
		for(int i = 1; i <= min; i++) {
			if(N * i > S.length() - 1 || M * i > T.length() - 1) {
				break;
			}
			if(S.charAt((int)N * i) != T.charAt((int)M * i)) {
				System.out.println(-1);
				return;
			}
		}
		long max = Math.max(S.length(), T.length());
		for(long i = 1; i <= min; i++) {
			if(max * i % min == 0) {
				System.out.println(max * i);
				break;
			}
		}
	}
}
