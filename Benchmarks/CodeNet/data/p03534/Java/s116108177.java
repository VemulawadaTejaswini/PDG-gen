import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int[] counts = new int[3];
		for (char c : arr) {
			counts[c - 'a']++;
		}
		Arrays.sort(counts);
		if (counts[2] - counts[0] > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
