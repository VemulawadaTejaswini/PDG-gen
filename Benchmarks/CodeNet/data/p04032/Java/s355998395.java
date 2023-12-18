import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();

		int start = -1;
		int end = -1;

		boolean found = false;
		for (int j = 2; j > 0 && !found; j--) {
			for (int i = 0; i < s.length() - j && !found; i++) {
				System.out.printf("%c %c\n", s.charAt(i), s.charAt(i+j));

				if (s.charAt(i) == s.charAt(i + j)) {
					found = true;
					start = i;
					end = i+j;
				}

			}
		}

		System.out.printf("%d %d\n", start, end);
    }
}