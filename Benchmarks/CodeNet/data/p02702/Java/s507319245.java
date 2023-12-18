import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int len = s.length();
		final int m = 2019;
		long[] modCnt = new long[m];

		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();

		long ans = 0;
		long x = 1;

		int tot=0;

		for (int i=1; i<=len; i++){
			modCnt[tot]++;
			tot += (s.charAt(i-1) - '0')  * x;
			tot %= m;
			ans += modCnt[tot];
			x = (x * 10) % m;
		}
		System.out.println(ans);
	}
}