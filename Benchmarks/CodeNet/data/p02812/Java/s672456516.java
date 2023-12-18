import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int res = 0;
		for (int i = 0; i < N - 2; i++) {
			if (S.charAt(i) == 'A' && S.charAt(i + 1) == 'B' && S.charAt(i + 2) == 'C') {
				res++;
			}
		}
		System.out.print(res);
	}
}