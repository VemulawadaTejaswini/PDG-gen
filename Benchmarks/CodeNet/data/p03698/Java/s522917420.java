import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static boolean hasDuplcate(char[] arr) {
		int[] counts = new int['z'-'a'];
		Arrays.fill(counts, 0);
		for(char c: arr) {
			counts[c-'a']++;
			if(counts[c-'a']>1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(hasDuplcate(str.toCharArray()) ? "no" : "true");
	}
}
