import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		int cnt = 0;
		for(int i = 0; i < S.length(); i++) {
			String s = S.substring(i, i + 1);
			if(s.equals("o")) {
				cnt ++;
			}
		}
		int ans = 700 + 100 * cnt;
		System.out.println(ans);
	}
}