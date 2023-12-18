import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		Main main = new Main();
		int ans=0;
		for (int i = A; i <= B; i++) {
			String s = Integer.toString(i);
			if (main.chkPalindrome(s)) {
				ans++;
			}
		}
		System.out.println(ans);

	}

	public boolean chkPalindrome(String string) {
		int len = string.length();
		int right = len - 1;
		int left = 0;
		while (true) {
			if (len % 2 == 0 && right < left) {
				break;
			} else if (len % 2 == 1 && right == left) {
				break;
			}
			if (string.charAt(left) != string.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
