import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		String s = sc.next();
		int n = s.length() - 1;

		long ans = 0L;
		for (int i=0; i<Math.pow(2,n); i++) {

			//ビット全探索で文字列Sに"+"を挿入していく
			StringBuilder sb = new StringBuilder(s);
			for (int j=n-1; j>=0; j--) {
				if ((1&i>>j) == 1) {
					sb.insert(j+1,"+");
				}
			}

			//"+"入りの文字列をsplitして足し合わせる
			String[] ar = sb.toString().split("\\+",0);
			for (int j=0; j<ar.length; j++) {
				ans += Long.parseLong(ar[j]);
			}

		}

		System.out.println(ans);

	}
}