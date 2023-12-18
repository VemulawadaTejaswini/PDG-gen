import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		int cnt = 0;
		while (str.contains("01") || str.contains("10")) {
			str = str.replaceFirst("01|10", "");
			cnt = cnt + 2;
		}
		System.out.println(cnt);
	}
}
