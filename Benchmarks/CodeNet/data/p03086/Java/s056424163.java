import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int max = 0;
		int tmp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'C' || s.charAt(i) == 'G') {
				tmp++;
			} else {
				max = Math.max(max, tmp);
				tmp = 0;
			}
		}
		max = Math.max(tmp, max);
		System.out.println(max);
	}
}