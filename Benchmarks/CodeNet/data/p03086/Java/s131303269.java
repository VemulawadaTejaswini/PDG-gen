import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(j) == 'A' || s.charAt(j) == 'C' || s.charAt(j) == 'G' || s.charAt(j) == 'T') {
				} else {
					break;
				}
				if (max < j - i + 1) {
					max = j - i + 1;
				}
			}
		}
		System.out.println(max);
	}
}
