import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String str;
		int tmp;
		int ans = 2000000000;
		for(int i = 0; i < S.length() - 2; i++) {
			str = S.substring(i, i+3);
			tmp = Math.abs(753 - Integer.parseInt(str));
			if(tmp < ans) {
				ans = tmp;
			}
		}
		System.out.println(ans);
	}

}
