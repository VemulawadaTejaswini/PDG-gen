import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			l--;
			int r = sc.nextInt();
			
			String sub = s.substring(l, r);
			int len = sub.length();
			
			sub = sub.replaceAll("AC", "");
			
			int ans = (len - sub.length()) / 2;
			
			System.out.println(ans);
		}
		
	}
}
