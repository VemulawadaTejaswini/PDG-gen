import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		
		int a = 0;
		
		do {
			a = 0;
			for(int i = 2; i <= N; i++) {
				if(N % i == 0 && M % i == 0) {
					N /= i;
					M /= i;
					a = 1;
					break;
				}
			}
		} while(a == 1);
		
		int min = Math.min(S.length(), T.length());
		
		for(int i = 1; i <= min; i++) {
			if(N * i > S.length() - 1 || M * i > T.length() - 1) {
				break;
			}
			if(S.charAt(N * i) != T.charAt(M * i)) {
				System.out.println(-1);
				return;
			}
		}
		int max = Math.max(S.length(), T.length());
		for(int i = 1; i <= min; i++) {
			if(max * i % min == 0) {
				System.out.println(max * i);
				break;
			}
		}
	}
}
