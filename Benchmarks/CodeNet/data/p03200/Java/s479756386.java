import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int l = S.length();
		long ans = 0;
		long cnt = 0;
		for(int i = 0; i < l; i++) {
			char c1 = S.charAt(i);
			if(c1 == 'B') {
				cnt++;
			}else {
				ans += cnt;
			}
		}
		System.out.println(ans);
	}
}