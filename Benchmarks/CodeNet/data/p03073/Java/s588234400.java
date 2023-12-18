import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans0 = 0;
		int ans1 = 0;
		for (int i = 0; i < s.length(); i++) {
			int target = s.charAt(i)-'0';
			if ((target & 1)==0) {
				ans0++;
			}else {
				ans1++;
			}
		}
		System.out.println(Math.min(ans0, ans1));
	}

}


