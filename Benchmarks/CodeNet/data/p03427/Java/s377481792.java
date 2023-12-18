import java.util.Scanner;

public class MainA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long ans = 0;
		for(int i = 0 ; i < s.length() - 1 ; i++) {
			if(s.charAt(i) != '9') {
				long temp = Long.valueOf(s);
				long math = Long.valueOf((s.substring(0 + i + 1))) + 1;
				ans = Math.max(ans, func(temp - math));
			}
		}
		ans = Math.max(ans, func(Long.valueOf(s) - Long.valueOf(s) % 10 - 1));
		ans = Math.max(ans, func(Long.valueOf(s)));
		System.out.println(ans);
	}

	public static long func(long x) {
		long wa = 0;
		while(x >= 1) {
			wa += x % 10;
			x = x / 10;
		}
		return wa;
	}

}
