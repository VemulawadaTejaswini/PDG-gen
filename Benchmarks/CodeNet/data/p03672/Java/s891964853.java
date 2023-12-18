import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr = new int[26];
		int max = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			arr[s.charAt(i) - 'a']++;
			if (isEven(arr)) {
				max = i + 1;
			}
		}
		System.out.println(max);
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
