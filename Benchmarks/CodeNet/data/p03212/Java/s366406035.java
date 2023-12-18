import java.util.Scanner;

public class Main {
	static int cnt = 0,n;
	static String[] str = {"3" , "5", "7"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		n = sc.nextInt();
		solve("0");
		System.out.println(cnt);
	}
	private static void solve(String s) {
		if(Long.parseLong(s) > n) {
			return;
		}
		if(s.equals("0")) {
			s = "";
		}
		if(s.length() >= 3 && s.contains("3") && s.contains("5")&& s.contains("7")) {
			cnt++;
		}
		for(int i = 0; i < 3; i++) {
			solve(s + str[i]);
		}

	}
}
