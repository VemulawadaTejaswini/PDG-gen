import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			arr[s.charAt(i) - 'a']--;
			if (isEven(arr)) {
				System.out.println(i);
              return;
			}
		}
	}
	
	static boolean isEven(int[] arr) {
		for (int x : arr) {
			if (x % 2 == 1) {
				return false;
			}
		}
		return true;
	}
}
