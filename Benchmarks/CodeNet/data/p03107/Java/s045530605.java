import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String str = sc.next();
		int zerocnt = 0, onecnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				zerocnt++;
			} else {
				onecnt++;
			}
		}
		System.out.println(2 * Math.min(zerocnt, onecnt));
	}
}
