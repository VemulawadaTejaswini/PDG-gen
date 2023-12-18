import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		long ans = 0;
		for(int mask = 0 ; mask < 1<<(n - 1) ; mask++) {
			String temp = "";
			for(int i = 0 ; i < n ; i++) {
				if(i != n - 1 && (mask&(1<<i)) >= 1) {
					temp += s.charAt(i) + "+";
				} else {
					temp += s.charAt(i);
				}
			}
			String[] split = temp.split("\\+");
			long ret = 0;
			for(int i = 0 ; i < split.length ; i++) {
				ret += Long.valueOf(split[i]);
			}
			ans += ret;
		}
		System.out.println(ans);
	}
}
