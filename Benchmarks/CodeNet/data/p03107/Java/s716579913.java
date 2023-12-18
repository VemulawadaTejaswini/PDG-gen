import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		int cnt = str.length();
		while (str.contains("01") || str.contains("10")) {
			str = str.replaceAll("01|10", "");
		}
		System.out.println(cnt - str.length());
	}
}
