import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int zero = 0;
		int one = 0;
		for (char c : arr) {
			if (c == '0') {
				zero++;
			} else {
				one++;
			}
		}
		System.out.println(arr.length - (Math.max(zero, one) - Math.min(zero, one)));
	}
}
