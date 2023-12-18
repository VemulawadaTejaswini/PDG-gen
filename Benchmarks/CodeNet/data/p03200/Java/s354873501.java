import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int position = S.length() - 1;
		int ans = 0;
		for (int i = S.length() - 1; i >= 0; i--) {
			if(S.charAt(i) == 'B') {
				ans += position - i;
				position--;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
