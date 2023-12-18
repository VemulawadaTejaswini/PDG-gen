import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int black_1st=0;
		for (int i=0;i<N;i+=2) {
			if (S.charAt(i)=='1') {
				black_1st++;
			}
			if (i!=N-1) {
				if (S.charAt(i+1)=='0') {
					black_1st++;
				}
			}
		}
		System.out.println(Math.min(N-black_1st,black_1st));
	}
}