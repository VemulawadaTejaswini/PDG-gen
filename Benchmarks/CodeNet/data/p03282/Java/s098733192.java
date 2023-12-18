import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		long K = scan.nextLong();
		scan.close();
		int l = S.length();
		int []num = new int[S.length()];
		for(int i = 0; i < l; i++) {
			num[i] = Integer.parseInt(S.substring(i, i + 1));
		}
//		long[]k = new long[S.length()];
		long sum = l;
		if(sum >= K) {
			int cnt1 = 0;
			for(int i = 0; i < l; i++) {
				if(num[i] == 1) {
					cnt1++;
				}else {
					break;
				}
			}
			if(cnt1 >= K) {
				System.out.println(1);
				System.exit(0);
			}
		}
		long cnt = 1;

		int ans = 0;
		for(int i = 0; i < l; i++) {
			if(num[i] != 1) {
				ans = num[i];
				break;
			}
		}
		System.out.println(ans);

	}
}