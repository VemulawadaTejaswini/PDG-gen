import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			ans += Integer.valueOf(s.charAt(i) + "");
          if(ans >= 9) {
				ans %= 9;
			}
		}

		sc.close();
		System.out.println(ans == 0 ? "Yes" : "No");

	}
}

