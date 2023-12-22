import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(sc.hasNext()) {
			String s = sc.next();
			if(palindrom(s)) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}
	static boolean palindrom(String s) {
		if(s.length() == 1) return true;
		for(int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
