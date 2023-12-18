import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		char a[] = new char[N];

		int min = Integer.MAX_VALUE;
		for (int j = 0; j < N; j++) {
			int cnt = 0;
			for (int i = 0; i < j; i++) {
				a[i] = S.charAt(i);
				if (a[i] =='#') {
					cnt++;
				}
			}
			for (int i = j; i < N; i++) {
				a[i] = S.charAt(i);
				if (a[i] =='.') {
					cnt++;
				}
			}
			min = Math.min(cnt, min);
		}
		System.out.println(min);
	}
}
