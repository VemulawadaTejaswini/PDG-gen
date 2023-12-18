import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		String  s = scan.next();
		int ans = 0;
		int test = s.length();
		
		for(int i = 0; i < s.length() + 1; i++) {
			for(int j = i + 3; j < s.length() + 1; j ++) {
				String num = s.substring(i, j);
				if(Long.parseLong(num) % 2019 == 0) {
					ans++;
				}
			}
		}

		System.out.println(ans);
	}
}