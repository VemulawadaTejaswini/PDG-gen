import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) {
				char ans = 'a';
				ans += i;
				System.out.println(ans);
				return;
			}
		}
		System.out.println("None");
		in.close();
	}
}