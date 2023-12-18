import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		int[] counts = new int[3];
		for (char c : input) {
			counts[c - 'a']++;
		}
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int x : counts) {
			if (max < x) {
				max = x;
			}
			if (min < x) {
				min = x;
			}
		}
		if (max - min > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
