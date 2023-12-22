import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] nam = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		String[] ng = { " ", ",", "." };
		int num[] = new int[26];
		char[] str = scan.nextLine().toCharArray();

		for (int i = 0; i < str.length; i++) {
			if (Arrays.asList(ng).contains(String.valueOf(str[i])))
				continue;
			for (int j = 0; j < nam.length; j++) {
				if(String.valueOf(str[i]).equals(nam[j])){
					num[j]++;
					continue;
				}
			}
		}
		for (int i = 0; i < nam.length; i++) {
			System.out.println(nam[i] + " : " + num[i]);
		}
	}
}